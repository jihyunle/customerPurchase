/*Canvas assignment
 * Jennifer Lee
 * 1/16/2019
 * Calculate the total amount that the customer has to pay
 * */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // declare variables
        String name;
        double purchase_amt;
        int tax_code;
        double sales_tax;
        double total_amt;

        // get inputs
        System.out.println("Enter the customer's name: ");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        System.out.println("Enter the purchase amount: ");
        purchase_amt = keyboard.nextDouble();
        System.out.println("Enter the tax code. Must be in integer between 0 and 3: ");
        tax_code = keyboard.nextInt();

        // calculate sales tax depending on tax code
        if(tax_code == 0){
            sales_tax = 0.0;
        }else if (tax_code == 1){
            sales_tax = 0.03;
        }else if (tax_code == 2){
            sales_tax = 0.05;
        }else if (tax_code == 3) {
            sales_tax = 0.07;
        }else
            sales_tax = -1;

        // calculate total_amt amount due
        total_amt = purchase_amt * (1 + sales_tax);

        // display outputs
        System.out.println("The customer's name is " + name);
        System.out.println("The purchase amount is $ " + purchase_amt);
        System.out.println("The sales tax is " + sales_tax * 100 + " %");
        System.out.println("The total amount due is $ " + total_amt);


    }
}
