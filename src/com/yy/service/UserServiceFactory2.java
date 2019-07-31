package com.yy.service;

/**
 * @author yyuanyan
 * @create 2019 - 07 - 31 - 13:43
 */
public class UserServiceFactory2 {
    public IUserService creatUserService(){

        return new IUserServiceImp();
    }
}
