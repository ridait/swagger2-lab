package com.ridait.swagger2.resources;

import com.ridait.swagger2.models.Friend;
import com.ridait.swagger2.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FriendsResource {

    @Autowired
    private FriendService friendService;


    @GetMapping
    public List<Friend> getAllFrinds(){
        return friendService.getFriends();
    }

    @GetMapping("/{friendId}")
    public Friend getFriend(@PathVariable String friendId){
        return friendService.getFriendById(friendId);
    }

    @PostMapping
    public Friend addFriend(@RequestBody Friend friend){
        return friendService.addFrind(friend);
    }



}
