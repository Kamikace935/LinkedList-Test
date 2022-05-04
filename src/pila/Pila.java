package pila;

import java.util.LinkedList;
import java.util.Scanner;

public class Pila {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		
		sc.close();
		
	}

	public static void Menu(Scanner sc)
	{
		System.out.println("Opciones:"
				+ "\n1.-Listar nombres"
				+ "\n2.-Añadir nombre"
				+ "\n3.-Extraer nombre"
				+ "\n4.-Eliminar nombre"
				+ "\n5.-Eliminar todos"
				+ "\n6.-Salir");
		
		System.out.print("Introduce la opción: ");
		int opt = Integer.valueOf(sc.nextLine());
		
		switch(opt) 
		{
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("La opción introducida no es valida");
		}
	}
}
