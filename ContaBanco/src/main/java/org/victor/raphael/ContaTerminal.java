package org.victor.raphael;

import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo = 250.00;
        Scanner ler = new Scanner(System.in);

        System.out.println("por favor, digite o número da sua conta: ");
        numero = ler.nextInt();

        System.out.println("agora digite a sua agência bancária: ");
        agencia = ler.next();

        System.out.println("agora digite o seu nome: ");
        nomeCliente = ler.next();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);
    }
}