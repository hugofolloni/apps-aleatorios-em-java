import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Me diga um número e calcularei o fatorial dele.");

        int number = input.nextInt(), initialNumber = number, mult = 1;

        while(number > 0){
            mult *= number;
            number -= 1;
        }

        System.out.println("O fatorial de " + initialNumber + " é " + mult);

    }
}
