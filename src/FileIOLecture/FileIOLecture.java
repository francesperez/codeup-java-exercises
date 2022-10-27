package FileIOLecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {

    public static void main(String[] args) {

//        Why not simply represent a file path as a single string?
//File Input/Output
//In java everything represents an object, a file represents a path.
//A path has certain qualities. A string doesn't have those utilities. Java needs to be able to read the path.
//Path has location on the computer and a space in memory in the computer. These are all things that are
//encapsulated in a path object. bTo even interact with af ile in the file path, a path must be given to a
//path object in java and it can be used to operated on that given path.
//        What is the difference between a 'relative' and 'absolute' file path?
//
//        What is the difference between the Path interface and Paths class?
//Represents the actual path, the path clas represents things you can Do to the path interface.
//        What type of exception is thrown when program attempts to read from a file that doesn't exist in the file system?
//filedoesnotexist exception
//        The return value of the Files.readAllLines(Path pathToFile) method is a list of strings. True or false?
//?true
//        What does StandardOpenOption.APPEND do when passed to the Files.write() method?

        // ============================ PATH=============
//When we are able to read a file from the file system, we are able to get to it with a path.
//Path interface represents a path in the file system.
//get() method for creating a file path
        //String path = "src/test.txt"; //java provides a data type for file system paths. if we write our paths like
        // we did here, there's no guarantee every computer can run it this way since differnt operating systems may
        // write it out differently
//
//        Path pathToTest = Paths.get("src", "fileIoLecture", "test.txt");
//        System.out.println(pathToTest); //This will show us the parsed string version of the file path

//        Path pathToLuna = Paths.get("hello", "weywot.txt");
//        System.out.println(pathToLuna);

//        Path fileLecturePath = Paths.get("src", "fileIoLecture", "FileIOLecture.FileIOLecture.java");
//        System.out.println(fileLecturePath);
//        System.out.println(fileLecturePath.toAbsolutePath()); //difference between absolute path and relative path:
//        relative is from where you are in a point in a path
//        vs absolute which is where you would want everyone to start from at a default point

//        Path otherPath = Paths.get("src", "../", "src", "../", "src", "fileIoLecture", "FileIOLecture.FileIOLecture");
//        System.out.println(otherPath);
//        System.out.println(otherPath.normalize()); //we could go up a directory with .. and go back into a file
//        path or we could do all of that in one command. Normalize will get rid of all the unnecessary file paths
//        one might type.
//        System.out.println(otherPath.toAbsolutePath());
//        System.out.println(otherPath.normalize().toAbsolutePath());

// ============================ FILE METHODS=======================

//        System.out.println(Files.exists(fileLecturePath)); //this will tell you true or false whether your file
//        exists or not
//        System.out.println(Files.exists(Paths.get("bob.txt")));
//
//        String directory = "data";
//        String filename = "info.txt";
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        System.out.println(dataDirectory);
//        System.out.println(dataFile);
//
//        if (Files.notExists(dataDirectory)) {
//            try {
//                Files.createDirectories(dataDirectory);
//            } catch (IOException e) {
//        throw new RuntimeException(e);
//            }
//        }

//        if (Files.notExists(dataFile)) {
//            try {
//                Files.createFile(dataFile); //this will create a file
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        // ============================ READING FILES

//        Path p = Paths.get("src", "weywot", "java", "test.txt");
//
//        List<String> lines = new ArrayList<>();
//
//        try {
//            lines = Files.readAllLines(p);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(lines);
//
//        for (String name : lines) {
//            System.out.println("Hello, " + name + "!");
//        }



//        try {
//            List<String> contents = Files.readAllLines(
//                Paths.get("data", "bob.txt")
//            );
//            for (String line : contents) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }



        // ============================ WRITING FILES

//        Path p = Paths.get("src", "weywot", "java", "test.txt");
//
//        List<String> newNames = Arrays.asList("John", "Fred", "Cathy");
//        try {
//            Files.write(p, newNames, StandardOpenOption.APPEND); //This will add more names to the .txt file(think
//            of the contacts manager application here) We will have a list of contacts and this will add their phone
//            numbers to the .txt file. We need to add a contact(append), remove a contact(?)
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        List<String> names = new ArrayList<>();
//        names.add("Tim");
//        names.add("Sally");
//        names.add("Mary");
//
//        try {
//            Files.write(p, names, StandardOpenOption.APPEND);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }


    }
}