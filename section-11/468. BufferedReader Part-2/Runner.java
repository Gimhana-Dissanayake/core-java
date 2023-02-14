public class Runner {

}

// In inputstream object data is existed in the form of bytes representation, it
// is not readable, so we have to convert data from Bytes representation to
// character representateion, because, character representaion is more readable.

// Where to convert data from bytes representaion to character representation we
// will use "InputStreamReader"

// Inside inputStreamReader data is present as individual characters, to read
// these characters from inputStream we have to perform number of read
// operations, it will reduce input operation performance.

// In the above context, to improve the performance of the input operation we
// have to use 'BufferedReader'

// BufferedReader contains buffers to store data in the form of Strings or in
// the form of lines, it is very simple to read data from BufferedReader as
// string

// To read data from BufferedReader we will use the following two methods.

// public String readLine();
// public int read();