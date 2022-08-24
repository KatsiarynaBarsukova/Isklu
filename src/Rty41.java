public class Rty41 {
    public static void main(String[] args) {
        try{
            System.out.println("Try block");
            int data = 125/ 5;
            System.out.println("Result:"+ data);
        }
        catch (NullPointerException e) {
            System.out.println("Catch block");
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block");
            System.out.println("No exception - finally block executed");
        }
        System.out.println("rest of the code...");
    }
}
