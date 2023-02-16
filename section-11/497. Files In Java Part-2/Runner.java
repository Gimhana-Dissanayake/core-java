import java.io.File;

// To get name of the file we will use the following method.
// public String getName();

// To get the parent location of the file we have to use the following method. 
// public String getParent() 

// To get absolute path of the file we have to use the fallowing method.
// public String getAbsolutePath();

public class Runner {
    public static void main(String[] args) throws Exception {
        File file = new File("welcome.txt");
        file.createNewFile();
        System.out.println("File Name : " + file.getName());
        System.out.println("File Parent : " + file.getParent());
        System.out.println("Absolute Path : " + file.getAbsolutePath());
    }
}