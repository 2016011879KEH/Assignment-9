import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SaveTextFile {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			FileWriter file = new FileWriter("text.txt");
			System.out.println("Please enter a sentence!");
			while(true) {
				String sentence = input.nextLine();
				if(sentence.length()==0) {
					break;
				}
				file.write(format.format(date)+"   ");
				file.write(sentence);
				file.write("\r\n");
			}
			file.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}