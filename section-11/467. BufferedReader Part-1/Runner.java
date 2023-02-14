import java.io.BufferedReader;
import java.io.InputStreamReader;

// By using BufferedReader:
// If we want to provide dynamic input to the java applications by using
// BufferedReader then we have to use the following instructions
public class Runner {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Where 'in' is a static variable defined in System class, it will represent a
        // predefined InputStream object which is connect with Command Prompt.

        // If we type any dynamic input on command prompt then the provided data will be
        // submitted to predefined InputStream object which is refered by 'System.in' in
        // the form of Bytes Representation
    }

}

// watch the lecture
