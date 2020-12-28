package StudentPackage;
import java.util.*;
class CreditException extends Exception{
    CreditException(String s){
        super(s);
    }
}
public class RegisterStudent implements Student{
    public String name,branch;
    public int credit;
    public int sub1[] = new int[4],sub2[] = new int[4],sub3[] = new int[4],sub4[] = new int[4];
    public int cgpa[] = new int[4], sgpa = 0;
    public RegisterStudent(){
    }
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : "); name = sc.nextLine();
        System.out.println("Enter name : "); branch = sc.nextLine();
        System.out.println("Enter credits : "); credit = sc.nextInt();
        try{
            if (credit > 30){
                throw new CreditException("Credit Limit Exceeded. Not Possible");
            }
        }catch(Exception e){System.out.println("Error : " + e.getMessage()); return;}
        System.out.println("Enter marks of sub1 for all 4 semesters");
        for (int i = 0; i < 4; i++) {
            sub1[i] = sc.nextInt();
            cgpa[0] += sub1[i];
        }
        System.out.println("Enter marks of sub2 for all 4 semesters");
        for (int i = 0; i < 4; i++) {
            sub2[i] = sc.nextInt();
            cgpa[1] += sub2[i];
        }
        System.out.println("Enter marks of sub3 for all 4 semesters");
        for (int i = 0; i < 4; i++) {
            sub3[i] = sc.nextInt();
            cgpa[2] += sub3[i];
        }
        System.out.println("Enter marks of sub4 for all 4 semesters");
        for (int i = 0; i < 4; i++) {
            sub4[i] = sc.nextInt();
            cgpa[3] += sub4[i];
        }
        for (int i = 0; i < 4; i++) {
            cgpa[i] /= 40;
            sgpa += cgpa[i];
        }
        sgpa /= 4;
    }
}
