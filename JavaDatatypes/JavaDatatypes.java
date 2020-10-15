package JavaDatatypes;

import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		
		    int t = scanner.nextInt();
		    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		   while(0<t){
		    
		   
			   try {     long x=scanner.nextLong();
           System.out.println(x+" can be fitted in:");
           if(x>=-128 && x<=127)System.out.println("* byte");
           
            if(x>=-32768 && x<=32767)System.out.println("* short");      
           if(x>=-2147483648 && x<=2147483647)System.out.println("* int"); 
        if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
        
			   }catch (Exception e) {
			 System.out.println(scanner.next()+" can't be fitted anywhere.");
			   }
		t -= 1;    
		}
scanner.close(); }
		}