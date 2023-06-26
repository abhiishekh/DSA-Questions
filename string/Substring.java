public class Substring {
    //Java program to print all possible
// substrings of a given string

// Function to print all sub strings
	static void subString(String str, int n) {
		// Pick starting point
		for (int len = 1; len <= n; len++) {
			// Pick ending point
			for (int i = 0; i <= n - len; i++) {
				// Print characters from current
				// starting point to current ending
				// point.
				int j = i + len - 1;
				for (int k = i; k <= j; k++) {
					System.out.print(str.charAt(k));
				}

				System.out.println();
			}
		}
	}

// Driver program to test above function
	public static void main(String[] args) {
		// char str[] = {'a', 'b', 'c'};
        // String str  = "Hello";
		// subString(str, str.length());
        System.out.print(myPow(2.00000,-2));

	}
      public static double myPow(double x, int n) {

        double result = 1;

        if(n==1||n==0){
            return x;
        }
        if(n > 0){
        for(int i=1; i <= n/2; i++){
            result *= x;
        }
        if(n%2 == 0){
            return result * result;
        }else {
            return result*result*x;
        }
        }else{
            x = 1/x;
            n = Math.abs(n);
            for(int i = 1; i < n/2; i++){
                result *= x;
            }
           if(n%2 == 0){
            return result * result;
        }else {
            return result*result*x;
        }

        //   result = 1 / result;
        }
      }

        
    
}
// This code is contributed by PrinciRaj1992

    

