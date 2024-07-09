package filehandlng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fr {

	public static void main(String[] args) throws IOException  {
		
		// throws exceptionname
		
		         //File                :   reach the path          : path of the file as input
				//FileReader          :  fetch a file            : pass file object as input
				//Bufferedreader      : read             : pass filereader objec as input
				
				// nonstatic 
				//pckage=> right-> properties 
				File f= new File("C:\\Users\\hp\\eclipse-workspace\\lalithaselva\\src\\filehandlng\\ls.txt");
				FileReader f1= new FileReader(f);
				BufferedReader bw= new BufferedReader(f1);
				String line;
				while((line=bw.readLine())!=null)
				{
					System.out.println(line);
				}
				
				// first   : bw.readline   read ftst line       line=hi      line!=null  hi!=null => print hi
				//second   : bw.readline   reads scnd line      line=hello              hello!=null -> print hello
				// thrd     : nothing => terminate 
	}
}
