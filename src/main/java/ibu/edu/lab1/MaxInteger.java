package ibu.edu.lab1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaxInteger {
	
	public static int[] readNumbers(String path) throws FileNotFoundException {
		int arr[] = new int[100];
		
		File f = new File(path);
		Scanner reader = new Scanner(f);
		int i = 0;
		while(reader.hasNext()) {
			arr[i] = Integer.parseInt(reader.nextLine());
			i++;
		}
		reader.close();
		return arr;
	}
	
	public static int findMax(int[] array) {
		int max = array[0];
		
		for(int i = 1; i<100 ; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static void writeToFile(String path, int number) throws IOException {
		FileWriter fw = new FileWriter(path);
		fw.write("" + number);
		fw.close();
	}
}
