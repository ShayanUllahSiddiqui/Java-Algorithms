import java.io.*;
import java.util.Scanner;

class Record {

    Record(){

    }
    public void readFile() throws IOException {
        int ch;


       FileReader fileReader = null;
        try
        {
            fileReader = new FileReader("/ooplab/src/Output.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }

        System.out.println("Output: ");
        while ((ch=fileReader.read())!=-1)

            System.out.print((char) ch);

        // close the file
        fileReader.close();

    }

    public void WriteFile() throws IOException {

        String str = "Hello everyone my name is ....";
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter file location(.txt) that you want to read: ");
        String str1 = input.next();
        FileReader file = new FileReader(str1);

        file.close();

        FileWriter fileWriter = new FileWriter("Output.txt");

        for (int i = 0; i < str.length(); i++)
            fileWriter.write(str.charAt(i));

        System.out.println("Writing successful");
       
        fileWriter.close();

    }


}