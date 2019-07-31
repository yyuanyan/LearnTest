package com.yy.test;

import com.yy.model.Student;
import com.yy.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyuanyan
 * @create 2019 - 07 - 31 - 10:36
 */
public class Lesson06 {
    @Test

    public void test01() throws Exception{

        ApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");
        Student student = (Student) context.getBean("stu");
        System.out.println(student);

    }
}
