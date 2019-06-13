package model;

/**
 * Created by KingsWong on 2019/6/13.
 */
public class Student {
    private String name;
    private int age;
    private Sex sex;
    private String stuNum;

    public Student(){

    }

    public Student(String name, int age, Sex sex, String stuNum) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", stuNum='" + stuNum + '\'' +
                '}';
    }
}
