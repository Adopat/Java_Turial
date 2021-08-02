package test;

import chapter4_2.Father;

public class MainTest extends Father{
    public static void main(String[] args){
        System.out.println("我是MainTest类");
        Father father = new Father();
        father.test();
        MainTest mainTest = new MainTest();
        mainTest.test();
        mainTest.test1();
    }
}
