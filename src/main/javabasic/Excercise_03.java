public class Excercise_03 {
    public static void compareNumbers(int n) {
        int number1 = 100;
        if (n < number1){
            System.out.println("Input number is less than number1");
        }else if(n > number1) {
            System.out.println("Input number is greater than number1");
        } else {
            System.out.println("2 numbers is equal");
        }
    }
    public static void main(String[] args) {
        compareNumbers(10);
        compareNumbers(500);
        compareNumbers(100);
    }
}
