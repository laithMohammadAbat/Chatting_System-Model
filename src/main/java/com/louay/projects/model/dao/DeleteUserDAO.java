package com.louay.projects.model.dao;

import com.louay.projects.model.chains.communications.Post;
import com.louay.projects.model.chains.communications.account.AccountMessage;
import com.louay.projects.model.chains.member.Member;
import com.louay.projects.model.chains.member.Request;
import com.louay.projects.model.chains.accounts.Users;
import com.louay.projects.model.chains.accounts.activity.AccountStatus;
import com.louay.projects.model.chains.accounts.activity.SignInDate;

public interface DeleteUserDAO {

    int deleteAccountByUsername(Users user);

    int deleteAccountDetailByUsername(Users user);

    int deleteAccountTextPostByIdPost(Post post);

    int deleteAccountImgPostByIdPost(Post post);

    int deleteAccountMessageByIdMessage(AccountMessage message);

    int deleteAccountPictureByUsername(Users picture);

    int deleteAccountStatusByUsername(AccountStatus status);

    int deleteSignInDateByUsername(SignInDate signInDate);

    int deleteSignInDateByUsernameAndDate(SignInDate signInDate);

    int deleteFriendRequestBySenderAndReceiver(Request request);

    int deleteFriendRequestBySenderAndDate(Request request);

    int deleteFriendRequestByReceiverAndDate(Request request);

    int deleteUserFriendByUsernameAndFriend(Member friend);

    int deleteUserFriendByUsernameAndDate(Member friend);

    int deleteUserFriendByFriendAndDate(Member friend);

}
