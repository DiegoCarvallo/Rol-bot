package dndbot;
import java.io.*;
public class MainClass {
	
	public static void main(String args[]) throws IOException{
		int tipo;
		int cantidad;
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		
		/*****SACAR DE UNA TIRADA DE NOTACION STANDAR "ndm" (con n cantidad y m tipo de dado) la informacio*****/
		System.out.println("ingrese tirada");
		linea = lector.readLine();
		String[]parts = linea.split("d");
		String part1 = parts[0];
		String part2 = parts[1];
		tipo = Integer.parseInt(part2);
		cantidad = Integer.parseInt(part1);
		
		Dados d = new Dados(tipo);
		System.out.println("\nla suma de la tirada es: "+ d.tirarDado(cantidad));
		
		/*System.out.println("ingrese cantidad de caras del dado");
		tipo = Integer.parseInt(lector.readLine());
		Dados d = new Dados(tipo);
		System.out.println("ingrese cantidad de la tirada");
		cantidad = Integer.parseInt(lector.readLine());
		
		System.out.println("la suma de la tirada es"+ d.tirarDado(cantidad));
	*/
	}
	
}
