package solution16;

import solution7.Temperature;

import java.util.Scanner;

public class Solution16 {
    public static final double tax=0.0725;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Number of bags sold: ");
        int numberOfBags = sc.nextInt();
        System.out.println("Input Weight per bag: ");
        int weightPerBag = sc.nextInt();
        System.out.println("Input Price per pound: ");
        double pricePerPound = sc.nextDouble();
        CoffeeBag coffeeBag=new CoffeeBag();
        coffeeBag.setPricePerLb(pricePerPound);
        coffeeBag.setBagWeight(weightPerBag);
        coffeeBag.setNumberOfBags(numberOfBags);
        coffeeBag.getTotalPrice();
        System.out.println("Number of bags sold: "+coffeeBag.getNumberOfBags());
        System.out.println("Weight per bag: "+coffeeBag.getBagWeight()+" lb");
        System.out.println("Price per pound: $"+coffeeBag.getPricePerLb());
        System.out.println("Sales Tax: "+String.format("%.2f",(tax*100))+"%");
        System.out.println("Total Price: $ "+String.format("%.2f",coffeeBag.getTotalPriceWithTax(tax)));
    }
}
