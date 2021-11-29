import java.util.Random;
import java.util.Scanner;

public class PiFinder {
    public static void main(String args[]){

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        double dentro = 0;

        System.out.println("Me diga um número de pontos que calcularei o valor aproximado de pi para ele.\nLembrando, quanto maior o número, mais preciso será, porém mais demorado.");
        int i = input.nextInt();

        if(i > 1000000){
            i = 1000000;
        }

        int j = 0;

        while(j < i){
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            double distanceToCenter = (x * x) + (y * y);

            if(distanceToCenter <= 1){
                dentro++;
            }

            j++;
        }

        double aproxPi = 4 * dentro / i;

        System.out.println("O valor de pi aproximado para " + j + " pontos é de: " + aproxPi);
    }
}
