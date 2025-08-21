package day_3_assignments_string;
//Split a sentence into words
public class Split_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java is a powerful language";
        String[] words = sentence.trim().split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
	}

}
//trim() => removes leading and trailing white spaces