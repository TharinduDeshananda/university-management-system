import java.util.Scanner;


public class main {
static String c1="SENG 11111 - Introduction To Programming";
static String c2="SENG 11112 - Fundamentals Of Engineering";
static String c3="SENG 11113 - Data Structures And Algorithm";
static int stnum=0;
static int lecnum=0;
static Student[] students=new Student[1000];
static Lecturer[] lecturers=new Lecturer[1000];

/*register Student-----------*/
static void regStu(){
    Scanner sc=new Scanner(System.in);
    String s;
    int x;
    int c;
    String cs;
System.out.println("Student Registraation");
System.out.println("Please Submit the following information");
System.out.println("Name :");
s=sc.nextLine();
System.out.println("Age :");
x=sc.nextInt();
System.out.println("Select the Course\n[1] SENG 11111 - Introduction To Programming\n[2] SENG 11112 - Fundamentals Of Engineering\n[3] SENG 11113 - Data Structures And Algorithm ");
c=sc.nextInt();
switch(c){
    case 1 : cs=c1; break;
    case 2 : cs=c2; break;
    case 3 : cs=c3; break;
    default :  System.out.println("Enter valid course"); cs=null;
    }
    if(cs!=null){
    students[stnum]=new Student(s,x,cs);
    ++stnum;
        System.out.println("Student Registration complete");
        System.out.printf("Name : %s\nAge : %d\nSubject : %s\n",s,x,cs);
    }
}

/*register lectuere-----------*/
    static void regLec(){
        Scanner sc=new Scanner(System.in);
        String s;
        int x;
        int c;
        String cs;
        System.out.println("Lecturer Registraation");
        System.out.println("Please Submit the following information");
        System.out.println("Name :");
        s=sc.nextLine();
        System.out.println("Age :");
        x=sc.nextInt();
        System.out.println("Select the Course\n[1] SENG 11111 - Introduction To Programming\n[2] SENG 11112 - Fundamentals Of Engineering\n[3] SENG 11113 - Data Structures And Algorithm ");
        c=sc.nextInt();
        switch(c){
            case 1 : cs=c1; break;
            case 2 : cs=c2; break;
            case 3 : cs=c3; break;
            default :  System.out.println("Enter valid course"); cs=null;
        }
        if(cs!=null){
            lecturers[lecnum]=new Lecturer(s,x,cs);
            ++lecnum;
            System.out.println("Lectuerer Registration complete");
            System.out.printf("Name : %s\nAge : %d\nSubject : %s\n",s,x,cs);

        }



    }

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int num;
System.out.println("\t\tWelcome to University Management System");
while(true) {
    System.out.println("\nPlease Select an Option to procede,\nPress [1] Register as a Student\nPress [2] Register as a Lecturer");
    num = sc.nextInt();
    switch(num){
        case 1 : regStu(); break;
        case 2 : regLec(); break;
        default : System.out.println("Wrong input"); break;

    }
}
}

}
