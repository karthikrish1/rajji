package filehandlng;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fw {

	//create a new text file , write into it
	
	public static void main(String[] args) throws IOException {
		//File                :   reach the path          : path of the file as input
		//FileWriter          :  create a file            : pass file object as input
		//BufferedWriter      : write into it             : pass filewriter objec as input
		
		// nonstatic 
		//pckage=> right-> properties 
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\lalithaselva\\src\\filehandlng\\ls.txt");
		FileWriter f1= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(f1);
		bw.write("hi");
		bw.newLine();
		bw.write("hello");
		bw.close();
	}
}
