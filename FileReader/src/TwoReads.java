import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TwoReads {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedReader br2 = null;

		int lineCount = 0;
		try {
			br = new BufferedReader(new FileReader("notes.txt"));
			br2 = new BufferedReader(new FileReader("notes.txt"));
			String contentLine = br.readLine();
			while (contentLine != null) {
				lineCount++;
				contentLine = br.readLine();

			}
			System.out.println("Line count: " + lineCount);
			int num = 0;
			char ch;
			while ((num = br2.read()) != -1) {
				ch = (char) num;
				System.out.print(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ioe) {
				System.out.println("Error in grac");
			}
		}
	}
}
