// IMyAidlInterface.aidl
package com.example.neil.aidldemo;
import com.example.neil.aidldemo.user;
// Declare any non-default types here with import statements

interface IMyAidlInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

    String getName(String name);

    User getUserData(String name);
}
