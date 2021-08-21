package chapter6_7;
// 接口支持多继承，类不支持支持多继承，接口的继承是为了对接口进行扩展，有多个抽象方法了
public interface Pay extends A,B{
    int  getOrderAmout();
}
