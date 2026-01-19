# Generics

Generics allow you to define classes, interfaces and methods with type parameters.
	Instead of writing the same code for int, String, or Employee, you write one 
	generic version that works for any type — safely.
	
## Generics Rule

You can intersect at most ONE class + many interfaces.
You cannot intersect two classes. Ever.

## Types in JAVA

Types in Java form a tree, not a graph.

- A class can have only ONE parent class
	(because a tree has one branch upward)

- class can have MANY interfaces
	(interfaces are like tags/abilities, not parents)

- A class can NEVER be inside two class branches at once
	(that would break the tree structure)

This is the rule that explains EVERYTHING about generics, extends, implements, etc.

##  Limitations of Generics

- Can’t instantiate a generic type: new T() ❌
- Can’t use primitives as type arguments (List<int> ❌).
- Can’t use instanceof with generic types (if (obj instanceof Box<String>) ❌).
- Type information is erased at runtime. 

##  Useful Generic Utility Classes in Java
	
- Optional<T> — wraps possibly-null values safely.
- Comparator<T> — functional interface for sorting.
- Stream<T> — collection-like data pipeline.
- Function<T,R>, Predicate<T>, Supplier<T>, Consumer<T> — for functional programming.



