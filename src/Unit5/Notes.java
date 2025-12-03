/*
Class in programming defines a new abstract data type. WHen you create objects, you create new
variables or instances of that class data type.

OOP 4 pillars: Inheritance, encapsulation polymorphism, abstraction
OOP; 4 pillars:
Encapsulation: two kinds of method: accessor and mutator

private: get___, eg: private String title,
public string getTitle(){
        return title;
    }
returns title

or b.getTitle(); //do not do b.Title, it does NOT work
Book b = new Book ("Title","John",1985)

Instance Attributes/Methods
Point Class

Instance variables
Four types of access modifiers: private, default, protected, public


If a class has no constructor, Java gives it a default constructor with no parameters that sets all integer
fields to 0, booleans to false, Strings to null, etc.

Static VS Non-static(Instance)
Non-static or instance: Part of an object, rather than shared by the class. Non-static methods are called using
the dot operator along with the object variable name.

Static: Part of a class, rather than part of an object. Not copied into each object; shared by all objects
of that class. Static methods are called using the dot operator along with the class name unless they are defined
in the enclosing class.
 */