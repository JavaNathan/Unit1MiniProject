import java.util.Scanner;
public class Unit1MiniProject
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter your bill in dollars and cents: "); // Asks for the bill amount.
        double bill = scan.nextDouble();
        System.out.println();
        System.out.println("Enter the tip percentage as a whole number: ");
        double wholeNumTip = scan.nextDouble();
        double tipPercent = wholeNumTip / 100;  // Divides by 100 to make a fraction/Decimal
        System.out.println();
        System.out.println("Enter the number of people in your party: ");
        int peopleNum = scan.nextInt();
        double tipAmount = bill * tipPercent; // The tip percentage determines how much from the bill.
        double totalCost = bill + tipAmount; // The total amount of money is the bill and tip added.
        double tipPerPerson = tipAmount / peopleNum; // The tip amount is split evenly amongst members.
        double totalPerPerson = (bill / peopleNum) + tipPerPerson; // Each person pays an equal amount of the tip and bill.
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.print("Here is the total tip amount: $");
        System.out.println(String.format("%.2f", tipAmount));
        System.out.println();
        System.out.print("Your total bill, including tip: $");
        System.out.println(String.format("%.2f", totalCost));
        System.out.println();
        System.out.print("Tip per person (in your party): $");
        System.out.println(String.format("%.2f", tipPerPerson));
        System.out.println();
        System.out.print("Total cost per person in your party: $");
        System.out.println(String.format("%.2f", totalPerPerson));
        System.out.println();
    }
}
