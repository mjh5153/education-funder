package recursiveClassImpl;

public class RecursionImpl {
	public int factoRecursive(int n) {
		if(n == 0)
			return (1);
		else
			return(n * factoRecursive(n - 1));
	}
	public int factoIterative(int n) {
		int result = 1;
		while(n>0){
			result = result * n;
			n--;
		}
		return(result);
	}
	public int fibRecursive(int n) {
		if(n<=1){
			return n;
		}else{
			return fibRecursive(n-2) + fibRecursive(n-1);
		}
	}
	public void fibRecursiveWithDisplay(int n) {
		for (int i = 1; i <= n; i++){
			System.out.print(fibRecursive(i) + " ");
		}
	}
	public double gcd(int m, int n) {
		while(m!=0 && n!=0)
		  {
		     int o = n;
		     n = m%n;
		     m = o;
		  }
		  return m+n;
	}
	public int lengthStringRecursive(String str) {
		if (str.equals(""))
	        return 0;
		else
			return lengthStringRecursive(str.substring(1)) + 1;
	}
}
