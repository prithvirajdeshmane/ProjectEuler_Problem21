
public class Amicables {

	public static void main(String[] args) {
		int totalSum = 0;
		int target = 10000;
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 1; i <= target; i++) {
			int n1 = i;
			int sum1 = sumOfFactors(i);
			
			if(n1 != sum1) {
				int n2 = sum1;
				int sum2 = sumOfFactors(n2);
				
				if(n1==sum2 && n2==sum1) {
					totalSum += i;
				}
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total sum: " + totalSum );
		System.out.println("Time taken: " + (endTime - startTime) + "ms");
	}
	
	private static int sumOfFactors(int n) {
		int sum = 0;
		
		for(int i = 1; i <= (n/2 + 1); i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}

}
