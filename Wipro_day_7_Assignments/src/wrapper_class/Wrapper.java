/*1.	Check if character is a Digit
2.	Compare two Strings
3.	Convert using valueof method
4.	Create Boolean Wrapper usage
5.	Convert null to wrapper classes
*/
package wrapper_class;

public class Wrapper
{
    public static void main(String[] args)
    {
        char ch = '5';
        boolean isDigit = Character.isDigit(ch);
        System.out.println(ch + " is a digit? " + isDigit);

        String s1 = "Hello";
        String s2 = "World";
        boolean stringsEqual = s1.equals(s2);
        System.out.println(s1 + " equals " + s2 + "? " + stringsEqual);

        int num = 42;
        String numStr = String.valueOf(num);
        System.out.println("Integer as string: " + numStr);

        Boolean flag = Boolean.valueOf(true);
        System.out.println("Boolean wrapper value: " + flag);

        Integer intWrapper = null;
        Double doubleWrapper = null;
        System.out.println("Integer wrapper from null: " + intWrapper);
        System.out.println("Double wrapper from null: " + doubleWrapper);
    }
}

