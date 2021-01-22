package solution12;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Height in cm: ");
        double height= sc.nextDouble();
        System.out.println("Input Age: ");
        int age=sc.nextInt();
        Height height1=new Height();
        height1.setHeight(height);
        height1.setAge(age);
        double weight=height1.getRecommendedWeight();
        System.out.println("Weight: "+weight);
    }
}
