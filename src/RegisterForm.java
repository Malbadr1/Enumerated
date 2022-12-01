import java.util.Scanner;

enum Gender {male, female};

enum Course {java, jS}

enum Semester {summerSemester, winterSemester}

public class RegisterForm {
    String studentName;
    Gender studentGender;
    Course course;
    Semester semester;

    Scanner input = new Scanner(System.in);

    public RegisterForm() {
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.course = course;
        this.semester = semester;
    }

    public String getStudentName() {
        setStudentName();
        return studentName;
    }

    public void setStudentName() {

        System.out.println("enter name ");
        this.studentName = input.next();
    }

    public Gender getStudentGender() {
setStudentGender();

        int choice3 = input.nextInt();
        switch (choice3) {
            case 1:
                return Gender.male;

            case 2:

                return Gender.female;
        }

        return studentGender;
    }

    public void setStudentGender() {

        System.out.println(" chose StudentGender");
        System.out.println("tap 1 for male ");
        System.out.println("tap 2 for female ");


    }

    public Course getCourse() {
setCourse();
        int choice2 = input.nextInt();

        switch (choice2) {
            case 1:
                return Course.java;

            case 2:

                return Course.jS;
        }

        return course;
    }

    public void setCourse() {
        System.out.println(" chose Course");
        System.out.println("tap 1 for java ");
        System.out.println("tap 2 for JS ");
  

    }

    public Semester getSemester() {
        setSemester();
        int choice1 = input.nextInt();

        switch (choice1) {
            case 1:
                return Semester.summerSemester;

            case 2:

                return Semester.winterSemester;
        }
        return semester;
    }

    public void setSemester() {
        System.out.println(" chose semester");
        System.out.println("tap 1 for summerSemester ");
        System.out.println("tap 2 for winterSemester ");


    }

    public static void main(String[] args) {
        RegisterForm re = new RegisterForm();


        System.out.println(" info" + "\n" + re.getStudentName() + "\n" + re.getStudentGender() + "\n" + re.getCourse() + "\n" + re.getSemester());
    }
}
