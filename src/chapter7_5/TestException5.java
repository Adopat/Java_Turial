package chapter7_5;

public class TestException5 {
    public static void main(String[] args) throws Exception{
        try{
            int result = test(25,0);
            System.out.println(result);
        }catch (Exception e){
            System.out.println("异常被处理了");
        }
        int result1 = test1(25,0);
        System.out.println("result1="+result1);
    }
    public static int test(int num1,int num2) throws Exception{
        try {
            int result = num1/num2;
            return result;
        }catch (Exception e){
            System.out.println("出异常了");
            throw new Exception("参数异常了");
        }

    }
    public static int test1(int num1,int num2) throws Exception{
        int result = num1/num2;
        return result;
    }
}
