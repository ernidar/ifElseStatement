import java.util.Scanner;

public class ifElseStatement {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println("input a number : ");


            if (number > 10) {
                System.out.println("Number is greater than 10.");
            } else if (number < 10){
                System.out.println("Number is smaller than 10.");
            } else {
                System.out.println("Number is equal 10");
            }

            System.out.println("Application finished.");
        }

}
