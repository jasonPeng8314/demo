package com.example.demo;

import com.example.demo.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

    private User user;

    @BeforeEach
    public void setup(){
        user = User.builder().name("Jason").mobile("0912345678").build();
    }

    @Test
    public void validateUserName(){
        String expected = "Jason";
        String actual = user.getName();
        Assertions.assertEquals(expected,actual);
    }

    @Test public void validateUserMobile() {
        String expected = "0912345678";
        String actual = user.getMobile();
        Assertions.assertEquals(expected,actual);
    }
}
