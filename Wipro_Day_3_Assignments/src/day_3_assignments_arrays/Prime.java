package day_3_assignments_arrays;
//print only prime numbers from array
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,3,7,22,13,78};
		
		for(int i=0;i<arr.length;i++) {
			boolean isPrime=true;
			if(arr[i]<2) {
				isPrime=false;
			}
			else {
				for(int j=2;j<arr[i];j++) {
					if(arr[i]%j==0) {
						isPrime=false;
						break;
					}
				}	
			}
			
			if(isPrime) {
				System.out.println(arr[i]);
			}
		}	
		
	}

}
