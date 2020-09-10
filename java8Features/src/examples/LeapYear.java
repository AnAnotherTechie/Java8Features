package examples;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LeapYear {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) 
	    {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();

	    StringBuilder builder = new StringBuilder();
	    for (int i = 0; i <n ; i++) 
	        builder.append(" ");
	    int j = 0;

	    
	    for (int i = 1; i <=n; i++) {
	        builder.replace(builder.length()-i,          
	        builder.length() - j, "#");
	        System.out.println(builder);
	        j++;
	    }

	}
	
}
