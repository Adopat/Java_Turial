package chapter6_10;

/**
 * 这个是计算器的接口
 */
public class DivideOper implements IComputer{
    /**
     * 通过传递两个参数，完成运算
     * @param num1 参数1
     * @param num2 参数2
     * @return
     */
    @Override
    public int computer(int num1,int num2){
        try{
            return num1/num2;
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;

    }
}
