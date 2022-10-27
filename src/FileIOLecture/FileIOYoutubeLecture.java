package FileIOLecture;

import java.io.File;

public class FileIOYoutubeLecture {
//file = an abstract representation of file and directory path names
//    The purpose of file IO is that it allows us to read and write to files.
//    Example: server error logs
public static void main(String[] args) {


    File file = new File("secret_message.txt");
//    In order to see if a file exists or not, we need to use an if statement to execute if there is a match.
        if(file.exists()) {
            System.out.println("That file exists! :0");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        } else {
            System.out.println("That file doesn't exist! :(");
        }
    }
}

