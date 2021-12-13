/*
 Cree una clase con un método que lance una ArrayIndexOutOfBoundsException. 
 Verifique su correcto funcionamiento con un test jUnit.
 */
package nivel1JUnit;
import java.util.ArrayList;

public class ArrayException {

	private int[] array = {0, 1, 2, 3, 4, 5};
	
	int getIndex(int index) {
		 return array[index];
	}
	/*
	int getSize(int size) {
		return array.length;
	}
	
	*/
}
