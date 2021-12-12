package me.alen_alex.spring;

import me.alen_alex.spring.exception.EmptyException;
import me.alen_alex.spring.model.Greeting;
import me.alen_alex.spring.model.UserData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class DataManager {

    private transient static final HashMap<String, UserData> dataList = new HashMap<String ,UserData>(
    );

    public DataManager() {
        dataList.put("Alen",new UserData("alen", UUID.randomUUID(),new Greeting(1,"Alen")));
        dataList.put("Alen2",new UserData("alen2", UUID.randomUUID(),new Greeting(2,"Alen2")));
        dataList.put("Alen3",new UserData("alen3", UUID.randomUUID(),new Greeting(3,"Alen3")));
        dataList.put("Alen4",new UserData("alen4", UUID.randomUUID(),new Greeting(4,"Alen4")));
    }

    public static List<UserData> getAllUser(){
        if(dataList.isEmpty())
            throw new EmptyException("No user data has been found");

        return new ArrayList<>(dataList.values());
    }

    public static UserData getUserByName(String name){
        return dataList.get(name);
    }

    public static boolean putUser(){
        return true;
    }

}
