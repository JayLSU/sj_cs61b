public class fib{
	public static int fib(int N)
	{
		int pre_ans = 1;
		int ans = 0;
		while(N > 0)
		{
			int temp_ans = ans;
			ans = ans + pre_ans;
			pre_ans = temp_ans;
			N = N - 1;
		}
		return ans;
	}
	/*More efficient way*/
	public static int fib1(int N)
	{
		if (N <= 1) {
			return N;
		}
		else
		{
			return fib(N-1) + fib(N-2);
		}
	}
	/*The Most efficient way*/
	public static int fib2(int n, int k, int f0, int f1)
	{
		if (n == k) {
			return f0;
		}
		else
		{
			return fib2(n,k+1,f1,f0+f1);
		}
	}
}

