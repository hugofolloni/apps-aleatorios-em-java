// Aluno: Hugo Folloni Guarilha - DRE: 121085854

package br.com.bancoomicron.pessoas;

import br.com.bancoomicron.carteiras.CarteiraContas;
import br.com.bancoomicron.contas.ContaCorrente;
import br.com.bancoomicron.contas.IConta;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    private CarteiraContas contas;
    private int matricula;
    public static int gerador_matricula = 1;

    public Cliente(String cpf, String nome) {
        super(cpf,nome);
        this.contas = new CarteiraContas();
        this.matricula = Cliente.geraMatricula();
    }

    public Cliente(String cpf, String nome, IConta conta) {
        super(cpf,nome);
        this.contas = new CarteiraContas();
        this.contas.adicionarConta(conta);
        this.matricula = Cliente.geraMatricula();
    }

    public double somaSaldos() {
        return this.contas.somaSaldo();
    }

    public static int geraMatricula() {
        int matricula = Cliente.gerador_matricula;
        Cliente.gerador_matricula += 1;
        return matricula;
    }

    public int numContas() { return this.contas.tamanho(); }

    public int getMatricula() { return this.matricula; };

    public void adicionarConta(IConta c) {
        this.contas.adicionarConta(c);
    }

    public boolean removerConta(int numero_conta) {
        return this.contas.removerConta(numero_conta);
    }

    public ArrayList<IConta> getContas(){
        return this.contas.getContas();
    }

}
