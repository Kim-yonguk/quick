package com.example.a1a1a1.button;

/**
 * Created by 1a1a1 on 2016-09-29.
 */
public class MyAverage extends MyValues{
    public  int getResult()
    {
    int result=0;
        for(int i=0; i<num.length; i++) {
            result += num[i];
        }
        result/=num.length;
    return result;
    }

}
