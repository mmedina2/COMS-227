package lab7;

public class CP1 {
	
	public static int pyramidballs(int size) {
		if (size == 1) {
			return 1;
		}
		
		else {
			return (size * size) + pyramidballs(size -1); 	
		}
	}
	
	
	public static int findMaxElement(int[] arr, int i,int maxLast){
		if(i == arr.length)
			return maxLast;

		if (arr[i] > maxLast){
			maxLast = arr[i];
		}
			return findMaxElement(arr, i + 1, maxLast);
		}

	
	public static void main(String[] args)
	{
		System.out.println("Should be 30, actual - " + pyramidballs(4) );
		
		int[] test = {3, 7, 5, 1, 2, 3, 2};
		int max = findMaxElement(test, 0, 0);
		System.out.println("should be 7, actual - " + max);
	} 
	
	

}
