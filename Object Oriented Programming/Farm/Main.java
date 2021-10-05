package Farm;

public class Main {

    public static void main(String[] args) {

        //        Reuse your Animal class
        //        Create a Farm class
        //        it has list of Animals
        //                it has slots which defines the number of free places for animals
        //        breed() -> creates a new animal if there's place for it
        //        slaughter() -> removes the least hungry animal

        Farm myFarm = new Farm(6);
        Animal cow = new Animal("Cow3");
        Animal sheep = new Animal("Sheep3");
        Animal chicken = new Animal("Chicken3");
        cow.eat();
        chicken.play();
        sheep.eat();
        sheep.eat();
        cow.eat();
        myFarm.list.add(sheep);
        myFarm.list.add(chicken);
        myFarm.list.add(cow);
        System.out.println();
        myFarm.breed(cow, "Cow");
        myFarm.breed(cow, "Cow1");
        myFarm.breed(chicken, "Chicken");
        myFarm.breed(sheep, "Sheep");
        myFarm.list.get(0).eat();
        myFarm.list.get(3).eat();
        myFarm.list.get(3).eat();
        myFarm.list.get(1).eat();
        myFarm.list.get(4).eat();

        myFarm.breed(chicken, "Chicken1");

        myFarm.hungerLevels();
        myFarm.numberOfAnimals();
        myFarm.slaughter();
        myFarm.numberOfAnimals();
        myFarm.slaughter();

        myFarm.breed(sheep, "Sheep2");
        myFarm.breed(cow, "Cow2");
        myFarm.breed(chicken, "Chicken2");

    }

}
