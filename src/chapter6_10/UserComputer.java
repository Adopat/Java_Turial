package chapter6_10;

public class UserComputer {
    /**
     * 定义一个静态工具类方法处理接口数据
     * @param computer 因为AddOper DividOper MultiOper SubOper 都实现了IComputer接口，所以可以使用 接口接受对象 ，多态的体现
     * @param num1
     * @param num2
     */
    public static void computer(IComputer computer,int num1,int num2){
        int result = computer.computer( num1, num2);
        System.out.println(result);

    }
    public static void main(String[] args){
        // 静态方法使用类名进行调用
        UserComputer.computer(new AddOper(),20,10);
        UserComputer.computer(new DivideOper(),20,10);
        UserComputer.computer(new MultiOper(),20,10);
        UserComputer.computer(new SubOper(),20,10);

    }
}
