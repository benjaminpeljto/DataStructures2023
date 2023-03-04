package ibu.edu.lab1;

import java.io.IOException;



//just to say that in the time of doing this lab (day before the actual lab session) I couldn't find
//the text file with numbers so I made my own class to generate 100 random numbers and write them into a file
public class App 
{
 public static void main( String[] args ) throws IOException{
     int[] array = MaxInteger.readNumbers("C:\\Users\\Benjamin Peljto\\Desktop\\text.txt");
 	System.out.println("Reading numbers...");
     System.out.println("Finding max number...");
     System.out.println("Max number is: " + MaxInteger.findMax(array));
     System.out.println("Writing into file...");
     MaxInteger.writeToFile("C:\\Users\\Benjamin Peljto\\Desktop\\maximumNumber.txt",MaxInteger.findMax(array));
 }
}