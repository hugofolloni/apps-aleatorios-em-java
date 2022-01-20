// Aluno: Hugo Folloni Guarilha - DRE: 121085854

package br.com.bancoomicron.pessoas;

import br.com.bancoomicron.carteiras.CarteiraClientes;
import br.com.bancoomicron.carteiras.IAuditoria;
import br.com.bancoomicron.contas.IConta;

public class Gerente extends Pessoa{

    public Gerente(String cpf, String nome){
        super(cpf, nome);
    }


    public boolean gerenteAuditor(CarteiraClientes carteira_clientes, Auditor auditor) {
        return auditor.auditar(carteira_clientes);
    }

}
