import javax.swing.JOptionPane;

public class Mascota {
	private int edad = 0;
	private int codigo = 0;
	private String nombreM = "";
	private String especie = "";
	private String usuario = "";

	public void guardarMascota() {
		usuario = JOptionPane.showInputDialog("Señor@ usuario, ingrese su nombre");
		nombreM = JOptionPane.showInputDialog(usuario + ", ingresa el nombre de tu mascota");
		codigo = Integer.parseInt(JOptionPane.showInputDialog(usuario + ", ingresa el código de tu mascota"));
		edad = Integer.parseInt(JOptionPane.showInputDialog(usuario + ", ingresa la edad de tu mascota"));
		especie = JOptionPane.showInputDialog(usuario + ", ingresa la especie de tu mascota");
	}

	public void guardarDatos(int codigo, String nombreM, String especie, int edad) {
		this.nombreM = nombreM;
		this.especie = especie;
		this.codigo = codigo;
		this.edad = edad;
	}

	// Getters y Setters para acceder a los miembros de la clase

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreM() {
		return nombreM;
	}

	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
