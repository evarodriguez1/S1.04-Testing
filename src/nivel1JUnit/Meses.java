package nivel1JUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Meses {
	
	private List<String> listaMeses;
	
	public Meses() { 
		listaMeses = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo",
				"Junio","Julio","Agosto","Septiembre",
				"Octubre","Noviembre","Diciembre");
	}
	
	public int getSize() {
		return this.listaMeses.size();
	}	
	
	public String getElement(int pos) {
		return listaMeses.get(pos);
	}
	
	public List<String> getLista() {
		return listaMeses;
	}

}
