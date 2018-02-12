package com.example.neil.aidldemo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.example.neil.aidldemo.IMyAidlInterface;
import com.example.neil.aidldemo.User;

/**
 * Created by neil on 2018/2/9.
 */

public class MyService extends Service {

    public MyService() {

    }


    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }


    class MyBinder extends IMyAidlInterface.Stub {

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public String getName(String name) throws RemoteException {
            return "Hi,my name is " + name + ".";
        }

        @Override
        public User getUserData(String name) throws RemoteException {

            User user = new User(name);
            user.setAddress("NewTaipei City");
            user.setMail("neil@gmail.com");
            user.setNickname("Neil");
            user.setPhoneNumber("0987654321");

            return user;
        }
    }

}
