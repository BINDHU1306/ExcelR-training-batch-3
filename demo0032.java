import java.util.HashSet;

class demo0032 {
    void HSetMethod() {
    
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(100); 
        hashSet.add(":bindhu");
        hashSet.add(9999.99); 

        
        System.out.println("hashset:");

        
        for (Object x : hashSet) {
            System.out.println(x); 
        }
    }

    public static void main(String[] args) {
        demo0032 demo = new demo0032();
        demo.HSetMethod();
    }
}
