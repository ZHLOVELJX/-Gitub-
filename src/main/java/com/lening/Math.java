package com.lening;

/**
 * @Author 作者：李嘉欣
 * @Date 时间：2021/4/15 18:47
 * @Version 1.0
 */
public class Math {
    public  static int initData=666;
    public  static User user=new User(); //一个方法 对应 一个栈帧

    public  int compute(){
        int a =100;
        int b=98;
        int c=(a+b);
        return c;
    }

    public static void main(String[] args){// 栈  先进后出
        Math math =new Math();
        math.compute();
    }
}
