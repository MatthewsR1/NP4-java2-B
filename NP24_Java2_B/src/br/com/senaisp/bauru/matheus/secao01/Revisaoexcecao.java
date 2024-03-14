package br.com.senaisp.bauru.matheus.secao01;

import java.util.Scanner;

public class Revisaoexcecao {

	public static void main(String[] args) {
          Scanner scn = new Scanner (System.in);
          int valor = 0;
          do {
        	System.out.println("Digite o valor :");
        	
        	try {
				valor = scn.nextInt();
			} catch (Exception e) {
				System.out.println("Voce não digitou um numero ! Redigite ! ");
				scn.nextLine();
				e.printStackTrace();
			}
        	
          }while (valor<100);
          scn.nextLine(); // para capturar o enter do nextInt
          System.out.println("Deseja continuar? (S/N; ");
          String cont = scn.nextLine();
          System.out.println("Voce digitou "+ cont);
          
          scn.close();
	}

}
