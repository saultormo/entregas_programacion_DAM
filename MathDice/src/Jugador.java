
//La definición de la clase mediante la palabra reservada Jugador
public class Jugador {

	//Propiedades
	private String name;
	private String surname;
	private int age;
	private int points;
		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	//Constructor
	//Punto de entrada que se ejecuta al crear un objeto de tipo Jugador
	public Jugador() {	
	}

}
