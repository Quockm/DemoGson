package com.example.demogson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

    //    @SerializedName("first_name")
//    private String mFirstName;
//    @SerializedName("age")
//    private int mAge;
//    @SerializedName("mail")
//    private String mMail;
//    @SerializedName("address")
//    private Address mAddress;
//    @SerializedName("family")
//    private List<FamilyMembers> mFamily;
//    public Employee(String firstName, int age, String mail, Address address, List<FamilyMembers> family) {
//        mFirstName = firstName;
//        mAge = age;
//        mMail = mail;
//        mAddress = address;
//        mFamily = family;
//    }

public class Employee {
    @Expose
    private String firstName;
    @Expose(serialize = false)
    private int age;
    @Expose(deserialize = false)
    private String mail;
    private String password;

    public Employee(String firstName, int age, String mail, String password) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        this.password = password;
    }
}
