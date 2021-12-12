package me.alen_alex.spring;

import me.alen_alex.spring.exception.EmptyException;
import me.alen_alex.spring.model.Greeting;
import me.alen_alex.spring.model.UserData;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello %s!";
    private final AtomicInteger counter = new AtomicInteger();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(),String.format(TEMPLATE,name));
    }

    @GetMapping("/users")
    public List<UserData> getAll(){
        return DataManager.getAllUser();
    }

    @GetMapping("/user/{name}")
    public UserData getDataByName(@PathVariable String name){
        if(name == null || name.isBlank())
            throw new EmptyException("The name is null");

        return DataManager.getUserByName(name);
    }

    @GetMapping("/user")
    public UserData filterDataByUUID(@RequestParam(value = "name",defaultValue = "blank") String name){
        System.out.println(name);
        if(name == null || name.isBlank())
            throw new EmptyException("The name is null");

        return DataManager.getUserByName(name);
    }



}
