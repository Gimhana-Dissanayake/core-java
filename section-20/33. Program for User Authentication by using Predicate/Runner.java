import java.util.Scanner;
import java.util.function.Predicate;

class User {

  String username;
  String pwd;

  public User(String username, String pwd) {
    this.username = username;
    this.pwd = pwd;
  }
}

public class Runner {

  public static void main(String[] args) {
    Predicate<User> p = user ->
      user.username.equals("gim") && user.pwd.equals("123");

    Scanner s = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = s.nextLine();

    System.out.print("Enter pwd: ");
    String password = s.nextLine();

    User user = new User(username, password);

    System.out.println(
      p.test(user) ? "Credentials are valid" : "Invalid Credentials"
    );

    s.close();
  }
}
