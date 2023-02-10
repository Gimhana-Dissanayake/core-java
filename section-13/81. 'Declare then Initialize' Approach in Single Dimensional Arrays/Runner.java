public class Runner {

}

// In declare then initialize approach, size of the array is mandatroy.
// int [] a = new int[] -----> Compilation Error
// int [] a = new int[-5] -----> No Compilation Error, if we add an element then
// will get "java.lang.NegativeArraySizeException".

// int [] a = new int[5] ------> Compilation Error, No Exception
// int [] a = new int[0] -------> No Compilation Error, if we add an element
// then will get "java.lang.ArrayIndexOutOfBoundsException".