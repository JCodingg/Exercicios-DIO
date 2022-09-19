package br.com.bootcamp.dio;

import br.com.bootcamp.dio.Calculator;

public class Main {

    public static void main(String[] args) {

        //Calculator
        System.out.println("Exercise Calculator");
        Calculator.soma(3 , 6);
        Calculator.subtracao(9 , 1.8);
        Calculator.multiplicacao( 7 , 8);
        Calculator.divisao(5 , 2.5);

        //Message
        System.out.println("Exercice Message");
        Message.receiveMessage(9);
        Message.receiveMessage(14);
        Message.receiveMessage(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}