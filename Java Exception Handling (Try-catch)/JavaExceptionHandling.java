package JavaExceptionHandling;

import java.util.Scanner;

public class JavaExceptionHandling {

	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	    try{ int a = sc.nextInt();
	        int b= sc.nextInt();
	      int c = a/b;
	        System.out.println(c);
	    } catch (InputMismatchException e) {
	            System.out.println(e.getClass().getName());
	        } 
	    catch(Exception e){
	       
	        System.out.println(e);
	    }
	    }
	}