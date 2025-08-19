/*Create a class FileReadDemo:
1.	In main, call a method readFile(String filename) that declares throws FileNotFoundException, IOException.
2.	In readFile, use FileReader (or BufferedReader) to open and read the first line of the file.
3.	Handle exceptions in main using separate catch blocks:
o	catch (FileNotFoundException e) → print "File not found: " + filename
o	catch (IOException e) → print "Error reading file: " + e.getMessage()"
4.	Include a finally block that prints "Cleanup done." regardless of outcome
*/
package file_handling;

import java.io.*;

public class Q1
{
    public static void main(String[] args)
    {
        String filename = "test.txt";

        try
        {
            readFile(filename);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + filename);
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally
        {
            System.out.println("Cleanup done.");
        }
    }

    static void readFile(String filename) throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        System.out.println("First line: " + line);
        br.close();
    }
}

