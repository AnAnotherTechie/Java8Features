package java9TryWithResource;

import java.io.FileOutputStream;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fileOutputStream =new FileOutputStream("C:/Users/deepa.rathinam/Documents/Quiz.txt")){      
			String msg = "Welcome to javaTpoint!";      
			byte byteArray[] = msg.getBytes(); //converting string into byte array      
			fileOutputStream.write(byteArray);  
			System.out.println("Message written to file successfuly!");      
			}catch(Exception exception){  
			       System.out.println(exception);  
			}      
	}

}
