// Aluno: Hugo Folloni Guarilha - DRE: 121085854 

public class Veiculo {

    public String marca;
    public String modelo;
    public String dono;
    private double tanque_capacid;
    private double tanque_atual;
    private double autonomia_km_l;
    private double km_rodados;

    public Veiculo(String marca, String modelo, String dono, double tanque_capacid, double autonomia_km_l){

        this.marca = marca;
        this.modelo = modelo;
        this.dono = dono;
        this.tanque_atual = 0;
        this.km_rodados = 0;

        if(validarProp(tanque_capacid) == true){
            this.tanque_capacid = tanque_capacid;
        }
        else{
            System.out.println("Parâmetro inválido!");
            this.tanque_capacid = 10;
        }

        if(validarProp(autonomia_km_l) == true){
            this.autonomia_km_l = autonomia_km_l;
        }
        else{
            System.out.println("Parâmetro inválido!");
            this.tanque_capacid = 10;
        }
    }

    public double lerTanqueAtual(){
        return tanque_atual;
    }

    public double lerTanqueCapacid(){
        return tanque_capacid;
    }

    public double lerAutonomia(){
        return autonomia_km_l;
    }

    public double lerRodagem(){
        return km_rodados;
    }

    public boolean alterarAutonomia(double nova_autonomia) {
        if (validarProp(nova_autonomia) == true){
            this.autonomia_km_l = nova_autonomia;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean abastecerTanque(double litros){
        if(validarProp(litros) == true){
            if(tanque_atual + litros <= tanque_capacid){
                tanque_atual += litros;
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public boolean fazerViagem(double km){
        if(km / autonomia_km_l <= tanque_atual){
            km_rodados += km;
            tanque_atual -= km / autonomia_km_l;
            return true;
        }
        else{
            return false;
        }
    }

    private boolean validarProp(double valor){
        if(valor > 0){
            return true;
        }
        else{
            return false;
        }
    }

}
