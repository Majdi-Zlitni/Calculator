package testing;
import java.util.Scanner;

public class Prog {
	public static void main(String[] args) {
		Scanner cont= new Scanner(System.in);
		System.out.println("donner un entier");
		int n=cont.nextInt();
		System.out.println("donner puissance d'un entier");
		int x=cont.nextInt();
		System.out.println(puissance(n,x));
		System.out.println("fact=="+fact(n));
		int k=0;
		do {
			System.out.println("donner un entier K");	
			k =cont.nextInt();
			
		}while(k<0);
		System.out.println("arrangement="+arr(n,k));
		System.out.println("combinison="+com(n,k));
		System.out.println("donner un entier en binaire:");
		String b=cont.nextLine();
		int sum=0;
		int l=b.length()-1;
		
		for(int i=0;i<b.length();i++) {
			
			if (b.charAt(i)=='0') {
				l-=1;
			}
			else {
				if(b.charAt(i)=='1') {
					sum+=puissance(2,l);
					l-=1;
					}
				else {
					System.out.println("invalid binary number");
					break;
				}
			
			}
		}
		System.out.println("NOMBRE EN BINAIRE=="+sum);
		cont.close();
		
		
	}
	public static int puissance(int n, int x){
		if(x>0) {
			return(n*puissance(n,x-1));
		}
		else {
			return (1);
		}
	}
	 public static int fact(int n) {
		if(n>0) {
			return(n*fact(n-1));
		}
		else {
			return 1;
		}
	}
	public static double arr(int n, int k) {
		return (fact(n)/fact(n-k));
	}
	public static double com(int n, int k) {
		return arr(n,k)/fact(k);
	}
}
			
	
	
