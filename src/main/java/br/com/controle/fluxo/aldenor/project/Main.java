package br.com.controle.fluxo.aldenor.project;

import br.com.controle.fluxo.aldenor.project.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;
        System.out.println("Digite o primeiro parâmetro");
        while(parametroUm == 0) {
            String numberString = scanner.next();
            if(isNumber(numberString)) {
                int value = Integer.parseInt(numberString);
                if(value != 0) parametroUm = value;
                else System.out.println("Informe um valor diferente de zero.");
            } else System.out.println("Por favor informe um numero valido.");
        }
        System.out.println("Digite o segundo parâmetro");
        while(parametroDois == 0) {
            String numberString = scanner.next();
            if(isNumber(numberString)) {
                int value = Integer.parseInt(numberString);
                if(value != 0) parametroDois = value;
                else System.out.println("Informe um valor diferente de zero.");
            } else System.out.println("Por favor informe um numero valido.");
        }
        try {
            contar(parametroUm, parametroDois);
        } catch (Exception ignored) {
            System.out.println("Informe os valores sendo, que o valor 1, seja maior, que o valor2.");
        }
        scanner.close();
    }

    public static void contar(int value1, int value2) throws ParametrosInvalidosException {
        if(value1 > value2) {
            throw new ParametrosInvalidosException();
        }
        for (int intervalo = value2-value1; intervalo<value2; intervalo++) {
            System.out.println("Intervalos de numero: " + intervalo);
        }
    }

    public static boolean isNumber(String numberString) {
        try {
            Integer.parseInt(numberString);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }




}
