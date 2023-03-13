package com.notepet;
import java.util.*;
public class PassBean {
    private String username;
    private String password1;
    public PassBean(){
        username="";
        password1="";
    }
    public String getUsername(){
        return username;
    }
    public String getPassword1(){
        return password1;
    }
    public void setUsername(String name){
        username=name;
    }
    public void setPassword1(String passw){
        password1=passw;
    }
}