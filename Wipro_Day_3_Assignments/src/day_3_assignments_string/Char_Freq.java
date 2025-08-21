package day_3_assignments_string;
//Write a program to find the frequency of each character in a string
public class Char_Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
	}

}
