package MeanMedianandMode;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianandMode {

	  public static void main(String[] args) {
	      Scanner sc =new Scanner(System.in);
	      int sizeOfarray=sc.nextInt();
	      int[] arr=new int[sizeOfarray];
	      
	      long mean=0,median=0;
	      int mode=0;
	      int count=0;
	      for(int i=0;i<sizeOfarray;i++){
	         arr[i]=sc.nextInt();
	      }
	      for(int i=0;i<sizeOfarray;i++){
	          mean += arr[i];
	        
	           }
	    float  mean2= mean;
	     float mean1 = mean2/sizeOfarray;
	System.out.println(mean1);
	 Arrays.sort(arr); 

	if(sizeOfarray%2==0){
	  int  temp = sizeOfarray/2;
	  
	  median=arr[temp] + arr[temp-1];
	    float median2 = median;
	    float median1= median2/2;
	    System.out.println(median1);
	}else{
	   int size = sizeOfarray+1;
	   size = size/2;
	   System.out.println(arr[size-1]);
	}
	for(int i=0;i<sizeOfarray;i++){
		count=0;
	    for(int j=0;j<sizeOfarray;j++){
	   if(arr[i]==arr[j]){
	      
	        count += 1 ;
	       
	        }
	    if((mode+1)<count){
	      mode=j;
	    }    
	    }

	}
	 System.out.println(arr[mode]) ; 
	  }
	}