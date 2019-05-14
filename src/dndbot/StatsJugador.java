package dndbot;

public class StatsJugador {
	private int fuerza;
	private int destreza;
	private int constitucion;
	private int inteligencia;
	private int sabiduria;
	private int carisma;
	
	public StatsJugador(int f, int d, int c, int i, int s,int ca) {
		setFuerza(f);
		setDestreza(d);
		setConstitucion(c);
		setInteligencia(i);
		setSabiduria(s);
		setCarisma(ca);
	}
	/********GETTERS Y SETTERS********/
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getConstitucion() {
		return constitucion;
	}

	public void setConstitucion(int constitucion) {
		this.constitucion = constitucion;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	public int getCarisma() {
		return carisma;
	}

	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	/***METODOS***/
	/***
	 * funcion la cual calcula el modificador de el stat fuerza
	 *
	 * @return modFuerza: el modificador de fuerza
	 */
	public int modFuerza() {
		int modFuerza = 0;
		
		if(fuerza>9||fuerza>10) {
			int valor = fuerza-10;
			if (valor%2 != 0) valor++;//si es impar, nos aseguramos que tome le valor mayor.
			modFuerza = valor/2;
		}
		if(fuerza<9||fuerza<10) {
			modFuerza = fuerza/2;
		}
		
		return modFuerza;
	}
	/***
	 * Funcion que retorna el modificador de destreza
	 * @return modDestreza: modificador de destreza
	 */
	public int modDestreza() {
		int modDestreza = 0;
		
		if(destreza>9||destreza>10) {
			int valor = destreza-10;
			if(valor%2 !=0) valor++;
			modDestreza = valor/2;
		}
		if(destreza<9||destreza<10) {
			modDestreza = destreza/2;
		}
				
		return modDestreza;		
	}
}
