import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InputTest {
	private Student[] array;
	private Input input;

	@Before
	public void init() {
		array = new Student[12];
		String path = "C:/temp/sungjuk_utf8.dat";
		input = new Input(array, path);
	}

	@Test
	public void testInput() {
		this.input.fileInput();
		for(Student student:this.array) {
			System.out.println(student);
		}
//		assertEquals((78 + 87 + 83 + 78),
//				(this.array[0].getKor() + this.array[0].getEng() + this.array[0].getMat() + this.array[0].getEdp()));
	}
//	@Override
	

}
