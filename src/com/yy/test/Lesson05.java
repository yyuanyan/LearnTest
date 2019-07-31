package com.yy.test;

import com.yy.model.User;
import com.yy.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @author yyuanyan
 * @create 2019 - 07 - 31 - 10:36
 */
public class Lesson05  {
    @Test
    /*Bean的生命周期

     */
    public void test01() throws Exception{

        ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);

        //关闭容器
        context.getClass().getMethod("close").invoke(context);

    }
}
