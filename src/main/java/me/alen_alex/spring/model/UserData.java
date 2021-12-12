package me.alen_alex.spring.model;

import java.util.HashMap;
import java.util.UUID;

public class UserData {

    private final String user_name;
    private final UUID id;
    private final Greeting greeting;


    public UserData(String user_name, UUID id, Greeting greeting) {
        this.user_name = user_name;
        this.id = id;
        this.greeting = greeting;
    }

    public String getUser_name() {
        return user_name;
    }

    public UUID getId() {
        return id;
    }

    public Greeting getGreeting() {
        return greeting;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "user_name='" + user_name + '\'' +
                ", id=" + id +
                ", greeting=" + greeting +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserData)) return false;

        UserData userData = (UserData) o;

        if (user_name != null ? !user_name.equals(userData.user_name) : userData.user_name != null) return false;
        if (id != null ? !id.equals(userData.id) : userData.id != null) return false;
        return greeting != null ? greeting.equals(userData.greeting) : userData.greeting == null;
    }

    @Override
    public int hashCode() {
        int result = user_name != null ? user_name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (greeting != null ? greeting.hashCode() : 0);
        return result;
    }
}
