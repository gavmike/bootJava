package ru.javaops.bootjava.web;

import org.hibernate.tool.schema.ast.SqlScriptParserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javaops.bootjava.model.User;
import ru.javaops.bootjava.repository.UserRepository;

import java.util.List;

@Service
public class ExapleService {

   @Autowired
    UserRepository userRepository;
    

    public void method1()  {

        //do something ...

        method2();

        //do something ...
    }

    @Transactional()
    public void method2() {
        List<User> all = userRepository.findAll();


        System.out.println("all before" + userRepository.findAll());

        userRepository.deleteAll();
        for (int i = 0; i <10000000 ; i++) {
            double b= i;
            Math.sin(b);

        }
        System.out.println("delete all");
        System.out.println(userRepository.findAll().size());
    throw new SqlScriptParserException("dd");



        // System.out.println("________________________________");
       // System.out.println("size = "+userRepository.findAll().size());


       // System.out.println(userRepository.findAll());

        //all code in transactional

    }

    public void incr(Integer a) {
        a++;
        System.out.println(a);
    }
}
