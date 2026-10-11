// Q17. Multiple and Hybrid Inheritance - Concept Only
//
// MULTIPLE INHERITANCE
// Multiple inheritance means one class inherits from TWO OR MORE classes.
// In Java, a class can extend only ONE class, so this idea is invalid:
//
//     class C extends A, B     // NOT allowed in Java (shown only as a comment)
//
// WHY JAVA DOES NOT ALLOW IT
// Suppose class A and class B both define a method show().
// If C extended both, then calling show() on a C object would be ambiguous:
// Java would not know whether to run A's show() or B's show().
// This is the "diamond problem". Two parents would also make constructor
// chaining (super()) confusing. So Java allows only single class inheritance.
//
// HYBRID INHERITANCE
// Hybrid inheritance is a COMBINATION of inheritance forms, for example
// hierarchical + multilevel + multiple together. If the combination needs a
// class to have two parent classes, it cannot be built with classes alone in Java.
//
// ROLE OF INTERFACES
// Interfaces are commonly used when Java needs multiple or hybrid inheritance
// of type/behavior, because a class can implement more than one interface.
// (Interfaces are NOT used in this lab, so no interface is written here.)

public class InheritanceConceptMain {
    public static void main(String[] args) {
        // Only prints a summary; there is no multiple-inheritance code in this program
        System.out.println("A Java class can extend only one class.");
        System.out.println("Multiple and hybrid inheritance of classes are concept-only here.");
    }
}
