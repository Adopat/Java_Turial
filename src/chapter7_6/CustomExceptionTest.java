package chapter7_6;

public class CustomExceptionTest {
    public static void main(String[] args){
        try{
            test();

        }catch (NullPointerException e){
            e.printStackTrace();

        }catch (UserNotEnoughException e){
            int code = e.getCode();
            String msg = e.getMsg();
            System.out.println("code ="+code+" msg="+msg);
        }
        try{
            test1();
        }catch (UserNotEnoughException e){
            System.out.println("code="+e.getCode()+" msg="+e.getMsg());
        }

    }
    public static void test() throws UserNotEnoughException{
        throw new UserNotEnoughException(-1,"人员不够异常");
    }
    public static void test1() throws UserNotEnoughException{
        throw new UserNotEnoughException();
    }
}
