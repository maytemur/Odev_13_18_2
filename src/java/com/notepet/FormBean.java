package com.notepet;
import java.util.*;
public class FormBean {
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private Hashtable errors;
    public boolean onay(){
        boolean allOk=true;
        if(username.equals("")){
            errors.put("username","Lutfen Kulanýcý adýnýzý(username) giriniz!");
            username="";
            allOk=false;
        }        
        if(password.equals("")){
            errors.put("password","Lutfen password giriniz!");
            password="";
            allOk=false;
        }
        if(name.equals("")){
            errors.put("name","Lutfen name giriniz!");
            name="";
            allOk=false;
        }
        if(surname.equals("")){
            errors.put("surname","Lutfen surname giriniz!");
            name="";
            allOk=false;
        }
        if (email.equals("") || (email.indexOf('@') == -1)) {
            errors.put("email","Lutfen gecerli bir Email adresi giriniz");
            email="";
            allOk=false;
        }
        return allOk;
    }
    public String getErrorMsg(String s) {
        String errorMsg =(String)errors.get(s.trim());
        return (errorMsg == null) ? "":errorMsg;
    }
    /** Creates a new instance of OnayBean */
    public FormBean() {
        username="";
        password="";
        name="";
        surname="";
        email="";
        errors=new Hashtable();
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getEmail(){
        return email;
    }
    public void setUsername(String uname){
        username=uname;
    }
    public void setPassword(String pword){
        password=pword;
    }
    public void setName(String nm){
        name=nm;
    }
    public void setSurname(String sn){
        surname=sn;
    }
    public void setEmail(String em){
        email=em;
    }
    public void setErrors(String key, String msg) {
        errors.put(key,msg);
    }
}