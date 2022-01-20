// Aluno: Hugo Folloni Guarilha - DRE: 121085854

import br.com.bancoomicron.carteiras.CarteiraClientes;
import br.com.bancoomicron.carteiras.CarteiraContas;
import br.com.bancoomicron.contas.*;
import br.com.bancoomicron.pessoas.Auditor;
import br.com.bancoomicron.pessoas.Cliente;
import br.com.bancoomicron.pessoas.Gerente;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTeste 1.");
        CarteiraContas carteira = new CarteiraContas();
        CarteiraClientes carteiraClientes = new CarteiraClientes();
        Cliente c = new Cliente("123123214", "Hugo");
        System.out.println(c.getCpf());
        carteiraClientes.adicionarCliente(c);
        ContaCorrente contaC1 = new ContaCorrente(123132, c.getMatricula());
        ContaCorrente contaC2 = new ContaCorrente(124124, c.getMatricula());
        ContaCorrente contaC3 = new ContaEspecial(124124124, c.getMatricula(), 123123);
        c.adicionarConta(contaC1);
        c.adicionarConta(contaC2);
        c.adicionarConta(contaC3);
        contaC1.depositar(100);
        contaC1.sacar(40);
        System.out.println(contaC1.getSaldo());
        System.out.println(contaC1.getNumero());
        System.out.println("\nTeste 2.");
        Cliente b = new Cliente("123123214", "João");
        ContaCorrente contaB1 = new ContaCorrente(12412421, b.getMatricula());
        carteiraClientes.adicionarCliente(b);
        System.out.println("\nTeste 3.");
        Cliente z = new Cliente("12341212523", "João");
        ContaCorrente contaZ1 = new ContaCorrente(213124, z.getMatricula());
        z.adicionarConta(contaZ1);
        carteiraClientes.adicionarCliente(z);
        carteira.adicionarConta(contaC1);
        carteira.adicionarConta(contaC2);
        carteira.adicionarConta(contaC3);
        carteira.adicionarConta(contaZ1);
        System.out.println(carteiraClientes.geraCarteiraContas());
        System.out.println("\nTeste 4.");
        Auditor auditor = new Auditor("1231232112", "Ricardo");
        Gerente gerente = new Gerente("1241241421", "Marcelo");
        System.out.println(gerente.gerenteAuditor(carteiraClientes, auditor));
    }
}
