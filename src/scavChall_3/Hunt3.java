package scavChall_3;

import java.io.*;
import java.util.*;

public class Hunt3 {
	private static int wordsModified = 0;
	private static int charactersRemoved = 0;
	private static File metamorphosis;

	public Hunt3() {
		metamorphosis = new File("C:\\Users\\User\\eclipse-workspace\\scavChall_3\\src\\metamorphosis.txt");
	}
	
	public File getFile() {
		return metamorphosis;
	}
	
	public static int getModified() {
		return wordsModified;
	}
	
	public static int getRemoved() {
		return charactersRemoved;
	}
	
	public static void printArray(String[] inputArray) {
		for(int i=0; i<inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}
	
	public static void printArray(ArrayList<String> inputArray) {
		for(int i=0; i<inputArray.size(); i++) {
			System.out.println(inputArray.get(i));
		}
	}
	
	public ArrayList<String> extract(int nthWord) throws FileNotFoundException {
		ArrayList<String> collWords = new ArrayList<String>();
		Hunt3 newHunt = new Hunt3();
		String curWord = "";
		
		Scanner in = new Scanner(newHunt.getFile());
		
		// adds every nth words to array list
		int count = 0;
		while(in.hasNext()) {
			curWord = in.next();
			count = count + nthWord-1;
			if((count%nthWord) == 0) {
				collWords.add(curWord);
			}
		}
		in.close();
		
		System.out.println(collWords);
		
		for(int i=0; i<collWords.size(); i++) {
			// convert string to lower case
			collWords.set(i, collWords.get(i).toLowerCase());
			
			// counts wordsModified
			if(!collWords.get(i).matches("[^a-zA-Z\\s]")) {
				collWords.set(i, collWords.get(i).replaceAll("[^a-zA-Z\\s]", ""));
				wordsModified++;
				// counts charactersRemoved
				if(collWords.get(i).equals("")) {
					charactersRemoved++;
				}
			} 
		}
		System.out.println(wordsModified);
		System.out.println(charactersRemoved);
		//printArray(collWords);
		
		return collWords;
	}
	
	public static String intToString(int input) {
		switch(input) {
		case 18523 :
			return "left";
		case 3156 :
			return "began";
		case 646 :
			return "must";
		case 794 :
			return "journey";
		case 12976 :
			return "right";
		case 5037 :
			return "take";
		case 91 :
			return "when";
		case 12593 :
			return "where";
		case 7382 :
			return "door";
		case 18141 :
			return "script";
		case 2065 :
			return "code";
		case 2735 :
			return "hunt";
		default :
			return "your";
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> secretMessage = new ArrayList<String>();
		ArrayList<String> fifthWords = new ArrayList<String>();
		
		Hunt3 newHunt = new Hunt3();
		
		fifthWords = newHunt.extract(5);

		/*
		secretMessage.add(fifthWords.get(280));
		System.out.println(getModified());
		secretMessage.add(intToString(getModified()));
		System.out.println(getRemoved());
		secretMessage.add(intToString(getRemoved()));
		secretMessage.add(fifthWords.get(3301));
		
		ArrayList<String> twoWords = newHunt.extract(2);
		secretMessage.add(twoWords.get(2401));
		secretMessage.add(twoWords.get(7058));
		secretMessage.add(intToString(twoWords.size()));
		secretMessage.add(intToString(getModified()));
		secretMessage.add(intToString(getRemoved()));
		
		ArrayList<String> tenWords = newHunt.extract(10);
		secretMessage.add(tenWords.get(2005));
		secretMessage.add(tenWords.get(285));
		
		for(int i=0; i<fifthWords.size(); i++) {
			if(twoWords.get(i).equals(fifthWords.get(i))) {
				twoWords.remove(i);
			}
		}
		
		secretMessage.add(intToString(getModified()));
		secretMessage.add(intToString(twoWords.size()));
		
		System.out.println(secretMessage);
		*/
	}
}
