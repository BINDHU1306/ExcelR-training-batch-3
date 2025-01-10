import java.util.Scanner;

public class test002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.println("enter result :yes/no");
        String result = sc.nextLine();
        
    
        while (result.equals("yes")) {
            System.out.println("happy sankranthi");
            result = sc.nextLine(); 
        }
        
        sc.close();
    }
}
