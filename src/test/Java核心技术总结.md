## 第一章 基本语法

### 1.1 数据类型

#### 1.1 基本数据类型

- 整型 int short byte long
- 浮点型 float double
- 字符型 char
- 布尔型 boolean

```java
public class MainTest {
    // byte 8位 
    static byte b = 127;
    byte c1 =100;
    // short 16位
    static short s = 32767;
    // int 32位
    static int c = 32768;
    // long 64位
    static long b4 = 121232L;
    // 单精度 32位
    static float f = 2.5F;
    // 双精度 64 位
    static double d = 2.5;
    // 1位
    static boolean bool = false;
    // 16位
    static char ch = 'A';
    public static void main(String[] args){
        MainTest mainTest = new MainTest();
        System.out.println(mainTest.c1); //100
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(b4);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(ch);
        // 记住以下ASCI码
        System.out.println("=======ASCI码=============");
        System.out.println((int)'A');// 65
        System.out.println((int)'Z');// 90
        System.out.println((int)'a');// 97
        System.out.println((int)'z');//122
        System.out.println((int)'0');//48
        System.out.println((int)' ');//75
        // 字符运算
        System.out.println("========字符运算===============");
        System.out.println('A'+'Z');//155
        System.out.println(ch+10);//75
        // 获取取值范围 使用对应的包装类
        System.out.println("===================================");
        test();
    }
    public static void test(){
        System.out.println("byte 取值范围："+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE); //byte 取值范围：-128-127
        System.out.println("short 取值范围："+Short.MIN_VALUE+"-"+Short.MAX_VALUE);// short 取值范围：-32768-32767
        System.out.println("int 取值范围："+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);// int 取值范围：-2147483648-2147483647
        System.out.println("long 取值范围："+Long.MIN_VALUE+"-"+Long.MAX_VALUE);//long 取值范围：-9223372036854775808-9223372036854775807
    }
}
```

#### 1.2 引用数据类型

### 1.2 基础语法

#### 1.2.1 标识符命名规则

- 大驼峰  类名 `User`
- 小驼峰 变量 方法 `userName`

### 1.3 运算符

- 赋值运算符 `=`
- 算术运算符 `+ - * / %`
- 自增自减运算符 `++ -- +=`
- 比较运算符`> < >= <= == !=`
- 逻辑运算符 `&& || ! & | ^`
- 按位运算符 `>> <<`
- 三元运算符 `条件表达式 ? 表达式1:表达式2`

```java
package chapter4_10;

public class OperationSummary {
    public static void main(String[] args){
        // 1.赋值运算符
        int a = 10;
        // 2.算术运算符
        System.out.println(a+10);// 加
        System.out.println(a-5);// 减
        System.out.println(a*10);// 乘
        System.out.println(a/3);// 整除
        System.out.println(a%3);// 求余
        System.out.println(5.0/2);// 浮点除
        // 3.自增 自减运算
        int c =100;
        System.out.println(a++);// 10
        System.out.println(a);//11
        // 4.比较运算符
        System.out.println(a!=10); // true
        // 5.逻辑运算符
        // 逻辑与 && 逻辑或 || 逻辑非 !
            int b = 20;
            System.out.println(a>10 && b<20); // false
            System.out.println(a>0 && b<0); // false
            System.out.println(a>0 || b<0); // true
            System.out.println(!(a>0));// false // 这里可以看到逻辑非的运算符优先级高于 >
            // 逻辑运算符的短路运算 && 当有一个为false后面的不执行，|| 第一个为真，第二个表达式不计算
//        int i = 0;
//        int j = 0;
//        if(++i >0 || ++j>0){
//            System.out.println(i);//1
//            System.out.println(j);//0
//        }
//        int i = 0;
//        int j = 0;
//        if (i++>0||j++>0){ // 不满足条件 不执行
//            System.out.println(i);
//            System.out.println(j);
//        }
            // 6.三目运算 条件?成功:否则
            int age = 16;
            String content = age>18?"成年":"未成年";
            System.out.println(content);//未成年
            // Java 运算符的优先级，不用死记硬背，不确定，就加括号
           // 7.位运算  >> 右移  << 左移
        System.out.println(8>>2);//1000  0010
        System.out.println(10<<2);

    }
}

```

### 1.4 常见的关键字

#### 1.4.1 访问修饰符

|        | private | default | protected | public |
| ------ | ------- | ------- | --------- | ------ |
| 同一类 | true    | true    | true      | true   |
| 同一包 |         | true    | true      | true   |
| 子类   |         |         | true      | true   |
| 其他类 |         |         |           |        |

#### 1.4.2 static

- static 修饰变量

  ```java
  public class VariableTypeTest {
      // static 修饰的为静态变量 静态变量位类所拥有 ，所有对象共享
      public static String NAME;
      public static int AGE;
      public static  boolean FLAG;
      public static void main(String[] args){
          System.out.println(NAME); //null
          System.out.println(AGE); // 0
          System.out.println(FLAG); // false
          // 属性的调用
          Student student = new Student();
          System.out.println("=====");
          System.out.println(Student.gender);// null
  
          System.out.println(student.getAge()); // 0
          System.out.println(student.getName()); // null
          student.setAge(10);
          student.setName("justin");
          System.out.println(student.getAge()); // 10
          System.out.println(student.getName()); // justin
          System.out.println("==================调用静态方法====================");
          //aa();
          testStatic();
  
  
      }
      public void aa(){
          System.out.println(NAME);
          //
          System.out.println(VariableTypeTest.NAME);
          Student stu1 = new Student();
          System.out.println(stu1.gender);
      }
      // 静态方法 可以直接通过类名调用
      public static void  testStatic(){
          System.out.println("静态方法");
  
      }
  
  }
  ```

- static 修饰方法

- static 修饰代码块

- static 修饰类

#### 1.4.3 final

- final 修饰变量

  final 修饰的变量为常量，不可更改。

- final 修饰方法

  final 修饰方法代表方法不能被重写

- final 修饰类

  final修饰类，代表此类不能被继承

### 1.5 数组

- 数组定义

- 数据遍历

  ```java
  public class ArrayTest {
      public static void main(String[] args){
          // 定义数组的第一种方法 先定义和初始化长度
          int [] number = new int[5];
          number[0] = 1;
          number[1] = 1;
          number[2] = 1;
          number[3] = 1;
          number[4] = 1;
          System.out.println(number[4]);
          // 定义数组的第二种方法
          int [] numbers = { 2,3,4,5,6};
          System.out.println(numbers[2]);
          // 定义匿名数组
          // new int [] {1,2,3,4,5};
          // 数组要初始化才能够使用,整型数组默认值为0
          int [] numbers1 = new int[10];
          System.out.println(numbers1[9]);
          // 数组自带的属性
          System.out.println(numbers1.length);
  
      }
  }
  ```

  

### 1.6 变量

- 成员变量

- 局部变量

  局部变量必须要初始化才能使用

## 第二章 流程控制

### 2.1 条件语句

- if

### 2.2 循环语句

- while
- do while
- case when

### 2.3 跳转语句

- break
- continue
- return

## 第三章 面向对象

### 3.1 封装

### 3.2 继承

### 3.3 多态

## 第四章 异常

### 4.1 异常体系

## 第五章 集合

### 5.1 集合体系

## 第六章 文件操作

### 6.1文件体系

## 第七章 常见类库