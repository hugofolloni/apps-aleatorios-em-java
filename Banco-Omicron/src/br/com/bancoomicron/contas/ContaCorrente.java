// Aluno: Hugo Folloni Guarilha - DRE: 121085854

package br.com.bancoomicron.contas;

import java.io.FileNotFoundException;

public class ContaCorrente implements IConta {

    protected double saldo;
    protected int numero;
    protected int matricula_cliente;

    public ContaCorrente(int numero, int matricula_cliente) {
        this.numero = numero;
        this.matricula_cliente = matricula_cliente;
        this.saldo = 0;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public int getNumero() {
        return numero;
    }
}
