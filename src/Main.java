import model.Sex;
import model.Student;

/**
 * Created by KingsWong on 2019/6/13.
 */
public class Main {
    public static void main(String[] args) {
        //无参构造
        Student student1 = new Student();
        student1.setName("Dean");
        student1.setAge(18);
        student1.setStuNum("12345678");
        student1.setSex(Sex.FEMALE);

        //有参构造
        Student student2 = new Student("Deanfluza", 23, Sex.MALE, "987654321");

        //打印
        System.out.println(student1);
        System.out.println(student2);
    }
}
