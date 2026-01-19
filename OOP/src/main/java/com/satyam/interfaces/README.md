# When to use interfaces and when to use abstract classes, or normal classes extends?

## Use interfaces when you want a role or capability

Interfaces define what something can do, not how it does it. Use interface when:

- Many unrelated classes need the same behavior
- You want to define a contract
- You want loose coupling
- You expect multiple implementations
- You might need mocks for testing
- YOu want to allow multiple interfaces of behavior.

### When to use multiple interfaces?

Use multiple interfaces when your class needs multiple capabilities. Interfaces
represent abilities not inheritance.


## Use Abstract class when you want shared state + shared code

Abstract classes are for closely related classes that share:

- fields
- default implementations
- helper methods
- constructor logic

Use an abstract class when:

- All subclasses are part of the same family
- They share common data (fields)
- You want to avoid repeating code
- You want partial implementation + enforced methods
- You expect subclasses to specialize behavior

```java

public abstract class Animal {
    protected String name;

    public void eat() { ... }        // shared code
    public abstract void makeSound(); // must override
}

```

## Use extends (concrete inheritance) when it is a TRUE is a relationship

This is the most dangerous one — use rarely.

- Use concrete inheritance only when:
- Subclass is genuinely a more specific version of the parent
- Liskov Substitution Principle holds (child can replace parent without breaking anything)
- You actually want to reuse real implementation, not just contract
- It won’t cause tight coupling problems later


## THE RULES (copy-paste mental model)

- Rule 1 — If it’s a capability → INTERFACE
	Examples: Runnable, Comparable, Walkable, Sortable, Repository.

- Rule 2 — If it’s a base family with shared state → ABSTRACT CLASS
	Examples: Animal, Shape, Transport, AbstractCache.

- Rule 3 — If it’s a true is-a with code reuse → extends
	Examples: ArrayList extends AbstractList.

- Rule 4 — If confused, choose INTERFACE first
	It’s the safest and most flexible.
	
## PREMIUM GUIDELINE (experienced dev logic)

- Interfaces for API boundaries
- Abstract classes for internal hierarchies
- Concrete inheritance only for framework-level stuff

## class rules

A top-level private class would mean:

“No one can see or use this class, even inside the same package.”

That makes the class useless to the compiler — so Java forbids it.

📘 Top-level class:

❌ private
❌ protected
❌ abstract private
✔ public
✔ abstract
✔ default (package-private)

📗 Inner class:

✔ private
✔ protected
✔ public
✔ abstract
✔ final
✔ static