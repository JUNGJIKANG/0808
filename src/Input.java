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
	}

	public void fileInput() {
		for (int i = 0; i < array.length; i++) {
			String line = this.sc.nextLine(); // 1101줄 읽음.
//			String[]values=line.split("\\s+");
//			System.out.println(values[0]);
			Scanner myScanner = new Scanner(line);
			myScanner = myScanner.useDelimiter("\\s+");
			this.array[i] = new Student(myScanner.next(), myScanner.next(), myScanner.nextInt(), myScanner.nextInt(),
					myScanner.nextInt(), myScanner.nextInt());
		}
	}

}
