// Aluno: Hugo Folloni Guarilha - DRE: 121085854

package br.com.bancoomicron.carteiras;

import br.com.bancoomicron.contas.IConta;
import br.com.bancoomicron.pessoas.Cliente;

import java.util.ArrayList;

public class CarteiraClientes implements IAuditoria {

    private ArrayList<Cliente> clientes;
    public CarteiraClientes() {
        this.clientes = new ArrayList<>();
    }

    public int quantidadeContas() {
        int cnt = 0;
        for (int i = 0;i<this.clientes.size();++i) {
            Cliente c = this.clientes.get(i);
            cnt += c.numContas();
        }
        return cnt;
    }

    public double somaSaldo() {
        double soma = 0;
        for (int i=0;i<this.clientes.size();++i) {
            Cliente c = this.clientes.get(i);
            soma += c.somaSaldos();
        }
        return soma;
    }

    public void adicionarCliente(Cliente c) {
        int i = this.getIndicePorCPF(c.getCpf());
        try {
            if (i == -1) {
                this.clientes.add(c);
            } else {
                throw new Exception("Cliente de CPF" + c.getCpf() + " já cadastrado");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int getIndicePorCPF(String cpf) {
        for (int i=0;i<this.clientes.size();++i) {
            Cliente c = this.clientes.get(i);
            if (c.getCpf().equals(cpf)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removerCliente(String cpf) {
        int i = this.getIndicePorCPF(cpf);
        if (i < 0) {
            return false;
        } else {
            this.clientes.remove(i);
            return true;
        }
    }

    public int removerCliente(String[] cpfs) {
        int cnt = 0;
        for (int i=0;i<cpfs.length;++i) {
            if (removerCliente(cpfs[i])) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public Cliente buscaCPF(String cpf) {
        int i = this.getIndicePorCPF(cpf);
        if (i >= 0) {
            return this.clientes.get(i);
        } else {
            return null;
        }
    }


    public CarteiraContas geraCarteiraContas(){
        CarteiraContas carteira = new CarteiraContas();
        for(int i = 0; i < this.clientes.size(); ++i){
            for(int j = 0; j < this.clientes.get(i).getContas().size(); ++j){
               carteira.adicionarConta(this.clientes.get(i).getContas().get(j));
            }
        }
        return carteira;
    }

}
