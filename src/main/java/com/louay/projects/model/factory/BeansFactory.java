package com.louay.projects.model.factory;


import com.louay.projects.model.chains.communications.AccountComments;
import com.louay.projects.model.chains.communications.AccountMessage;
import com.louay.projects.model.chains.communications.AccountPicture;
import com.louay.projects.model.chains.communications.group.GroupComments;
import com.louay.projects.model.chains.communications.group.GroupPicture;
import com.louay.projects.model.chains.groups.GroupsDetail;
import com.louay.projects.model.chains.member.FriendRequest;
import com.louay.projects.model.chains.member.UserFriend;
import com.louay.projects.model.chains.member.group.GroupInvite;
import com.louay.projects.model.chains.member.group.GroupMembers;
import com.louay.projects.model.chains.member.group.GroupRequest;
import com.louay.projects.model.chains.users.Users;
import com.louay.projects.model.chains.users.activity.AccountStatus;
import com.louay.projects.model.chains.users.activity.SignInDate;
import com.louay.projects.model.util.pool.ConnectionWrapper;
import com.louay.projects.model.util.pool.DBConnectionConfig;
import com.louay.projects.model.util.queue.MyList;
import com.louay.projects.model.util.queue.MyQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Blob;
import java.util.*;


@Configuration
public class BeansFactory {

    @Bean(name = "queue")
    @Scope("prototype")
    public MyList<ConnectionWrapper> getMyQueue() {
        return new MyQueue<>(10);
    }

    @Bean(name = "dbConfig")
    @Scope("prototype")
    public DBConnectionConfig getConnectionConfig() {
        DBConnectionConfig db = new DBConnectionConfig();
        db.setDriver("jdbc:mysql");
        db.setHost("localhost");
        db.setPort("3306");
        db.setSchema("chatting_system");
        db.setUsername("root");
        db.setPassword("1729384#General");
        return db;
    }

    @Bean(name = "usersContainer")
    @Scope("prototype")
    public Collection<Users> getUsersContainer(){
        return new HashSet<>();
    }

    @Bean(name = "statusContainer")
    @Scope("prototype")
    public Collection<AccountStatus> getStatusContainer(){
        return new HashSet<>();
    }

    @Bean(name = "signInDateContainer")
    @Scope("prototype")
    public Map<Long, SignInDate> getSignInDateContainer(){
        return new LinkedHashMap<>();
    }

    @Bean(name = "userFriendsContainer")
    @Scope("prototype")
    public Map<Long ,UserFriend> getUserFriendsContainer(){
        return new LinkedHashMap<>();
    }

    @Bean(name = "userRequestContainer")
    @Scope("prototype")
    public Map<Long, FriendRequest> getUserRequestContainer(){
        return new LinkedHashMap<>();
    }

    @Bean(name = "accountPictureContainer")
    @Scope("prototype")
    public Collection<AccountPicture> getAccountPictureContainer(){
        return new LinkedHashSet<>();
    }

    @Bean(name = "accountMessageContainer")
    @Scope("prototype")
    public Collection<AccountMessage> getAccountMessageContainer(){
        return new LinkedHashSet<>();
    }

    @Bean(name = "accountCommentContainer")
    @Scope("prototype")
    public Collection<AccountComments> getAccountCommentContainer(){
        return new LinkedHashSet<>();
    }

    @Bean(name = "groupInviteContainer")
    @Scope("prototype")
    public Map<Long, GroupInvite> getGroupInviteContainer(){
        return new LinkedHashMap<>();
    }

    @Bean(name = "groupMembersContainer")
    @Scope("prototype")
    public Map<Long, GroupMembers> getGroupMembersContainer(){
        return new LinkedHashMap<>();
    }

    @Bean(name = "groupRequestContainer")
    @Scope("prototype")
    public Map<Long, GroupRequest> getGroupRequestContainer(){
        return new LinkedHashMap<>();
    }

    @Bean(name = "groupDetailContainer")
    @Scope("prototype")
    public Collection<GroupsDetail> getGroupDetailContainer(){
        return new HashSet<>();
    }

    @Bean(name = "groupCommentContainer")
    @Scope("prototype")
    public Collection<GroupComments> getGroupCommentContainer(){
        return new LinkedHashSet<>();
    }

    @Bean(name = "groupPictureContainer")
    @Scope("prototype")
    public Collection<GroupPicture> getGroupPictureContainer(){
        return new LinkedHashSet<>();
    }








}
