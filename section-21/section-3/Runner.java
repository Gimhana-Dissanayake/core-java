interface I {
  public String reverseString(char[] ch);
}

public class Runner {

  public static void main(String[] args) {
    String inputString = "Hello from java";

    char[] ch = new char[inputString.length()];

    for (int i = 0; i < inputString.length(); i++) {
      ch[i] = inputString.charAt(i);
    }

    I i = chArray -> {
      int left = 0;
      int right = chArray.length - 1;

      while (left < right) {
        char temp = chArray[left];
        chArray[left] = chArray[right];
        chArray[right] = temp;

        left++;
        right--;
      }

      String s = "";

      for (int j = 0; j < chArray.length; j++) {
        s = s + chArray[j];
      }

      return s;
    };

    System.out.println(i.reverseString(ch));
  }
}
