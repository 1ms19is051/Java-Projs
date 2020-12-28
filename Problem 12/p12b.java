import java.util.*;
public class p12b {    
    static LinkedList<String> ll = new LinkedList<String>();
    static void insert(String name){
        ll.add(name);
    }
    
    static void display(){
        for (Iterator i = ll.iterator(); i.hasNext();) {
            String str = i.next().toString();
            if (str.length() < 5){
                System.out.println(str);
            }
         }
    }
    public static void main(String[] args) {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1.Insert 2.Check Strings with length < 5 3.Exit");
        while(ch != 3){
            System.out.println("Enter choice");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                System.out.println("Enter String"); String st = sc.nextLine(); insert(st);
                    break;
                case 2: display();break;
                case 3: break;
                default:
                System.out.println("Wrong i/p");
                    break;
            }
        }
        sc.close();
    }
}
