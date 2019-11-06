public class Lecturer {
    private String name;
    private int age;
    private String course;
    public static int num=0;
    Lecturer(String s, int x, String c){name=s; age=x; course=c; ++num;}
    void change(String s, int x, String c){name=s; age=x; course=c;}
    public void print(){System.out.printf("Name : %s \nAge : %d\nSubject : %s\n");}

}
