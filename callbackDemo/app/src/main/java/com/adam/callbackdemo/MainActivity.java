package com.adam.callbackdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.adam.callbackdemo.callback.CallPerson;
import com.adam.callbackdemo.interfaces.Boy;
import com.adam.callbackdemo.interfaces.Girl;
import com.adam.callbackdemo.interfaces.MyCallInterface;
import com.adam.callbackdemo.interfaces.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Client client=new Client();
        client.printName();*/

        /*Caller caller=new Caller();
        caller.setMyCallInterface(new Client());
        caller.call();*/

        /*Caller caller=new Caller();
        caller.setMyCallInterface(new MyCallInterface() {
            @Override
            public void printName() {

            }
        });*/

        /*Boy boy=new Boy();
        boy.printName();
        Girl girl=new Girl();
        girl.printName();*/

        CallPerson callPerson=new CallPerson();
        //将需要回调的类传过去
        callPerson.getMessage(new Boy());
        callPerson.getMessage(new Girl());

        //匿名内部类的形式
         callPerson.getMessage(new Person() {
            @Override
            public void printName() {

            }

            @Override
            public void printSex() {

            }
        });




        /*String name=(new Callback(){
         @Override
         public void printName(){
             Log.i("","");
         }
        }).toString();*/


    }

}
