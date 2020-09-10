package examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class climbingLeaderBoard {
	
	

		

	    public static void main(String[] args) throws IOException {
	    	TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
	    		tm.put(2, 3);
	    		tm.put(1, 3);
	    	Optional<Entry<Integer, Integer>> maxEntry = tm.entrySet()
	    		        .stream().collect(Collectors.maxBy(Comparator.comparingInt(Map.Entry::getValue)));
	    	String resultTm=maxEntry.toString();
	    	int r= Integer.parseInt(maxEntry.toString().substring(9, 10));
	    System.out.println(r);
	    
	  
	    //Other way
	    int max=Collections.max(tm.values());
	    int result=0;
	    for(Map.Entry<Integer, Integer> obj:tm.entrySet()) 
	    {if(obj.getValue()==max) result=Integer.parseInt(obj.getKey().toString()); break; }
	    System.out.println(result);
	 
	    List<Integer> l=new ArrayList<Integer>();
	    l.add(12);
	    l.add(12);
	    l.add(11);
	    l.add(0);
	    l.add(1);
	    List<Integer> l1=l.subList(0, l.size()/2);
	    List<Integer> l2=l.subList(l.size()-l1.size(), l.size());
	    //l1.addAll(l2);
	    
	    System.out.println(l1.stream().filter(i->(i!=0)).collect(Collectors.summingInt(Integer::new)));
	}
}


