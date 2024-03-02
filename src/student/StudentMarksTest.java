package student;

public class StudentMarksTest {
    public static void main(String[] args){
        StudentSubject subject = new StudentSubject();
        int a= subject.StudentSubject(100,100,100);
        System.out.println(a);
        if (a<100){
            System.out.println("first");
        } else if(a>100){
            System.out.println("second");

        }
    }
}
