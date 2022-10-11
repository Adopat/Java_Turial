package chapter20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adopat
 * @version 1.0
 * @description: 泛型上下限
 * @date 2022/10/11 16:47
 */
public class GenericDemo {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        name.add("justin");
        name.add("justin1");
        name.add("justin2");
        age.add(1);
        age.add(2);
        age.add(3);
        getData(name); // getdata调用 =justin
        getData(age); // getdata调用 =1
    }
    public static void getData(List<?> data){
        System.out.println("getdata调用 ="+data.get(0));
    }
    // 参数下限为 Number类型,表示类型只能接受 Number 及其下层父类类型，如 Integer 类型的实例。
    public static void getData1(List<? extends Number> data){
        System.out.println("getdata1调用 ="+data.get(0));
    }
    // 参数上限为 Number类型,表示类型只能接受 Number 及其上层父类类型，如 Object 类型的实例。
    public static void getData2(List<? super Object> data){
        System.out.println("getdata2调用 = "+data.get(0));
    }
}
