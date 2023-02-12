public class Runner {
    // What is the difference between Error and exception

    // Error is a problem, it will not allow to execute application.

    // 1. Compilation Errors
    // 2. Runtime Errors

    // Compilation Error:
    // These are the problems occured at compiled time, it will not allow to run our
    // application

    // In general, there are three types of compilation errors
    // 1. Lexical Errors:
    // Mistakes in tokens.
    // Ex int i = 10; ---> valid
    // itn i = 10; ---> Invalid

    // 2. Syntax Errors:
    // Mistakes in Syntaxs.
    // int i = 10;---> valid
    // i int 10 =; ---> invalid

    // Semantic Errors
    // Meaningless statments.
    // Ex: Providing operators inbetween incompatible data types.
    // int i = 10;
    // int j =20
    // int k = i + j ---> valid

    // int i = 20;
    // boolean b = true;
    // char c = i + b; ---> invalid

    // NOTE: In general all programming languages are having their own set of errors
    // apart from the above three types of errors

    // Ex: In Java, Variables j might not have been initialized.
    // Illegal Start of expressions.
    // Unreachable Statement.

    // 2. Runtime Errors
    // it is a problem occured at runtime, for which we are unable to provide
    // solution programatically.
    // Ex: - InsufficientMainMemory.
    // Unavailability of IO Components.

    // Exception:
    // It is a problem occured at runtime, for which we are able to provide
    // solutions programatically
    // EX: ArithmeticException
    // NullPointerException

}