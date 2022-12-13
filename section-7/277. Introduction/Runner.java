// Inner class
// Declaring a class inside another class is called as Inner class

class Outer{ // ---> outer class
    class Inner{ // ---> inner class

    }
}

// 1.Modularity
// 2.Abstraction
// 3.Security
// 4.Sharability
// 5.Reusability

// In java we use packages to increase modularity, But inside the class if we want to provide modularity then we have to go for inner classes

// 1.Modularity
class Mathematics{
    class Algebra{

    }
    class Calculus{

    }
    class Geomatry{

    }
}

// 2.Abstraction


// 3.Security
// In java, we are unable to declare an outer class as private, but ,we are able to declare an inner class as private.

// 4. Sharability
// In java applications, it is not possible to declare an outer class as 'static', but it is possible to decare an inner class as static

// 5. Resuability
// In java application, it is possible to extend one inner class to another inner class