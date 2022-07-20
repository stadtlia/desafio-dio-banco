package com.banco;

public class Conta implements IConta{
    
    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
    @Override
    public void sacar(double valor){
        saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgencia() {
        return this.agencia;
    }

    public int getConta() {
        return this.conta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    protected void imprimirInfos(){
        System.out.println(String.format("Titular %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public void imprimirExtrato() {
             
    }
    
}
