package com.banco;

public class Main {
    public static void main(String[] args){
        Cliente lidia = new Cliente();
        lidia.setNome("Lídia");

        Conta cc = new ContaCorrente(lidia);
        Conta cp = new ContaPoupanca(lidia);

        cc.depositar(50);
        cc.transferir(25, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
