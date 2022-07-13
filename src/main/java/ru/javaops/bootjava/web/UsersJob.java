package ru.javaops.bootjava.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersJob {

    @Autowired
    ExapleService exapleService;

    public void method() {
        exapleService.method2();
    }

}
