import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    List<String> list = new ArrayList<>();
    Student(){
        list.addAll(Arrays.asList("Ram", "Nilesh"));
    }

    /*non-static method*/
    public List<String> getStudents(){
        return new ArrayList<>(Arrays.asList("Kishan", "Sundar"));

    }

    /*static method*/
    public static List<String> getStudentByStaticMethod(){
     return new ArrayList<>(Arrays.asList("dev", "Prakash"));

    }
}
