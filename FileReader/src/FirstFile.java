import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstFile {
	public static void main(String[] args) throws IOException {
		File file = new File("notes.txt");
		System.out.println(file.exists());
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.write("Around the rugged rock ran the ragged rascal");

		pw.close();

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(lineCount);
		}

	}
}
