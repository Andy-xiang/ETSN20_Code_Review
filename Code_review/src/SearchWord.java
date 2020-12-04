
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

	public class SearchWord {
			
		public static void main(String[] args) throws IOException {
			
			System.out.println("Enter the word to seach for and the file to search in: ");
			Scanner scan = new Scanner(System.in);
	        String inputData = scan.nextLine();
	        String[] split = inputData.split(" ");
	        scan.close();
	        
	        String searchingWord = split[0];
	        String fileInput = split[1];
	        
	        SearchWord.getInput(searchingWord, fileInput);
		}
		
		public static void getInput(String searchingWord, String fileInput) throws FileNotFoundException {
			int line = 1;

	        File file = new File(fileInput);
			Scanner sc = new Scanner(file);
			
				while(sc.hasNextLine()) {
					String current = sc.nextLine();
					if(current.contains(searchingWord)){
						System.out.println("Found at line: "+ line);
					}
					line++;
				}
			sc.close();
		}
}