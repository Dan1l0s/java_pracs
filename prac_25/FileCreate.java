package prac_25;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input filename:");
        String file_name = scan.nextLine();
        System.out.println("Input file text:");
        String file_text = scan.nextLine();
        try(FileWriter writer = new FileWriter("C:\\Users\\dan2l\\Desktop\\"+file_name+".txt", false))
        {
            writer.write(file_text);
            writer.flush();
        }
        catch (IOException e)
        {
            System.out.println("There was an error while input/output process:");
            System.out.println(e.getMessage());
        }

    }
}
