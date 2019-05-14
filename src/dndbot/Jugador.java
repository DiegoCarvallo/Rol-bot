package dndbot;

public class Jugador {
	/***INFORMACION DEL JUGADOR***/
	private String nombre_personaje; 
	private String raza;
	private String string;
	private int nivel;
	private String Alineamineto; 
	private String Deidad;
	private int altura;
	private int edad;
	private String sexo;
	private int peso;
	private String Campania;
	
	
	/*******************GETTER & SETTERS****************/
	public String getNombre_personaje() {
		return nombre_personaje;
	}
	public void setNombre_personaje(String nombre_personaje) {
		this.nombre_personaje = nombre_personaje;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getAlineamineto() {
		return Alineamineto;
	}
	public void setAlineamineto(String alineamineto) {
		Alineamineto = alineamineto;
	}
	public String getDeidad() {
		return Deidad;
	}
	public void setDeidad(String deidad) {
		Deidad = deidad;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getCampania() {
		return Campania;
	}
	public void setCampania(String campania) {
		Campania = campania;
	}
	
	
	
}
