package chapter7_3;

public class ExceptionTest2 {
    public static void main(String[] args){
        try{
            int result = 35/1;
            // 出异常 不执行
            System.out.println(result);
        }catch (Exception e){
            System.out.println("异常开始");
            e.printStackTrace();
            System.out.println("异常结束了");
        }
        test();

    }
    public static void test(){
        try{
            Student student = new Student();
            student.setAge(-1);

        }
//        catch (Exception e){
//            System.out.println("出异常了");
//        }
        catch (IllegalArgumentException e){
            System.out.println("出异常了IllegalArgumentException");

        }catch(NullPointerException e){
            System.out.println("出异常了NullPointerException");
        }


    }
}
