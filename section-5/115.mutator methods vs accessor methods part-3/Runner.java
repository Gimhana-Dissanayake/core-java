class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // This class can be passed through the different layers of your application,
    // and that is an advantage.
    // We we want to access or modify data we have to use getter or setter methods.
    // Simply we have to go through methods to get to data, because of this coding
    // and data are combined in these methods(getter and setter methods), hence it
    // provides Encapsulation(Encapsulation means combining coding part and data
    // part)

}

public class Runner {

}
