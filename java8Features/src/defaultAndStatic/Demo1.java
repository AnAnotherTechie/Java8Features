package defaultAndStatic;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dad";
		
		char a[]=s.toCharArray();
		int totalLength=s.length();
		StringBuffer stBuffer=new StringBuffer(s);
		
		if(stBuffer.reverse().toString().equals(s))totalLength++;
		
		for(int i=0;i<s.length();i++)
		{ if(i+1<s.length())
			if(a[i]==a[i+1])
				totalLength++;
		    if(i+2<s.length())
		    { if((a[i]!=a[i+1]) && (a[i]==a[i+2]))
					 totalLength++;
		      if((a[i]==a[i+1]) && (a[i]==a[i+2])) 
		    	  totalLength++;}
		}
		System.out.println("Result: "+totalLength);
		
	}

}
