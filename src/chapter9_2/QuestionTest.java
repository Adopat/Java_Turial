package chapter9_2;

import java.util.*;

public class QuestionTest {
    public static void main(String[] args){
        test1();
        System.out.println("=============================test2()方法执行===========================");
        test2();
        System.out.println("=============================test3()方法执行===========================");
        test3();
        System.out.println("=============================test4()方法执行===========================");
        test4();

    }
    public static void test1(){
        String str ="String str = *Constructs a new <tt>HashMap</tt> ⼩滴课堂\n" +
                "with the same mappings as the * ⼩滴课堂 specified <tt>Map</tt>. The\n" +
                "<tt>HashMap</tt> is created with default load factor (0.75) and an\n" +
                "initial capacity sufficient to*hold the mappings in the specified\n" +
                "<tt>Map</tt>.";
        // 将字符串转为字符数组
        char[] charArr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<charArr.length;i++){
            Integer value = map.get(charArr[i]);
            if (value==null){
                map.put(charArr[i],1);

            }else{
                value+=1;
                map.put(charArr[i],value);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Character,Integer>> iterator =entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<Character,Integer> entry = iterator.next();
            System.out.println(entry.getKey()+" 出现的次数是: "+entry.getValue());
        }
        System.out.println("===========================================");
        // 使用增强型for 循环遍历
        for(Map.Entry<Character,Integer> entry1:entrySet){
            System.out.println(entry1.getKey()+" 出现的次数是: "+entry1.getValue());
        }

    }
    public static void test2(){
        List<Order> arrList = new ArrayList<>();
        arrList.add(new Order("a课程",22));
        arrList.add(new Order("b课程",23));
        arrList.add(new Order("c课程",24));
        arrList.add(new Order("d课程",25));
        arrList.add(new Order("e课程",26));
        arrList.add(new Order("e课程",26));
        System.out.println(arrList);
        List<Order> arrList1 = new ArrayList<>();
        arrList1.add(new Order("a课程",22));
        arrList1.add(new Order("h课程",23));
        arrList1.add(new Order("s课程",24));
        arrList1.add(new Order("r课程",24));
        arrList1.add(new Order("x课程",25));
        arrList1.add(new Order("y课程",26));
        arrList1.add(new Order("z课程",27));
        arrList1.add(new Order("e课程",26));
        // 求集合的 交集
        /*
           方法一:使用retainall 求交集
         */
//        arrList.retainAll(arrList1);
//        System.out.println("集合的交集是 :"+arrList);
        /*
           方法二:使用增强型for 循环遍历 list
         */
        List<Order> innerList = new ArrayList<>();
        for(Order order:arrList){
            if(arrList1.contains(order)){
                innerList.add(order);
            }
        }
        System.out.println("集合的交集是 :"+innerList);
    }
    public static void test3(){
        List<Order> arrList = new ArrayList<>();
        arrList.add(new Order("a课程",22));
        arrList.add(new Order("b课程",23));
        arrList.add(new Order("c课程",24));
        arrList.add(new Order("d课程",25));
        arrList.add(new Order("e课程",26));
        arrList.add(new Order("e课程",26));
        System.out.println(arrList);
        List<Order> arrList1 = new ArrayList<>();
        arrList1.add(new Order("a课程",22));
        arrList1.add(new Order("h课程",23));
        arrList1.add(new Order("s课程",24));
        arrList1.add(new Order("r课程",24));
        arrList1.add(new Order("x课程",25));
        arrList1.add(new Order("y课程",26));
        arrList1.add(new Order("z课程",27));
        arrList1.add(new Order("e课程",26));
        // 求集合的差集
        /*
           方法一：
         */
        arrList.removeAll(arrList1);
        System.out.println("集合的差集是 ："+arrList);//[Order{name='b课程', age=23}, Order{name='c课程', age=24}, Order{name='d课程', age=25}]
        /*
           方法二是用 for 循环
         */
//        List<Order> diffOrder = new ArrayList<>();
//        for(int i=0;i<arrList.size();i++){
//            if(!arrList1.contains(arrList.get(i))){
//                diffOrder.add(arrList.get(i));
//            }
//        }
//        System.out.println("集合的差集是："+diffOrder);
    }
    public static void test4(){
        List<Order> arrList = new ArrayList<>();
        arrList.add(new Order("a课程",22));
        arrList.add(new Order("b课程",23));
        arrList.add(new Order("c课程",24));
        arrList.add(new Order("d课程",25));
        arrList.add(new Order("e课程",26));
        arrList.add(new Order("e课程",26));
        System.out.println(arrList);
        List<Order> arrList1 = new ArrayList<>();
        arrList1.add(new Order("a课程",22));
        arrList1.add(new Order("h课程",23));
        arrList1.add(new Order("s课程",24));
        arrList1.add(new Order("r课程",24));
        arrList1.add(new Order("x课程",25));
        arrList1.add(new Order("y课程",26));
        arrList1.add(new Order("z课程",27));
        arrList1.add(new Order("e课程",26));
        // 求集合的并集
        /*
           方法一：addAll()
         */
        arrList.addAll(arrList1);
        System.out.println("集合的并集是 ："+arrList);
        /*
           方法二求去重后的并集
         */
        // 如果Order 对象没有重写hashCode 和 equals 方法，则使用 set容器存储不能达到去重的效果
        Set<Order> set = new HashSet<>(arrList);
        System.out.println("去重后集合的并集是："+set);
    }

}
class Order{
    private String title;
    private int price;

    public Order() {
    }

    public Order(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + title + '\'' +
                ", age=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return price == order.price && Objects.equals(title, order.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}
