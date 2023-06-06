import java.util.HashMap;
import javax.swing.JOptionPane;

public class Procesos {
	private int salir = 0;
	private int opcion = 0;
	private int buscarCodigo = 0;
	private int id = 0;
	private int age = 0;
	private String usuario = "";
	private String type = "";
	private String nameM = "";
	private String buscarnombre = "";
	private HashMap<Integer, Mascota> mapMascotas = new HashMap<Integer, Mascota>();

	public void iniciar() {
		do {
			salir = 0;
			String menu = "Software de ingreso y búsqueda de mascotas\n";
			menu += "1: Ingresar Mascotas \n";
			menu += "2: Buscar Mascotas por Código \n";
			menu += "3: Buscar Mascota por Nombre\n";
			menu += "4: Mostrar la lista de mascotas ingresadas";

			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
				case 1:
					Mascota animal = new Mascota();
					animal.guardarMascota();
					animal.guardarDatos(animal.getCodigo(), animal.getNombreM(), animal.getEspecie(), animal.getEdad());
					mapMascotas.put(animal.getCodigo(), animal);
					break;
				case 2:
					buscarMascota();
					break;
				case 3:
					buscarPorNombre();
					break;
				case 4:
					imprimirMascotas();
					break;
			}
			salir = Integer.parseInt(JOptionPane.showInputDialog(usuario + " Si desea salir, ingrese 0. Si desea continuar, ingrese cualquier otra letra."));
		} while (salir != 0);
	}

	public void buscarMascota() {
		buscarCodigo = Integer.parseInt(JOptionPane.showInputDialog(usuario + " Ingrese el código de su mascota"));
		Mascota mascota = mapMascotas.get(buscarCodigo);
		if (mascota != null) {
			id = mascota.getCodigo();
			age = mascota.getEdad();
			nameM = mascota.getNombreM();
			type = mascota.getEspecie();
			System.out.println(usuario + " El código de su mascota es: " + id + ", la edad de tu perro es " + age + ", el nombre de tu mascota es " + nameM + " y el tipo de mascota es " + type);
		} else {
			System.out.println("No se encontró ninguna mascota con el código ingresado.");
		}
	}

	public void buscarPorNombre() {
		buscarnombre = JOptionPane.showInputDialog(usuario + " Ingrese el nombre de su mascota");
		boolean encontrado = false;
		for (Mascota mascota : mapMascotas.values()) {
			if (buscarnombre.equals(mascota.getNombreM())) {
				encontrado = true;
				id = mascota.getCodigo();
				break;
			}
		}
		if (encontrado) {
			System.out.println("Se encontró una mascota con el nombre '" + buscarnombre + "'. El código de la mascota es: " + id);
		} else {
			System.out.println("No se encontró ninguna mascota con el nombre ingresado.");
		}
	}

	public void imprimirMascotas() {
		for (Mascota mascota : mapMascotas.values()) {
			System.out.println("Código: " + mascota.getCodigo());
			System.out.println("Nombre: " + mascota.getNombreM());
			System.out.println("Especie: " + mascota.getEspecie());
			System.out.println("Edad: " + mascota.getEdad());
			System.out.println("--------------------------- INFORMACIÓN DE LA MASCOTA TERMINADA ---------------------------------");
		}
	}
}
