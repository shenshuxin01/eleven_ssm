package ssx.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class POJOL implements Serializable {

    @JsonProperty("p_userid")
    private int userId;

    @JsonProperty("p_username")
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public POJOL(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public POJOL() {
    }
}
