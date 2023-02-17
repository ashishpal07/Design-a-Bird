
/**
 Requirement
 Design a Bird
 1. 5 Birds will be there
    - Pigeon
    - Crow
    - Sparrow
    - Ostrich
    - Penguin
 2. Penguin and Ostrich can't fly everyone else can fly
 3. Crow and Sparrow fly in same way
 4. Every bird can eat and makeSound/sing
 */



public class Main {
    public static void main(String[] args) {

        Pigeon p = new Pigeon(5, 5, "Pigeon");
        p.fly();
        p.eat();
        p.makeSound();

        Crow c = new Crow(5, 5, "Crow");
        c.fly();
        c.eat();
        c.makeSound();

        Sparrow s = new Sparrow(5, 5, "Sparrow");
        s.fly();
        s.eat();
        s.makeSound();

        Ostrich o = new Ostrich(5, 5, "Ostrich");
        o.eat();
        s.makeSound();

        Penguin pg = new Penguin(5, 5, "Penguin");
        pg.eat();
        pg.makeSound();
    }
}