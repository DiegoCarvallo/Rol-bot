package dndbot;

public class StatsJugador {
	private int fuerza;
	private int destreza;
	private int constitucion;
	private int inteligencia;
	private int sabiduria;
	private int carisma;
	
	public StatsJugador() {
		fuerza = 0;
		destreza = 0;
		constitucion = 0;
		inteligencia = 0;
		sabiduria = 0;
		carisma = 0;
	}
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
			if(fuerza==3||fuerza==4) modFuerza = -3;
			if(fuerza==5||fuerza==6) modFuerza = -2;
			if(fuerza==7||fuerza==8) modFuerza = -1;
		}
		if(fuerza==9||fuerza==10) modFuerza= 0;
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
			if(destreza==3||destreza==4) modDestreza = -3;
			if(destreza==5||destreza==6) modDestreza = -2;
			if(destreza==7||destreza==8) modDestreza = -1;
		}
		if(destreza==9||destreza==10) modDestreza= 0;
		return modDestreza;		
	}
	/***
	 * Funcion que retorna el modificador de constitucion
	 * @return modConstitucion: modificador de constitucion
	 */
	public int modConstitucion() {
		int modConstitucion = 0;
		
		if(constitucion>9||constitucion>10) {
			int valor = constitucion-10;
			if(valor%2 !=0) valor++;
			modConstitucion = valor/2;
		}
		if(constitucion<9||constitucion<10) {
			if(constitucion==3||constitucion==4) modConstitucion = -3;
			if(constitucion==5||constitucion==6) modConstitucion = -2;
			if(constitucion==7||constitucion==8) modConstitucion = -1;
		}
		if(constitucion==9||constitucion==10) modConstitucion= 0;
		return modConstitucion;		
	}
	/***
	 * Funcion que retorna el modificador de inteligencia
	 * @return modInteligencia: modificador de inteligencia
	 */
	public int modInteligencia() {
		int modInteligencia = 0;
		
		if(inteligencia>9||inteligencia>10) {
			int valor = inteligencia-10;
			if(valor%2 !=0) valor++;
			modInteligencia = valor/2;
		}
		if(inteligencia<9||inteligencia<10) {
			if(inteligencia==3||inteligencia==4) modInteligencia = -3;
			if(inteligencia==5||inteligencia==6) modInteligencia = -2;
			if(inteligencia==7||inteligencia==8) modInteligencia = -1;
		}
		if(inteligencia==9||inteligencia==10) modInteligencia= 0;
		return modInteligencia;		
	}
	/***
	 * Funcion que retorna el modificador de sabiduria
	 * @return modSabiduria: modificador de sabiduria
	 */
	public int modSabiduria() {
		int modSabiduria = 0;
		
		if(sabiduria>9||sabiduria>10) {
			int valor = sabiduria-10;
			if(valor%2 !=0) valor++;
			modSabiduria = valor/2;
		}
		if(sabiduria<9||sabiduria<10) {
			if(sabiduria==3||sabiduria==4) modSabiduria = -3;
			if(sabiduria==5||sabiduria==6) modSabiduria = -2;
			if(sabiduria==7||sabiduria==8) modSabiduria = -1;
		}
		if(sabiduria==9||sabiduria==10) modSabiduria= 0;
		return modSabiduria;		
	}
	/***
	 * Funcion que retorna el modificador de carisma
	 * @return modCarisma: modificador de carisma
	 */
	public int modCarisma() {
		int modCarisma = 0;
		
		if(carisma>9||carisma>10) {
			int valor = carisma-10;
			if(valor%2 !=0) valor++;
			modCarisma = valor/2;
		}
		if(carisma<9||carisma<10) {
			if(carisma==3||carisma==4) modCarisma = -3;
			if(carisma==5||carisma==6) modCarisma = -2;
			if(carisma==7||carisma==8) modCarisma = -1;
		}
		if(carisma==9||carisma==10) modCarisma= 0;
		return modCarisma;		
	}
}
