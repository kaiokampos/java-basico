package com.kaiokampos.estruturaWhile;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
    /*
    Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
     */

        Scanner sc = new Scanner(System.in);
        int codigo = 0;
        int c1Alcool = 0;
        int c2Gasolina = 0;
        int c3Diesel = 0;

        while (codigo != 4) {
            System.out.println("Você deve digitar um código entre 1 e 4");
            codigo = sc.nextInt();
            if (codigo == 1) {
                System.out.println("Você abasteceu com o combustivel Alcool!");
                c1Alcool += 1;
            } else if (codigo == 2) {
                System.out.println("Você abasteceu com o combustivel Gasolina!");
                c2Gasolina += 1;
            } else if (codigo == 3) {
                System.out.println("Você abasteceu com o combustivel Disel!");
                c3Diesel += 1;
            }
            if (codigo == 4) {
                System.out.println("Saindo");
                break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + c1Alcool);
        System.out.println("Gasolina: " + c2Gasolina);
        System.out.println("Diesel: " + c3Diesel);

        sc.close();
    }
}
