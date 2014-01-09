package week1;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.*;

public class HTML {

			public String Code(){
				int [] user = new int[2];
				for(int i = 0; i < 2; i++){
				System.out.print("Enter some ints: ");
				Scanner input = new Scanner(System.in);
				int intergers = input.nextInt();
				user[i] = intergers;
				}
				
				String output = "<html>";
				output += "<table width=\"100%\" border=\"0\" cellspacing=\"0\" class = border 1px solid black>";
				output += "<tr>";
				for(int i = 0; i < user[0]; i++){
					output += "<td>Testing</td>";
				}
				output += "</tr>";
				output += "<tr>";
				for(int k = 0; k < user[1]; k++){
					
					output += "<td>Hello</td>";
				}
				output += "</tr>";
				output += "</table>";
				output += "</html>";			
				
				return output;
				
			}
	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub	
		HTML object = new HTML();
	    String output = object.Code();
	    
	    
	   
	    try{
	    File file = new File("test.html");
		// creates the file
		 file.createNewFile();
	    	
	    	
	    FileWriter writer = new FileWriter(file);
	    writer.write(output);
	    writer.flush();
	    writer.close();
	    }
	    catch(IOException e){
	    System.out.print("Not working");	
	
	    }
	    
	}

}