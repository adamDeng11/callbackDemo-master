package com.adam.callbackdemo.callback;

import android.util.Log;

import com.adam.callbackdemo.interfaces.Person;

/**
 * Created by adamDeng on 2019/10/17
 * Copyright © 2019年 . All rights reserved.
 */
public class CallPerson {
    public void getMessage(Person person){
        person.printName();
    }

    public void printMyName(){
        Log.i("adam","我是callperson里面的方法");
    }
}
