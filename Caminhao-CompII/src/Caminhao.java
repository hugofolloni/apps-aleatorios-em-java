// Aluno: Hugo Folloni Guarilha - DRE: 121085854 

public class Caminhao extends Veiculo {

    public int qnt_eixos;
    private double capacid_carga;

    
    public Caminhao(String marca, String modelo, String dono, double tanque_capacid, double autonomia_km_l,  double capacid_carga, int qnt_eixos){
        super(marca, modelo, dono, tanque_capacid, autonomia_km_l);
        
        this.qnt_eixos = qnt_eixos;
        this.capacid_carga = capacid_carga;
        
        
    }
    
    public Caminhao(String marca, String modelo, String dono, double tanque_capacid, double autonomia_km_l, double km_rodados, double capacid_carga, int qnt_eixos){
        super(marca, modelo, dono, tanque_capacid, autonomia_km_l);

        super.alterarKMRodados(km_rodados);
        this.qnt_eixos = qnt_eixos;
        this.capacid_carga = capacid_carga;

    }

    public double lerCapacidCarga(){
        return capacid_carga;
    }

    public boolean fazerViagem(double km, double carga){
        if(carga <= capacid_carga){
            super.fazerViagem(km);
            return true;
        }
        else{
            return false;
        }
    }

}
