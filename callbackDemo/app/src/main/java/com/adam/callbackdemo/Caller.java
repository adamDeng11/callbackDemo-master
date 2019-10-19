package com.adam.callbackdemo;

import android.telecom.Call;

import com.adam.callbackdemo.interfaces.MyCallInterface;

/**
 * Created by adamDeng on 2019/10/17
 * Copyright © 2019年 . All rights reserved.
 */
public class Caller {
    //保存一个接口的引用
    private MyCallInterface myCallInterface;
    public Caller(){}
    //把接口作为参数传过来
    public void setMyCallInterface(MyCallInterface myCallInterface){
        this.myCallInterface=myCallInterface;
    }
    public void call(){
        myCallInterface.printName();
    }
}
