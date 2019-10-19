package com.adam.callbackdemo.interfaces;

import android.util.Log;

/**
 * Created by adamDeng on 2019/10/17
 * Copyright © 2019年 . All rights reserved.
 */
public class Boy implements Person {
    @Override
    public void printName(){
        Log.i("Boy","我是男的");
    }
    @Override
    public void printSex(){
        Log.i("Boy:","Boy");
    }


}
