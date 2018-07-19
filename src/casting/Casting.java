package casting;

class Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Animal");
    }
    
    public void func()
    {
        System.out.println("Animal Specific FUnction");
    }
}


class Dog extends Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Dog");
    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog");
    }
}

public class Casting 
{
    public static void main (String [] args) 
    {
        Animal animal = new Dog();
        //Dog dog = (Dog)animal; //ClassCastException
        
        
        if(animal instanceof Dog) {
        	System.out.println("animal can be casted to Dog");
        	Dog dog = (Dog)animal;
        }else {
        	System.out.println("animal cannot be casted to Dog");
        }
        
    }
}