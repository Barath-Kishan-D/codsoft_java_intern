import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println();
        System.out.println("----- Student Grade Calculator -----");
        System.out.println();

        System.out.println("Enter your name : ");
        String name=sc.nextLine();

        System.out.println("Enter subject 1 mark");
        int sub1 = sc.nextInt();
        System.out.println("Enter subject 2 mark");
        int sub2 = sc.nextInt();
        System.out.println("Enter subject 3 mark");
        int sub3 = sc.nextInt();
        System.out.println("Enter subject 4 mark");
        int sub4 = sc.nextInt();
        System.out.println("Enter subject 5 mark");
        int sub5 = sc.nextInt();

        int total = totalMarks(sub1,sub2,sub3,sub4,sub5);
        float avg = averagePercentage(total);
        char grade = grade(avg);

        System.out.println();
        System.out.println("----- Student Grade Calculator -----");
        System.out.println();
        System.out.println("Name : "+name);
        System.out.println("Total marks : "+total+"/500");
        System.out.println("Average Percentage : "+avg+"%");
        System.out.println("Grade : "+grade);

        sc.close();
    }
    

    private static int totalMarks(int sub1, int sub2, int sub3, int sub4, int sub5) {
        return sub1+sub2+sub3+sub4+sub5;
    }


    private static float averagePercentage(int total) {
        return (float)((float)(total)/(float)5.00);
    }


    private static char grade(float avg) {

        char res='a';

        if(avg>90){
            res='O';
        }
        else if(avg>80){
            res='A';
        }
        else if(avg>70){
            res='B';
        }
        else if(avg>60){
            res='C';
        }
        else if(avg>50){
            res='D';
        }
        else{
            res='E';
        }

        return res;
    }
}
