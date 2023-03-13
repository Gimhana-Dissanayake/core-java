import java.util.*;

public class Solution2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int t = s.nextInt();

    String[] pair_left = new String[t];
    String[] pair_right = new String[t];

    for (int i = 0; i < t; i++) {
      pair_left[i] = s.next();
      pair_right[i] = s.next();
    }

    class Student {

      String firstName;
      String lastName;

      public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
      }

      @Override
      public int hashCode() {
        final int prime = 31;
        int result = 1;
        result =
          prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result =
          prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        if (firstName == null) {
          if (other.firstName != null) return false;
        } else if (!firstName.equals(other.firstName)) return false;
        if (lastName == null) {
          if (other.lastName != null) return false;
        } else if (!lastName.equals(other.lastName)) return false;
        return true;
      }
    }

    Set<Student> set = new HashSet<Student>();

    for (int j = 0; j < t; j++) {
      String fName = pair_left[j];
      String lName = pair_right[j];

      Student stu = new Student(fName, lName);

      set.add(stu);

      System.out.println(set.size());
    }
    // System.out.println("SET " + set);
  }
}
