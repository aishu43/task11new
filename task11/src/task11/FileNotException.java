package task11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileNotException {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		 {  
	          
	         FileReader fileReader = new FileReader("webelement.txt");  
	         
	         BufferedReader bR = new BufferedReader(fileReader);  
	        
	         String fileData = null;  
	            
	         while ((fileData = bR.readLine()) != null)   
	         {  
	             System.out.println(fileData);  
	         }  
	          
	         try {  
	            bR.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	}
}
    	


