package chapter6_1;

public class School {
    private String name;
    private String address;
    private int age;
    private Teacher [] teachers;
    public void addTeacher(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setTeachers(Teacher[] teachers){
        this.teachers = teachers;
    }
    public Teacher[] getTeachers(){
        return teachers;
    }

}
