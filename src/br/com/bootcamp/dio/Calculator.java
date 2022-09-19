package br.com.bootcamp.dio;


/**
 * Classe de exemplo para exercicio da Aula 1 de Métodos
 */

public class Calculator {

    public static void soma(double number1, double number2) {

        double result = number1 + number2;

        System.out.println("A soma é: " + number1 + " mais " + number2 + " é " + result);

    }
    public static void subtracao(double number1, double number2) {

        double result = number1 - number2;

        System.out.println("A subtracao é: " + number1 + " menos " + number2 + " é " + result);

    }
    public static void multiplicacao(double number1, double number2) {

        double result = number1 * number2;

        System.out.println("A multiplicacao é: " + number1 + " vezes " + number2 + " é " + result);

    }
    public static void divisao(double number1, double number2) {

        double result = number1 / number2;

        System.out.println("A divisao é: " + number1 + " por " + number2 + " é " + result);

    }

}
