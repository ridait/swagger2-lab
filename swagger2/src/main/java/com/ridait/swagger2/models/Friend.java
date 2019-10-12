package com.ridait.swagger2.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about Friend model")
public class Friend {

    @ApiModelProperty(notes = "the id property")
    private String id;
    @ApiModelProperty(notes = "the full name property")
    private String fullName;
    @ApiModelProperty(notes = "the phone number")
    private String phoneNumber;
    @ApiModelProperty(notes = "the email")
    private String email;

    public Friend(){
        //needed
    }
    public Friend(String id, String fullName, String phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
