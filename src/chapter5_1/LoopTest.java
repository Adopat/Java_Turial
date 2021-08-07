package chapter5_1;

public class LoopTest {
    public static void main(String [] args){
        //test1();
        //LoopTest.test2();
        test3();
    }
    public static void test1(){
        int i = 10;
        while (i<20){
            System.out.println("我是循环执行的i="+i);
            i++;
        }
        System.out.println("循环结束,i="+i);
    }
    public static void test2(){
        int i =10;
        do {
            System.out.println("我是do while 循环中的i="+i);
            i++;
        }while(i<20);
        System.out.println("循环结束i="+i);

    }
    public static void test3(){
        int i = 10;
        do{
            System.out.println("我是do while 中的i="+i);
            i++;
        }while(i<10);
        System.out.println("循环结束中的i="+i);
    }
}
