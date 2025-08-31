package day2.Ifelse;
import java.util.Scanner;
public class PositiveNegativeChecker {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  the number to check : ");
	int num = sc.nextInt();
	
	if(num>0) {
		System.out.println(num + " Number is Possitive");
	}else if(num<0){
		System.out.println(num + " Number is Nagative");
	}
	else {
		System.out.println(num + " Number is Zero");
	}
	sc.close();
	}

}
