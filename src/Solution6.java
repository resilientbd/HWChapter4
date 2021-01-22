import java.util.Scanner;
public class Solution6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number of seats A: ");
        int numberOfA_Seats= sc.nextInt();
        System.out.println("Input number of seats B: ");
        int numberOfB_Seats=sc.nextInt();
        System.out.println("Input number of seats C: ");
        int numberOfC_Seats=sc.nextInt();
        System.out.println("Input price of seats A: ");
        int pricePerA_Seat=sc.nextInt();
        System.out.println("Input price of seats B: ");
        int pricePerB_Seat= sc.nextInt();
        System.out.println("Input price of seats C: ");
        int pricePerCSeat=sc.nextInt();
        Solution6 calculate=new Solution6();
        int total=calculate.calculateSell(numberOfA_Seats,pricePerA_Seat)+
                calculate.calculateSell(numberOfB_Seats,pricePerB_Seat)+
                calculate.calculateSell(numberOfC_Seats,pricePerCSeat);
        System.out.println("Total Sell:"+total);
    }
    private int calculateSell(int seats, int price){
        return seats*price;
    }
}
