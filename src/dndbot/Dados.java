package dndbot;

public class Dados{
	private int caras;
/***CONSTRUCTORES***/
	public Dados(int caras) {
		this.caras = caras;
	}
	public Dados() {
		caras = 0;
	}
	
/****METODOS****/
	public int getCaras() {
		return caras;
	}

	public void setCaras(int caras) {
		this.caras = caras;
	}
	
	/***
	 * Lanza un dado x veces y retorna la suma delos lanzamientos.
	 * 
	 * @param cantidad: numero de lanzamientos lanzados.
	 * @return lanzamiento 
	 */
	public int tirarDado( int cantidad) {
		int suma=0;
		int valorEntero;
		int	buffer[] = new int[cantidad]; 
		
		for(int i=0;i<cantidad;i++) {
			int minimo = 1;	
			valorEntero = (int) Math.floor(Math.random()*(caras-minimo+1)+minimo);
			buffer[i] = valorEntero; 	
			suma+=valorEntero;
		}
		for(int i=0;i<cantidad;i++) {
			System.out.print(buffer[i]+" ");
		}
		
		return suma;
	}
	
}
