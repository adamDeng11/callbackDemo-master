package com.adam.callbackdemo;

import android.util.Log;

import com.adam.callbackdemo.interfaces.MyCallInterface;

/**
 * Created by adamDeng on 2019/10/17
 * Copyright © 2019年 . All rights reserved.
 */
public class Client implements MyCallInterface {
    @Override
    public void printName(){
        Log.i("Client","我是client打印出来方法");
    }
}
