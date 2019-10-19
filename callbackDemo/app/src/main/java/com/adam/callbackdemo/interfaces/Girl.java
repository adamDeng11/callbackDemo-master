package com.adam.callbackdemo.interfaces;

import android.util.Log;

/**
 * Created by adamDeng on 2019/10/17
 * Copyright © 2019年 . All rights reserved.
 */
public class Girl implements Person {
    @Override
    public void printName(){
        Log.i("Girl:","我是女孩");
    }
    @Override
    public void printSex(){
        Log.i("Girl:","Girl");
    }
}
