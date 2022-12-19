package prac_28;
import java.io.*;

public class Directory {
    private File[] files;

    public Directory (String Path) {
        files = new File[100];
        File[] files_tmp = new File(Path).listFiles();
        for (int i = 0; i < files_tmp.length; ++i)
            if (files_tmp[i] != null) files[i] = files_tmp[i];
    }
    public void print (int quantity)
    {
        System.out.println("First "+quantity+" files from directory:");
        for (int i = 0; i < quantity && i < files.length; i++)
            System.out.println(files[i]);
    }

    public static void main(String[] args) {
        String path = "C:\\Games\\Steam\\steamapps\\common";
        Directory dir = new Directory(path);
        dir.print(5);
    }

}
