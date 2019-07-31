package com.yy.test;

import com.yy.service.IUserService;
import com.yy.service.IUserServiceImp;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * @author yyuanyan
 * @create 2019 - 07 - 31 - 10:36
 */
public class Lesson01 {
    @Test
    public void test01(){
        //*************************************第一天*********************************************
        /* //以前使用Userservive，自己创建对象
        //IUserService user = new IUserServiceImp();
        //user.add();
        */
        //现在使用Userservice方式从spring容器获取
        //1.加载beans.xml 这个spring配置文件,内部就会创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        //2.从Spring容器获取userService对象
        IUserService user = (IUserService) context.getBean("userservice");
        user.add();

        //*************************************第一天*********************************************

        //*************************************第二天*********************************************

        //Spring容器加载有三种方式
        /*
        //第一种:ClassPathXmlApplicationContext ClassPath类路径加载:指的就是classes路径

        //----------------------------------第一种最常用-----------------------------
        --------------------Spring的配置文件路径以后就直接放在src

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IUerservice user = (IUerservice) context.getBean("userService");
        user.add();*/

        /*//第二种：文件系统路径获得配置文件【绝对路径】
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\IDEA\\workcode\\Springtest\\src\\beans.xml");
        IUerservice user = (IUerservice) context.getBean("userService");
        user.add();*/


        /*//第三种：使用BeanFactory
        String path = "D:\\IDEA\\workcode\\Springtest\\src\\beans.xml";
        BeanFactory factory = new XmlBeanFactory((new FileSystemResource(path)));

        IUerservice user = (IUerservice) factory.getBean("userService");
        user.add();*/

        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans1.xml");
        IUserService userStu = (IUserService) context1.getBean("userservice");
        System.out.println(userStu);

        ApplicationContext context2 = new FileSystemXmlApplicationContext("D:\\IDEA\\workcode\\LearnTeat\\src\\beans1.xml");
        IUserService userStu1 = (IUserService) context2.getBean("userservice");
        System.out.println(userStu1);

        String path = "D:\\IDEA\\workcode\\LearnTeat\\src\\beans1.xml";
        BeanFactory factory =new XmlBeanFactory(new FileSystemResource(path));
        IUserService user1 = (IUserService) factory.getBean("userservice");
        System.out.println(user1);
    }
}
