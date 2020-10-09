package testing;
import java.util.Scanner;

public class Prog {
	//Main
	
	public static void main(String[] args) {
		Scanner cont= new Scanner(System.in);
		
/***************************************	

		System.out.println("donner un entier");
		int n=cont.nextInt();
		System.out.println("donner puissance d'un entier");
		int x=cont.nextInt();
		System.out.println("Puissance="+puissance(n,x));
		System.out.println("fact=="+fact(n));
		
		int k=0;
		do {
			System.out.println("donner un entier K");	
			k =cont.nextInt();
			
		}while(k<0);
		
		System.out.println("arrangement="+arr(n,k));
		System.out.println("combinison="+com(n,k));
		
		
***************************************/

		
		
		System.out.println("donner un entier en binaire:");

		String b=cont.nextLine();
		while(!CheckIfBinary(b)) {
			System.out.println("donner un entier en binaire:");
			b=cont.nextLine();
		}
			System.out.println("Nombre en Decimal=="+FromBinaryToDecimal(b));
		cont.close();
		
		
	}
	//Puissance d'un nombre
	public static int puissance(int n, int x){
		if(x>0) {
			return(n*puissance(n,x-1));
		}
		else {
			return (1);
		}
	}
	//Factoriel d'un nombre
	 public static int fact(int n) {
		if(n>0) {
			return(n*fact(n-1));
		}
		else {
			return 1;
		}
	}
	 //L'arrangement d'un nombre
	public static double arr(int n, int k) {
		return (fact(n)/fact(n-k));
	}
	//Combinison d'un nombre
	public static double com(int n, int k) {
		return arr(n,k)/fact(k);
	}
	//verification d'un nombre ne binaire
	public static boolean CheckIfBinary(String ch) {
		int i=0;
		do {
			if(ch.charAt(i)=='0'|| ch.charAt(i)=='1') {
				i++;
			}
			else {
				break;
			}
			
		}while(i<ch.length());
		return i==ch.length();	
	}
	//Cnovertion d'un nombre en decimal
	public static int FromBinaryToDecimal (String ch) {
		int l=ch.length()-1;
		int sum=0;
		for(int i=0;i<ch.length();i++) {
			if (ch.charAt(i)=='0') {
				l-=1;
			}
			else {
				if(ch.charAt(i)=='1') {
					sum+=puissance(2,l);
					l-=1;
					}
			
			}
		}
		return sum;
		
	}
	
}
			
	
	
