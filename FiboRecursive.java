import java.util.*;
public class FiboRecursive {
	int fibo(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return fibo(n-1)+fibo(n-2);
		}
	}

	public static void main(String[] args) {
		FiboRecursive fr=new FiboRecursive();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r = fr.fibo(n);
		System.out.println("The nth term is:"+r);
	}

}
