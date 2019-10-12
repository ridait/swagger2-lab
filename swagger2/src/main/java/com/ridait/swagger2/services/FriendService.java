package com.ridait.swagger2.services;

import com.ridait.swagger2.models.Friend;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class FriendService {

    private ConcurrentMap<String, Friend> friends = new ConcurrentHashMap<>();

    public List<Friend> getFriends(){
        return new ArrayList<>(friends.values());
    }

    public Friend getFriendById(String friendId){
        return friends.getOrDefault(friendId,null);
    }

    public Friend addFrind(Friend newFriend){
        friends.put(newFriend.getId(),newFriend);
        return newFriend;
    }


}
