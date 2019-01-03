package scavChall_1;
import java.io.*;
import java.util.*;

public class AlphaMatch {
	public static void main(String[] args) throws FileNotFoundException {
		char[] alphabet = {' ', 'a','b','c','d','e','f','g','h','i',
				'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
		File indexLoc = new File("src/indexLoc.txt");
		Scanner readIn = new Scanner(indexLoc);
	
		String readFile = readIn.nextLine();
		System.out.println("Original: " + readFile);
		// marking spaces with 0's
		readFile = readFile.replaceAll("\\s", " 0 ");
		readIn.close();
		// removing dashes
		readFile = readFile.replaceAll("\\D", " ");
		
		// go through string and substitute int with its index variable
		Scanner convert = new Scanner(readFile);
		System.out.print("Converted: ");
		while(convert.hasNextInt()) {
			System.out.print(alphabet[convert.nextInt()]);
		}
		convert.close();
	}
}
