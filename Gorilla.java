public class Gorilla extends Mammal {

    public void throwSomething() {
        this.energy -= 5;
        System.out.println("The gorilla has thrown something!");
    }

    public void eatBananas() {
        this.energy += 10;
        System.out.println("The gorilla is satisfied after eating bananas.");
    }

    public void climb() {
        this.energy -= 10;
        System.out.println("The gorilla has climbed a tree.");
    }
}
