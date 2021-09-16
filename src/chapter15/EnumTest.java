package chapter15;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args){
        DayEnum dayEnum = DayEnum.FRIDAY;
        System.out.println(dayEnum);
        System.out.println("枚举类的name方法 ："+dayEnum.name());
        System.out.println("枚举变量在枚举中声明的顺序 ："+dayEnum.ordinal());
        System.out.println("枚举对象的"+dayEnum.toString());
        SexEnum[] arr = SexEnum.values();
        System.out.println(Arrays.toString(arr));
        // valueof 通过字符串获取对应的枚举值，一般用于前端校验
        SexEnum sex = SexEnum.valueOf("MAN");
        System.out.println(sex.name());
        System.out.println("============for循环=============");
        for(SexEnum sexEnum:arr){
            System.out.println(sexEnum);
        }
    }

}
// 枚举类的定义
enum DayEnum{
    MONDAY,TUESDAY,WENDESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
enum SexEnum{
    MAN,WOMAN
}
