/*5.	Write a Java program to pass an object to a method and modify its internal fields. Verify that the changes reflect outside the method.*/
package call_by_Reference;

class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class Q5
{
    public static void main(String[] args)
    {
        Person p = new Person("Alice", 25);

        System.out.println("Before method call: " + p.name + ", " + p.age);

        updatePerson(p);

        System.out.println("After method call: " + p.name + ", " + p.age);
    }

    static void updatePerson(Person person)
    {
        person.name = "Bob";
        person.age = 30;

        System.out.println("Inside method: " + person.name + ", " + person.age);
    }
}
