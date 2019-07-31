package com.yy.test;

import com.yy.service.IUserService;
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
public class Lesson02 {
    @Test
    public void test01(){
        /*
         * BeanFactory采取延迟加载，第一次getBean时才会初始化Bean
         * ApplicationContext 即使加载
         * ApplicationContext是对BeanFactory的扩展，提供了更多功能
         * 国际化处理
         * 事件传递
         * Bean自动装配
         * 各种不同应用层的Context实现
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

        //IUserService user = (IUserService) context.getBean("userservice");
        //user.add();
        String path = "D:\\IDEA\\workcode\\LearnTeat\\src\\beans1.xml";
        BeanFactory factory =new XmlBeanFactory(new FileSystemResource(path));
        //此时不会调用，当getBean时，才会调用
        IUserService user1 = (IUserService) factory.getBean("userservice");
        System.out.println(user1);

    }
}
