import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Me diga um número e direi qual é o seu correspondente na sequência Fibonacci.");
        int number = input.nextInt();

        int previous = 1, next = 0, i = 0;

        while(i < number){
            next += previous;
            previous = next - previous;
            i++;
            System.out.println(i + " " + next);
        }

        System.out.println("O número de Fibonacci na posição " + number + " é " + next);


    }

}
