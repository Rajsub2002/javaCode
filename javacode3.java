public class javacode3 {
     
     int add (int a, int b) {
        int c = a+b;
        System.out.println("The value of c: " + c);
        return c;
        
    }

    public static void main(String[] args) {

        javacode3 x = new javacode3 ();
        x.add(10, 5);
    }
    
}
