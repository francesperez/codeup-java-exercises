package FileIOLecture;

import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileIoMethods
{

    public static void removeLineData()
    {
        File inputFile = new File("people.txt");
        File tempFile = new File("myTempFile.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(inputFile));
        } catch (FileNotFoundException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(tempFile));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        CharSequence names = null;
        String lineToRemove = (String) names;
        String currentLine;

        Scanner UI = new Scanner(System.in);
        boolean found = false;

        System.out.println("\n***DELETE STUDENT RECORD***\n");
        System.out.println("Enter a student ID: ");
        names=UI.next();
        try {
            while((currentLine = reader.readLine()) != null)
            {
                String trimmedLine = currentLine.trim();
                if(trimmedLine.contains(names))
                    continue;
                try {
                    writer.write(currentLine);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        boolean successful = tempFile.renameTo(inputFile);
//        Menu.displayMenu();
//        writer.close();
//        tempFile.close();
    }
}
