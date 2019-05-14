package dndbot;
import java.io.*;
public class MainClass {
	
	public static void main(String args[]) throws IOException{
		int tipo =0;
		int cantidad;
		Dados d = new Dados(tipo); //instancia de dados
		StatsJugador stats = new StatsJugador(); //instancia de estadisticas iniciales
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); //read
		String linea;
		/***	TIRADA INICIAL	***/
		System.out.println("tirada inicial de estadisticas");
		d.setCaras(6);
		/*fuerza*/
		stats.setFuerza(d.tirarDado(3));
		System.out.println("tu fuerza actual es "+ stats.getFuerza());
		System.out.println("tu modificador de fuerza es "+ stats.modFuerza());
		/*destreza*/
		stats.setDestreza(d.tirarDado(3));
		System.out.println("tu destreza actual es "+ stats.getDestreza());
		System.out.println("tu modificador de destreza es "+ stats.modDestreza());
		/*constitucion*/
		stats.setConstitucion(d.tirarDado(3));
		System.out.println("tu constitucion actual es "+ stats.getConstitucion());
		System.out.println("tu modificador de constitucion es "+ stats.modConstitucion());
		/*inteligencia*/
		stats.setInteligencia(d.tirarDado(3));
		System.out.println("tu fuerza inteligencia es "+ stats.getInteligencia());
		System.out.println("tu modificador de inteligencia es "+ stats.modInteligencia());
		/*sabiduria*/
		stats.setSabiduria(d.tirarDado(3));
		System.out.println("tu sabiduria actual es "+ stats.getSabiduria());
		System.out.println("tu modificador de sabiduria es "+ stats.modSabiduria());
		/*carisma*/
		stats.setCarisma(d.tirarDado(3));
		System.out.println("tu carisma actual es "+ stats.getCarisma());
		System.out.println("tu modificador de carisma es "+ stats.modCarisma());
		
		/********************************************************************************************************/
		/*****SACAR DE UNA TIRADA DE NOTACION STANDAR "ndm" (con n cantidad y m tipo de dado) la informacio*****/
		System.out.println("ingrese tirada");
		linea = lector.readLine();
		String[]parts = linea.split("d");
		String part1 = parts[0];
		String part2 = parts[1];
		tipo = Integer.parseInt(part2);
		cantidad = Integer.parseInt(part1);
		
		d.setCaras(tipo);
		
		System.out.println("la suma de la tirada es: "+ d.tirarDado(cantidad));
		
		
	}
	
}
