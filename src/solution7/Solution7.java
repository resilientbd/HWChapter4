package solution7;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input temperature in Fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        Temperature temperature = new Temperature();
        temperature.setTemperature(fahrenheit);
        System.out.println("Celsius: "+temperature.fahrenheitToCelsius());
    }

}
