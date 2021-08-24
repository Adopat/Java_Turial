package chapter7_4;

public class TestException3 {
    public static void main(String[] args){
        int result = test(25,5);
        System.out.println(result);// finally 执行了 0
    }
    public static  int test(int number1,int number2){
        try{
            int result = number1/number2;
            return result;
        }catch (Exception e){
            System.out.println("出异常了");
            e.printStackTrace();
            // finally 一定会执行，finally 中不要写return 会忽略try 中 return
        }finally {
            System.out.println("finally 执行了");
            return 0;
        }
    }
}

