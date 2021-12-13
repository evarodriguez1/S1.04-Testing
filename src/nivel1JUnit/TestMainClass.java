package nivel1JUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMainClass {
	
	//***********EJERCICIO 1****************
	
	@Test  //junit5
	void compruebaLongitud() {
		Meses meses = new Meses();		
		assertEquals(meses.getSize(),12);		
	}

	@Test  //junit5
	void noEsNullElArrayList() {
		Meses meses = new Meses();
		assertNotNull(meses.getLista());
	}
	
	@Test   //junit5
	void posicionAgosto() {
		Meses meses = new Meses();
		assertEquals(meses.getElement(7),"Agosto");
	}
	
	//***********EJERCICIO 2****************
	
	@Test  //junit5
	void compruebaLetra() {
		LetraDni cd = new LetraDni(46657936);		
		assertEquals(cd.getLetra(),"K");
	}
	
	//***********EJERCICIO 3****************
	
	//@Test(expected = IndexOutOfBoundsException.class)
	@Test
    void testExpectedException() {
        int []numeros= {0,1,2,3,4,5};
        // int numero= numeros[10]; // Asi es en la version nueva de junit
        
        //assertThrows espera que se lance esa excepcion dentro de ese trozo de codigo
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        	int numero=numeros[10];
        });

    }
}
