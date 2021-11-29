import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args){

        System.out.println("Write a sequence of numbers to sum! A 0 finish the run.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = number;

        while(number != 0){
            number = input.nextInt();
            sum += number;
        }

        System.out.println("Your sum is: " + sum);
    }
}
