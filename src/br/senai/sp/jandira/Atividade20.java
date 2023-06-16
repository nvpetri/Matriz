package br.senai.sp.jandira;

public class Atividade20 {

	public static void main(String[] args) {
		
		//ff

		 int matrizA[] = {8, 4, 6, 12, 45, 444, 74, 41, 65, 69, 11, 52, 75, 655, 845, 741, 899, 999, 201, 7};
	        int matrizB[] = new int[matrizA.length];
	        int i = 0;
	        int b = matrizA.length -1;

	        System.out.println("------------------------------------");
	        System.out.println("       Valores da Matriz A ");
	        System.out.println("------------------------------------");
	        System.out.println();

	        while (i < matrizA.length) {
	            System.out.println("O valor " + (i + 1) + " é igual a " + matrizA[i]);
	            i++;
	        }

	        System.out.println("------------------------------------");
	        System.out.println("       Valores da Matriz B ");
	        System.out.println("------------------------------------");
	        System.out.println();

	        i = 0;
	        
	        //ff

	        while (i < matrizA.length) {
	            matrizB[i] = matrizA[b];
	            System.out.println("O valor " + (i + 1) + " é igual a " + matrizB[i]);
	            i++;
	            b--;
	        }
	    }
	}