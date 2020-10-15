package JavaEndoffile;

import java.util.Scanner;

public class JavaEndoffile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no =1;
		while (sc.hasNext()) {
			
			String s = sc.nextLine();
			System.out.println(no+" "+s);
			no +=1;
		}
sc.close();
	}

}
