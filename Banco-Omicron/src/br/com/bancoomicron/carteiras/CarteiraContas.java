// Aluno: Hugo Folloni Guarilha - DRE: 121085854

package br.com.bancoomicron.carteiras;

import br.com.bancoomicron.contas.ContaCorrente;
import br.com.bancoomicron.contas.IConta;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarteiraContas implements IAuditoria {

    private ArrayList<IConta> contas;

    public CarteiraContas() {
        this.contas = new ArrayList<>();
    }

    public int tamanho() {
        return this.contas.size();
    }

    @Override
    public int quantidadeContas() {
        return this.tamanho();
    }

    @Override
    public double somaSaldo() {
        double soma = 0;
        for (int i=0;i<this.contas.size();++i) {
            IConta c = this.contas.get(i);
            soma += c.getSaldo();
        }
        return soma;
    }

    public void adicionarConta(IConta c) {
        this.contas.add(c);
    }

    public boolean removerConta(int numero) {
        for (int i=0;i<this.contas.size();++i) {
            IConta c = this.contas.get(i);
            if (c.getNumero() == numero) {
                this.contas.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<IConta> getContas(){
        ArrayList<IConta> array = new ArrayList<IConta>();
        for(int i = 0; i < this.contas.size(); ++i){
            array.add(contas.get(i));
        }
        return array;
    }


}
