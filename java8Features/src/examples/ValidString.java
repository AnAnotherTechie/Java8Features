package examples;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abbcc";
		int count=0,i=0,j=0;
		TreeMap<Character,Integer> mapInput=new TreeMap<Character,Integer>();
		char[] sArray=s.toLowerCase().toCharArray();
		for(;i<sArray.length;i++)
		{	count=1;
			if(!mapInput.containsKey(sArray[i]))
				{for(j=i+1;j<sArray.length;j++)
				{if(sArray[i]==sArray[j]) { 
					count++;
				}
					}
				if(i>=sArray.length)mapInput.put(sArray[i-1], count);
					 else mapInput.put(sArray[i],count);
				}
		 
		 
		}
		System.out.println(mapInput);
		int min=Collections.min(mapInput.values());
		int max=Collections.max(mapInput.values());
		int maxEntry=0,minEntry=0;
		for(int k:mapInput.values()) {if(k==max) maxEntry++; if(k==min) minEntry++;}
		if(max==min) System.out.println("YES");
		else if(minEntry==1 && (mapInput.size()-minEntry)==1) System.out.println("YES");
		else if(maxEntry==1 && (mapInput.size()-maxEntry)==1) System.out.println("YES");
		else System.out.println("NO");
		

	}

}
