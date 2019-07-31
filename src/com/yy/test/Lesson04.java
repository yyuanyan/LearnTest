package com.yy.test;

import com.yy.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyuanyan
 * @create 2019 - 07 - 31 - 10:36
 */
public class Lesson04 {
    @Test
    public void test01(){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");

        IUserService user1 = (IUserService) context.getBean("userservice1");
        IUserService user2 = (IUserService) context.getBean("userservice2");
        System.out.println(user1);
        System.out.println(user2);


    }
}
