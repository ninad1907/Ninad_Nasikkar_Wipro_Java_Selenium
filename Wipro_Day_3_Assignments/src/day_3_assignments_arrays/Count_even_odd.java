package day_3_assignments_arrays;
//Write a program to count even and odd numbers from an array 
public class Count_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4,5,6,7,8,9};
		int c_even=0;
		int c_odd=0;
		int result=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				c_even++;
			}
			else {
				c_odd++;
			}
		}
		
		System.out.println("Even count "+c_even+" \n"+"Odd count "+c_odd);
	}

}
