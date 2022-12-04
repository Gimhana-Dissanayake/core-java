
// 32. interface extends class -> invalid, interface can extend interface only
// 33. interface extends abstract class -> invalid, interface can extend interface only
// 34. interface extends interface -> valid
// 35. interface extends interface, interface -> valid
// 36. interface implements class -> invalid
// 37. interface implements abstract class -> invalid
// 38. interface implements interface -> invalid

// 39. class A extends A{}
// Invalid, If a class is extending the same class it is called cyclic inheritance and it is not supported by java

// 40. class A extends B{    }
// class B extends A{      }
// Invalid, If a class is extending the same class it is called cyclic inheritance and it is not supported by java

// 41. abstract class A extends A{    }// Invalid, If a class is extending the same class it is called cyclic inheritance and it is not supported by java

// 42. abstract class A extends B{  }
// abstract class B extends A{   }
// Invalid, If a class is extending the same class it is called cyclic inheritance and it is not supported by java

// 43. class A esxtends B{}
// abstract class B extends A{  }
// Invalid, If a class is extending the same class it is called cyclic inheritance and it is not supported by java

// 44. abstract class A extends B{   }
// class B extends A {  }
// Invalid, If a class is extending the same class it is called cyclic inheritance and it is not supported by java

// 45. inteface I extends I { }
// Invalid, If a class is extending the same class it is called cyclic inheritance and it is not supported by java

// 46. interface I1 extends I2{}
// inteface I2 extends I1{}
// Invalid, If a class is extending the same class it is called cyclic inheritance and it is not supported by java

public class Runner {

}
