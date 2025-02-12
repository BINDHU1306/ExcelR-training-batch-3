import java.util.Scanner;
public class Demo083 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the word");
        String  word  = sc.nextLine();
        char ch = word.toUpperCase().charAt(0);
        if(ch == 'a' || ch =='e'||ch =='i'||ch == 'o'||ch =='u' ){
            System.out.println("the given word is vowel");
        }
        else{
            System.out.println("the given word is consonant");
        }



     

    }
    
}
