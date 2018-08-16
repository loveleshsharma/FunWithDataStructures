package Implementations.graphs;

public class ConstructorCheck {

    int i=10;

    public ConstructorCheck() {
        System.out.println("Base Constructor called!"+i);
    }

}

class Derived extends ConstructorCheck {

    public Derived() {
        System.out.println("Derived Constructor called!"+i);
    }
}


class Driver {

    public static void main(String...args) {
        Derived d = new Derived();
    }
}