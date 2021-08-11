package chapter5_8;

public class Test1 {
    public static void main(String[] args){
        test1();

    }
    public static void test1(){
        Student[] arr1 = new Student[60];
        Student[] arr2 = new Student[40];
        for (int i=0;i<100;i++){
            int number = i+1;
            Student student = new Student();
            student.setId(number);
            if (number>60){
                arr2[i-60] = student;
            }else{
                arr1[i] = student;
            }

        }
        for (Student s:arr1){
            System.out.println(s.getId());
        }
        System.out.println("================");
        for (Student s:arr2){
            System.out.println(s.getId());
        }
    }
}
