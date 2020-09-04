package com.example.demogson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Gson gson = new Gson();

//        Address address = new Address("Germany", "Berlin");
//
//        List<FamilyMembers> family = new ArrayList<>();
//        family.add(new FamilyMembers("Wife", 30));
//        family.add(new FamilyMembers("Daughter", 5));
//
//        Employee employee = new Employee("John", 30, "john@gmail.com", address, family);
//        String json = gson.toJson(family);
//        Employee employee = new Employee("John", 30, "john@gmail.com", address, family);
//        String json = gson.toJson(employee);
//        String json = "{\"address\":{\"city\":\"Berlin\",\"country\":\"Germany\"},\"age\":30,\"first_name\":\"John\",\"mail\":\"john@gmail.com\"}";
//        Employee employee = gson.fromJson(json, Employee.class);
//        String json = "[{\"age\":30,\"role\":\"Wife\"},{\"age\":5,\"role\":\"Daughter\"}]";
////        FamilyMembers[] familyMembers = new Gson().fromJson(json,FamilyMembers[].class);
//        Type familyType = new TypeToken<ArrayList<FamilyMembers>>() {}.getType();
//        ArrayList<FamilyMembers> family = gson.fromJson(json, familyType);
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Employee employee = new Employee(
                "John",
                30,
                "john@mail.com",
                "fdfarg2"
        );
        String jsonResult = gson.toJson(employee);
        String json = "{\"age\":30,\"firstName\":\"John\",\"mail\":\"john@mail.com\",\"password\":\"fdfarg2\"}";
        Employee employee1 = gson.fromJson(json, Employee.class);
    }


}