        /*
        Create an Animal class
        1. Every animal has a hunger value, which is a whole number
        2. Every animal has a thirst value, which is a whole number
        3. When creating a new animal instance these values must be set to the default 50 value
        4. Every animal can eat() which decreases its hunger by one
        5. Every animal can drink() which decreases its thirst by one
        6. Every animal can play() which increases both its hunger and thirst by one
        */
    public class Animal {
        int hunger;
        int thirst;

        public Animal() {
            hunger = 50;
            thirst = 50;
        }

        public void eat() {
            this.hunger--;
        }

        public void drink() {
            this.thirst--;
        }

        public void play() {
            this.thirst++;
            this.hunger++;
        }

        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.eat();
            animal.play();
            System.out.println("Animal is hungry: " + animal.hunger + "\nAnimal is thirsty: " + animal.thirst);
        }
    }
