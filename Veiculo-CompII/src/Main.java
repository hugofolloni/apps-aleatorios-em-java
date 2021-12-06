import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome do carro:");
        String nome = input.nextLine();

        System.out.println("Insira a marca do carro:");
        String marca = input.nextLine();

        System.out.println("Insira o nome do dono do veículo:");
        String dono = input.nextLine();

        System.out.println("Inisira a capacidade do tanque do carro:");
        double tanque_capacid = input.nextDouble();

        System.out.println("Insira a autonomia do carro em km/l:");
        double autonomia_km_l = input.nextDouble();

        Veiculo veiculo = new Veiculo(marca, nome, dono, tanque_capacid, autonomia_km_l);
        System.out.println(marca + " " + nome + " de " + dono + " " + tanque_capacid + " " + autonomia_km_l);

        veiculo.lerAutonomia();
        veiculo.lerTanqueAtual();
        veiculo.lerRodagem();
        veiculo.lerTanqueCapacid();

        veiculo.abastecerTanque(100);
        veiculo.lerTanqueAtual();

        veiculo.fazerViagem(50);
        veiculo.lerTanqueAtual();
        veiculo.lerRodagem();

        veiculo.alterarAutonomia(20);
        veiculo.lerAutonomia();

        input.close();
    }
}
