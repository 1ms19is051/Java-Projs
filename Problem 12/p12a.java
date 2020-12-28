import java.util.*;
public class p12a{
    static ArrayList<String> queue = new ArrayList<String>();
    static void enqueue(String val){
        queue.add(val);
    }
    static void dequeue(){
        if (queue.size() == 0){
            System.out.println("Queue is already empty");
            return;
        }
        queue.remove(0);
    }
    static void display(){
        if (queue.size() == 0){
            System.out.println("Queue is already empty");
            return;
        }
        System.out.println("Queue is : ");
        for(int i = 0;i < queue.size();i++){
            System.out.print(queue.get(i) + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1.Enqueue 2.Dequeue 3.Display 4.Exit");
        while(choice != 4){
            System.out.println("Enter choice");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter a String"); String val = sc.nextLine();
                    enqueue(val);
                    break;
                case 2: dequeue(); break;
                case 3: display(); break;
                case 4: break;
                default: System.out.println("Wrong Input"); break;
            }
        }
        sc.close();
    }
}