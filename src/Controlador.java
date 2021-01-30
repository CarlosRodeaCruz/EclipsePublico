
public class Controlador {

	public static void main(String[] args) {
		
		DAOPersonaImpl p = new DAOPersonaImpl();
		
		System.out.println("Resultado: "+p.operacion(4, 5));

	}

}
