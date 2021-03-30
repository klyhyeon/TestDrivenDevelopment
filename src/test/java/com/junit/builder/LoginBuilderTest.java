package com.junit.builder;

import com.junit.domain.Login;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class LoginBuilderTest {

    @Test
    public void builderTest() {
        Login login = new LoginBuilder()
                        .withEmail("baekho@gmail.com")
                        .withPassword("1234")
                        .build();
        assertEquals(login.getEmail(), "baekho@gmail.com");
    }

}