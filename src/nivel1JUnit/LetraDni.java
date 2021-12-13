package nivel1JUnit;

public class LetraDni {
	
private String letra;
	
	public LetraDni (int numDni) {
		String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo = numDni % 23;
		this.letra = juegoCaracteres.charAt(modulo)+"";	
	}
	
	public String getLetra() {
		return letra;
	}
	
	
}
