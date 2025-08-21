package day_3_assignments_arrays;
//check if array is palindrome or not
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,2,1};
		
		boolean isPalindrome=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("Array is palindrome");
		}else {
			System.out.println("Array is not palindrome");
		}
	}

}
