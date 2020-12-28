import com.dept.ISE.*;
public class MainClass {
    public static void main(String[] args) {
        ISE_Department ise = new ISE_Department();
        System.out.println("---- READ DATA ----");
        ise.readData();
        System.out.println("---- PRINT ROLES ----");
        ise.printDesignations();
        System.out.println("---- TOTAL PROJS ----");
        ise.reserachProjs();
        System.out.println("---- YOE > 20 ----");
        for (int i = 0; i < ise.n; i++) {
            if (ise.faculty[i].yoe > 20){
                ise.printData(i);
            }
        }
    }
}
