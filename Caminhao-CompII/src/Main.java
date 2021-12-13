import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");

        Caminhao caminhao = new Caminhao("Mercedes", "km0", "hugo", 900, 5, 150, 0);

        Caminhao caminhao2 = new Caminhao("AGO", "kmTanto", "hugo", 900, 5, 250, 150, 0);

        caminhao.lerRodagem();

        caminhao2.lerRodagem();

        input.close();
    }
}
