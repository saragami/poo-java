package entidades;

public class test {
	public static void main (String []args) {
		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, "evilFelipe@gmail.com", "555-333-4444", "ABC123", "90876567389", "Bell Boy");
		Empleado otroEmpleado = new Empleado("Mariana", 19, "mariana@gmail.com", "90876567389", "ABC123", "Bell Boy");
		
		otroEmpleado.mostrarInformacion();
		EvilFelipe.mostrarInformacion();
	}

}
