import java.util.Scanner;

public class PrimeNumber {
	public void prime(int n) {
		int a[]=new int[n];
		int k=0;
		for(int i=1;i<=n;i++) {
			int c=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					c=c+1;
				}
			}
			if (c==2)
			{
			a[k]=i;
			k++;
			}
		}
		for(int i=0;i<k;i++) {
			//System.out.println("Prime numbers from 1 to 100 are :");
		       System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		PrimeNumber pm=new PrimeNumber();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		pm.prime(n);
	}

}
