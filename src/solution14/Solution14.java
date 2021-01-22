package solution14;

import java.util.Scanner;

public class Solution14 {
    public static double EARTH_GRAVITY=9.81;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input your weight in earth:\t");
            int weightOnEarth = sc.nextInt();
            WeightConverter weightConverter = new WeightConverter(1.67);
            weightConverter.setWeight(weightOnEarth);
            System.out.println("Weight on Moon:"+String.format("%.2f",weightConverter.getMoonWeight(EARTH_GRAVITY)));
        }
    }
