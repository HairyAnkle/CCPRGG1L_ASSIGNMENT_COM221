import java.util.Scanner;

public class Assignment2 {
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        myOrder();
    }
        static void myOrder() {
        System.out.println("Sir, May I take your Order? ");

        String myfirstOrder = scan.next();
        System.out.print("Enter the exact ammount of an item ");
        Double firstorderPrice = scan.nextDouble();

        System.out.print("What would you like to order next? ");
        String mysecondOrder = scan.next();
        System.out.print("Enter the exact ammount of an item ");
        Double secondorderPrice = scan.nextDouble();

        System.out.print("How about drink sir? Would you like to order for your drinks? ");
        String mylastOrder = scan.next();
        System.out.print("Enter the exact ammount of an item ");
        Double lastorderPrice = scan.nextDouble();


        Double total = firstorderPrice + secondorderPrice + lastorderPrice;
        System.out.println("Your orders are " + myfirstOrder + " " + mysecondOrder + " " +  mylastOrder + ", am I right sir?");
        System.out.println(total);

    }
}
