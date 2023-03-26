import java.util.Comparator;
import java.util.TreeSet;

// Q) If we provide both implicit sorting through Comparable and Explicit Sorting through Comparator to TreeSet at a time then which soring order would be taken by TreeSet?

// Ans:
// If we provide both implicit sorting and through comparable and explict soriting through comparator to TreeSet at a time then TreeSet will give first priorty for explicit soring through comparator, if explicit soring through comparator is not provided then only TreeSet will search for implicity sorting through Comparable.

class MyComparator implements Comparator<Customer> {

  @Override
  public int compare(Customer cust1, Customer cust2) {
    return -cust1.cid.compareTo(cust2.cid);
  }
}

class Customer implements Comparable<Customer> {

  String cid;
  String cname;
  String caddr;

  public Customer(String cid, String cname, String caddr) {
    this.cid = cid;
    this.cname = cname;
    this.caddr = caddr;
  }

  @Override
  public int compareTo(Customer cust) {
    return this.cid.compareTo(cust.cid);
  }

  @Override
  public String toString() {
    return (
      "[CID: " +
      this.cid +
      " CNAME: " +
      this.cname +
      " CADDR: " +
      this.caddr +
      "]\n"
    );
  }
}

public class Runner {

  public static void main(String[] args) {
    Customer c1 = new Customer("C-111", "Durga", "Hyd");
    Customer c2 = new Customer("C-222", "Nagoor", "Chennai");
    Customer c3 = new Customer("C-333", "Rakesh", "Pune");
    Customer c4 = new Customer("C-444", "Krish", "Delhi");
    Customer c5 = new Customer("C-555", "John", "Mumbai");

    MyComparator myComp = new MyComparator();

    TreeSet<Customer> ts = new TreeSet<Customer>(myComp);

    ts.add(c3);
    ts.add(c1);
    ts.add(c5);
    ts.add(c2);
    ts.add(c4);

    System.out.println(ts);

    System.out.println("******** With implicit sorting ********");

    TreeSet<Customer> ts1 = new TreeSet<Customer>();

    ts1.add(c3);
    ts1.add(c1);
    ts1.add(c5);
    ts1.add(c2);
    ts1.add(c4);

    System.out.println(ts1);
  }
}
