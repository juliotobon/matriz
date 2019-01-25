package matriz;

import java.util.Random;
import java.util.Scanner;

public class Matriz {
	
	public static int filas, columnas;
	
	public static Entrada IngresarParametros() {
		
		Entrada entradas;
		//int filas,columnas;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el numero de filas que quiere para su matriz");
		filas= (entrada.nextInt());
		System.out.println("ingrese el numero de filas que quiere para su matriz");
		columnas= (entrada.nextInt());
		
		Entrada miEntradas= new Entrada(filas, columnas);
		
		
		return miEntradas;
		
	}
	
	public static int [][] llenarMatriz(int filas, int columnas){
		
		int aux;
		int [][] matriz = new int [filas][columnas];
		Random rnd=new Random();
		
		
	for (int i=0; i<filas; i++) {
			
			for(int j=0; j<columnas; j++){
			
				aux=  rnd.nextInt(25);
				
				matriz [i][j]= aux;
		}
	}
		
		return matriz;
	}
	
	public static void mostrarMatrizLlena (int matriz [][]) {
		
		
		  for (int i=0; i<filas; i++) {
				
			     for(int j=0; j<columnas; j++){
					
					System.out.print(matriz[i][j]+"\t");
				}
			     System.out.println("\n");
		   }
	}
	

	public static void main(String[] args) {
		 
		//https://github.com/juliotobon/matriz.git
		
		IngresarParametros();
		mostrarMatrizLlena(llenarMatriz(filas, columnas));		
	
		
	}

}
