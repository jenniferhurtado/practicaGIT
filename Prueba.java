import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Prueba {

	private BinaryString bitset1, bitset2;
	private String pruebaString2 = "1010101010";;

	// Para cada Test inicializamos antes su correspondiente bitset con su
	// String asociado.
	@Before
	public void antesDelTest() {
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(pruebaString2);
	}

	// Comprobamos si al inicar el bitset (con los dos constructores) el tamaño
	// es el esperado.
	@Test
	public void testLength() {
		assertEquals(10, bitset1.length());
		assertEquals(10, bitset2.length());
	}
}