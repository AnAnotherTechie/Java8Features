package examples;

public class SpecialStringAgain {

	public static void main(String[] args) {
		
		String s="asasd";
		
		long fullLength=s.length();
		
		int len=(int)fullLength;
		long same_char_count[]=new long[len];
		
		int result=0,j,i=0;
		
		char a[]=s.toCharArray();
		
		while(i<fullLength) {
			
			j=i+1; result=1;
			while(j<fullLength&& a[i]==a[j]) {
				++j;++result;
			}
			
			result+=(result*(result+1))>>1;
	        same_char_count[i]=result;
	        i=j;
		}
		
		for(j=1;j<fullLength-1;++j) {
	        if(a[j]==a[j-1]) {
	            same_char_count[j] = same_char_count[j-1];
	        }
	        if(a[j-1]==a[j+1] && a[j]!=a[j-1]) {
	            result += min(same_char_count[j-1], same_char_count[j+1]);
	        }    
		
		}
		
		System.out.println("Final Output: "+result);
		

}

	private static long min(long i, long j) {
		// TODO Auto-generated method stub
		if(i<j) return i;
		else return j;
	}}







/*
 * char[] inputChar=s.toCharArray();
 * 
 * StringBuffer strBuffer=new StringBuffer(s);
 * if(strBuffer.reverse().toString().equals(s)) { count++; }
 * 
 * for(int i=0;i<inputChar.length-1;i++) { if(i==0) {
 * {if(inputChar[i]==inputChar[i+1]) count++;}
 * if(i==inputChar.length-2){if(inputChar[i]==inputChar[i+1]) count++;
 * if(inputChar[i-1]==inputChar[i+1]) count++;
 * 
 * }} else { if(inputChar[i]==inputChar[i+1]) {count++;}
 * if(inputChar[i-1]==inputChar[i+1]) {count++;} }
 * 
 * } System.out.println("Output: "+count);
 */
