import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Student[] array;
	private Scanner sc;
	private File file;

	public Input(Student[] array, String path) {
		this.array = array;
		this.file = new File(path);
		try {
			this.sc = new Scanner(this.file, "utf-8");
			System.out.println("File Found");
		} catch (FileNotFoundException e) {
			System.out.println("404 Not Found");
		}
		this.file = file;
	}

}
