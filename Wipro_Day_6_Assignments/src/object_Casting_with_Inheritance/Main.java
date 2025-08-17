/*1.	Define an Animal class with a method makeSound().
2.	Define subclass Dog:
o	Override makeSound() (e.g. "Woof!").
o	Add method fetch().
3.	In main:
Dog d = new Dog();
Animal a = d;          // upcasting
a.makeSound();
*/
package object_Casting_with_Inheritance;

class Animal
{
    void makeSound()
    {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Woof!");
    }

    void fetch()
    {
        System.out.println("Dog is fetching the ball");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.makeSound();
        d.fetch();

        Animal a = d; // upcasting
        a.makeSound();
    }
}


