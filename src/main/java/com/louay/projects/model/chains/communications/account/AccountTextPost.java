package com.louay.projects.model.chains.communications.account;

import com.louay.projects.model.chains.communications.Post;
import com.louay.projects.model.chains.communications.constant.PostClassName;
import com.louay.projects.model.chains.communications.constant.PostType;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Configuration
@Component
@Scope("prototype")
public class AccountTextPost extends Post {
    private StringBuilder post;

    public AccountTextPost() {
    }

    public StringBuilder getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = new StringBuilder(post);
    }

    public void setPostStringBuilder(StringBuilder post){
        this.post = new StringBuilder(post);
    }

    public void setEditPost(StringBuilder post){
        this.post.delete(0, this.post.length());
        this.post.append(post);
    }

    @Override
    public PostType getType() {
        return PostType.TEXT_POST;
    }

    @Override
    public PostClassName getClassName() {
        return PostClassName.ACCOUNT_TEX_POST;
    }

    @Override
    public String toString() {
        return super.toString()+", AccountTextPost{" +
                "post=" + post +
                '}';
    }
}
