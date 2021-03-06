package com.louay.projects.model.chains.accounts;

import com.louay.projects.model.chains.accounts.constant.AccountClassName;
import com.louay.projects.model.chains.accounts.constant.AccountType;
import com.louay.projects.model.chains.accounts.constant.UserType;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

@Configuration
@Component
@Scope("prototype")
public class Client extends Users {
    private String firstName;
    private String lastName;
    private java.sql.Date birthday;
    private String age;
    private String gender;
    private String telephone;
    private String email;
    private String country;
    private String state;
    private String address;

    public Client() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAgeFromBirthday(){
        LocalDate birthday = this.birthday.toLocalDate();
        LocalDate now = LocalDate.now();
        int year = birthday.until(now).getYears();
        int month = birthday.until(now).getMonths();
        int day = birthday.until(now).getDays();
        return String.format("%d day, %d month, %d year",day, month, year);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.USER;
    }

    @Override
    public UserType getUserType() {
        return UserType.CLIENT;
    }

    @Override
    public AccountClassName getAccountClassName() {
        return AccountClassName.CLIENT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return getFirstName().compareTo(client.getFirstName()) == 0 &&
                getLastName().compareTo(client.getLastName()) == 0 &&
                getBirthday().compareTo(client.getBirthday()) == 0 &&
                getAge().compareTo(client.getAge()) == 0 &&
                getGender().compareTo(client.getGender()) == 0 &&
                getTelephone().compareTo(client.getTelephone()) == 0 &&
                getEmail().compareTo(client.getEmail()) == 0 &&
                getCountry().compareTo(client.getCountry()) == 0 &&
                getState().compareTo(client.getState()) == 0 &&
                getAddress().compareTo(client.getAddress()) == 0 ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFirstName(), getLastName(), getBirthday(), getAge(), getGender(), getTelephone(), getEmail(), getCountry(), getState(), getAddress());
    }

    @Override
    public String toString() {
        return super.toString()+", Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
