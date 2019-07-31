package com.yy.service;

/**
 * @author yyuanyan
 * @create 2019 - 07 - 31 - 10:34
 */
public class IUserServiceImp implements IUserService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("创建用户..."+ name);
    }

    public IUserServiceImp() {
        System.out.println("IUserServiceImp()被调用了...");
    }
}
