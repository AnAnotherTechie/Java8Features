package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringExample {

	public static void main(String[] args) {
		/*
		 * long count=0; String s="aba"; long n=10; if(s.length()==1&&s.equals("a"))
		 * count=n;
		 * 
		 * int m=(int)n; String a=s+s.substring(0, m-s.length()); if(s.length()<n) {
		 * 
		 * System.out.println(a);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * //charList=a.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		 * System.out.println(a.chars().mapToObj(e->(char)e).filter(b->b.toString().
		 * equals("a")).count());
		 */
       
       /*int ar[]= {1,3,3,2};
       int k=Arrays.stream(ar).max().getAsInt();
       //Arrays.asList(ar).stream().max(Comparator.comparingInt())
       int result =(int)Arrays.stream(ar).filter(i-> (i==k)).count();
       System.out.println(result);*/
       
       
       String s="00:00:00PM";
       String newString="";
       String[] a=s.split(":");
       int k=Integer.parseInt(a[0]);
       int m=Integer.parseInt(a[2].substring(0, 2));
       String ms=a[2].substring(0, 2);
       int ss=Integer.parseInt(a[1]);
       //Arrays.asList(a).stream().filter((a[a.length-1].substring(2, 3).equalsIgnoreCase("P")))
       
       
       if(a[a.length-1].substring(2, 3).equals("P") && k<12&& k>0&& m<=59&&m>=0 && ss>=0&&ss<=59)
       {
    	   k=k+12;
    	   newString=k+":"+a[1]+":"+a[2].substring(0, 2);
       }else if(a[a.length-1].substring(2, 3).equals("P") && k==12 && m>=0 &&ss>=0 &&ss<=59&&m<=59) {
    	   newString=a[0]+":"+a[1]+":"+a[2].substring(0, 2);
       }else if(a[a.length-1].substring(2, 3).equals("A") && k==12 && m==0 && ss==0 )
       {newString="00:00:00";
    	   
       }else if(a[a.length-1].substring(2, 3).equals("A") && k<12&& k>0&& m<=59&&m>=0 &&ss>=0&&ss<=59)
       {
    	   
    	   newString=k+":"+a[1]+":"+a[2].substring(0, 2);
       }else if(a[a.length-1].substring(2, 3).equals("A") && k==12 && m>=0 && ss>=0  &&ss<=59 &&m<=59) 
       {
    	   newString="00:"+a[1]+":"+ms;
    	   
       }
			   
		 System.out.println("Result : "+newString);  	
		   
		   
		   
   
		   
		      
       
       
	}

}
