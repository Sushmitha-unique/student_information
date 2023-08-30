import java.util.*;
class student
{
    int id;
    String name;
    int age;
    String grade;
    public student(int id,String name,int age,String grade){
        this.id=id;
        this.name=name;
        this.age=age;
        this.grade= grade;
    }
}
class StudentInfo{
    public static void main(String args[])
    {
    ArrayList<student>  sl=new ArrayList<>();
    Scanner s=new Scanner(System.in);
    while(true)
    {
        System.out.println("1.Add Student");
        System.out.println("2.View Student");
        System.out.println("3.Search Student");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        int n=s.nextInt();
        switch(n){
            case 1: System.out.println("Enter id");
                    int id= s.nextInt();
                    s.nextLine();
                    System.out.println("Enter name");
                    String name= s.next();
                    s.nextLine();
                    System.out.println("Enter age");
                    int age= s.nextInt();
                    s.nextLine();
                    System.out.println("Enter grade");
                    String grade= s.next();
                    s.nextLine();
                    student stud=new student(id,name,age,grade);
                    sl.add(stud);
                    System.out.println("Student added successfully!....");
                    break;
            case 2:
                 System.out.println("List of students");
                 for(student i:sl)
                    System.out.println("ID:"+i.id+"  "+"NAME:"+i.name+"   "+"AGE:"+i.age+"   "+"GRADE:"+i.grade);
                 break;
            case 3:
                System.out.println("Enter student id to search");
                int sid=s.nextInt();
                boolean found= false;
                for(student i: sl)
                {
                    if(i.id == sid)
                    {
                      System.out.println("Student found...");
                      found=true;
                      break;
                    }
                }
                if(!found)
                  System.out.println("Student not found!..");
                  break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid  choice ! please enter valid choice");
                break;

        }
    }
    }
}