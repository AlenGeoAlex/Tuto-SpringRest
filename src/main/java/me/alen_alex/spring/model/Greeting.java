package me.alen_alex.spring.model;

import com.google.gson.Gson;

public class Greeting {

    private final int id;
    private final String userName;
    private static final Gson gson = new Gson();

    public Greeting(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String toJson(){
        return gson.toJson(toJson());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Greeting)) return false;

        Greeting greeting = (Greeting) o;

        if (id != greeting.id) return false;
        return userName != null ? userName.equals(greeting.userName) : greeting.userName == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
