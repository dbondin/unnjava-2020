
public class Mathem {

	// n! = 1*2*3*4*...*n
	long factorial(long n) {
		if(n > 1) {
			return n * factorial(n - 1);
		}
		return 1;
	}
	
// Please implement this fibonnachi method using recursion
//
//	// 1 1 2 3 5 8 13 21 .... (Nx = N(x-1) + N(x-2))
//using recursion
	public int fibRe(int n) {
		if(n==0) {
		return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		else 
			return fibRe(n-2)+fibRe(n-1);
	}
	//using dynamic
	public int fibDy(int n) {
		int fDy[]= new int[n+1];
		fDy[0]=0; //[0] index in Fib.Sequence is 0
		fDy[1]=1; //[1] index in Fib.Sequence is 1
		for(int i=2;i<=n;i++) {
			fDy[i]=fDy[i-2]+fDy[i-1];
		}
		return fDy[n];	
	}
}
