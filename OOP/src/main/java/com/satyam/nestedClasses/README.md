# Nested Classes

## Inner static class

A static inner class is used when the nested class exists only to support outer
class, but does not need access to the outer class's instance.

Because static nested classes are treated almost like top-level classes by the JVM:
They have their own .class file (e.g., BST$Node.class)
They have no reference to outer instance
They have no reason to load unless used
The JVM loads classes on a need-to-use basis.

A static inner class does not leak memory.
Only static fields can cause leaks.
Your Node objects are normal heap objects and are garbage-collected normally.