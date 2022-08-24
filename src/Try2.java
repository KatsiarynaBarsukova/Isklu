public class try2 {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException e){
            System.out.println("what are you doing, you can't divide by zero!");
        } catch (NullPointerException e){
            System.out.println("one of the input arguments is null");
        } catch (Exception e) {
            System.out.println("Is there something wrong");
        }
    }
}
