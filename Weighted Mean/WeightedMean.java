package javaproblems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WeightedMean {

	
		  public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		       int size = sc.nextInt();
		       int[] arrx= new int[size];
		       int sum=0;
		       int sum2=0;
		       int[] arrw= new int[size];
		       for(int i=0;i<size;i++){
		           arrx[i]=sc.nextInt();
		         }
		          for(int i=0;i<size;i++){
		           arrw[i]=sc.nextInt();
		         }
		     for(int i=0;i<size;i++){
		           sum +=(arrx[i]*arrw[i]);
		         }
		 for(int i=0;i<size;i++){
		          sum2 += arrw[i];
		         }
		float sum3 = sum;
		float sum4 =sum2;
		double sum5 = (double)sum3/sum4;
		
		 System.out.format("%.1f", sum5);
		    }
		}
