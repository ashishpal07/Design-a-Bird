
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
        Pigeon p = new Pigeon();
        p.fly();
        p.eat("Pigeon");
        p.makeSound("Pigeon");

        Crow c = new Crow(new CrowSparrowFlying());
        c.fly();
        c.eat("Crow");
        c.makeSound("Crow");

        Sparrow s = new Sparrow(new CrowSparrowFlying());
        s.fly();
        s.eat("Sparrow");
        s.makeSound("Sparrow");

        Ostrich o = new Ostrich();
        o.nonFly();
        o.eat("Ostrich");
        s.makeSound("Ostrich");

        Penguin pg = new Penguin();
        pg.nonFly();
        pg.eat("Penguin");
        pg.makeSound("Penguin");
    }
}