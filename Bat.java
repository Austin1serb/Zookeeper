public class Bat extends Mammal {

    public Bat() {
        this.energy = 300;  // Bats have a default energy of 300
    }

    public void fly() {
        this.energy -= 50;
        System.out.println("The bat takes off and is airborne.");
    }

    public void eatHumans() {
        this.energy += 25;
        System.out.println("The bat has eaten a human and feels more powerful.");
    }

    public void attackTown() {
        this.energy -= 100;
        System.out.println("The bat attacks a town, setting it on fire!");
    }
}
