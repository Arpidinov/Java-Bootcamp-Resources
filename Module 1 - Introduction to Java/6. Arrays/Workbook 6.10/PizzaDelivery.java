import java.util.Scanner;
import java.util.Arrays;
public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?");
        int num = scan.nextInt();
        String[] requests = new String[num];
        System.out.println("Great, enter each topping!");
        scan.nextLine();
        for (int i =0;i<num;i++){

            System.out.print(i +". ");
            requests[i] = scan.nextLine();
        }
        System.out.println("\nThank you! Here are the toppings you ordered");
        for(int i = 0;i<requests.length;i++){
            System.out.println(i+". " + requests[i]);
        }
        System.out.println("\n Press anything to confirm your order ");
        scan.nextLine();
        System.out.println("Greate, a driver is on the way!");


        scan.close();



    }
}
