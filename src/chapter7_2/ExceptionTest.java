package chapter7_2;

public class ExceptionTest {
    public static void main(String[] args){
        try{
            int result = 25/0;
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
            //e.getCause();
            //String msg = e.getMessage();
        }


    }
}
