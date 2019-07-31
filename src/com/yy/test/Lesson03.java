package com.yy.test;

import com.yy.service.IUserService;
import com.yy.service.UserServiceFactory;
import com.yy.service.UserServiceFactory2;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * @author yyuanyan
 * @create 2019 - 07 - 31 - 10:36
 */
public class Lesson03 {
    @Test
    public void test01(){
        /*
         * 装配Bean的三种方式，所谓的装配就是在xml写一个bean标签
         */
/*

        //new 对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");

        IUserService user = (IUserService) context.getBean("userservice1");
        user.add();
*/

        //静态工厂
       /* IUserService userservice2 = UserServiceFactory.creatUserService();
        userservice2.add();*/
        /*ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        IUserService userservice2 = (IUserService) context.getBean("userservice2");*/

        //实例工厂
        //1.创建工厂
        /*UserServiceFactory2 factory2 = new UserServiceFactory2();
        IUserService userservice3 = factory2.creatUserService();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        IUserService userservice3 = (IUserService) context.getBean("userservice3");
        userservice3.add();
    }
}
