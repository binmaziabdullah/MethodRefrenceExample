import java.util.List;

public class Test {

        /*method reference is another way to implement the Functional interface
        * we can use method reference if we wan to use existing logic for the implementation of Functional interface
        * internally method reference is using the lambda expression
        * there 3 types of method reference which is explain below
        * 1.referencing to instance method
        * 2.referencing to static method
        * referencing to constructor*
          we have :: operator to represent method reference.
          we can have the implementation of Functional interface with less code using method reference/
          * ----------------------------------
          to achieve method reference following are the basic rule
          * 1.method signature (method return type and parameter list) must be same
          * method name might be different */

    public static void main(String[] args) {

        /*referencing to non-static method
        * here we can use anonymous object with method reference
        * or we can create an object reference class and by passing that reference with ::(method reference) *
         */

        /*Passing by anonymous object*/
        AddStudent student = new Student()::getStudents;
        List<String> result = student.getDetails();
        System.out.println(result);

        /*Passing by object reference*/
        Student s = new Student();
        AddStudent addStudent = s::getStudents;
        List<String> r = addStudent.getDetails();
        System.out.println(r);

        /*referencing to static method*/
        AddStudent student1 = Student::getStudentByStaticMethod;
        List<String> result1 = student1.getDetails();
        System.out.println(result1);

        /*referencing to Constructor*/
        AddStudent student2 = Student::getStudentByStaticMethod;
        List<String> result3 = student.getDetails();
        System.out.println(result3);
    }

}
