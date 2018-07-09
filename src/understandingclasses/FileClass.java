package understandingclasses;

import java.io.File;
import java.io.IOException;

public class FileClass {
	public static void main(String[] args) throws IOException {

		/*
		 * accepts FileName or DirectoryName as argument 
		 * creates just a file instance
		 */
		File f = new File("C:\\Users\\MEHAVARNAN\\Documents\\TestFolder\\mkdir\\");

		// creates a new file if not exists
		// f.createNewFile();

		// returns true if a directory is created else false
		boolean dir = f.mkdir();
		System.out.println(dir);
		
		//gives the contents of directory (files and folders)
		String[] arr = f.list();
		
		for(String s: arr) {
			System.out.println(s);
		}
	}
}
