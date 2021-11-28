/**
 * Java_1.Homework_7
 *
 * @author natalichenkova
 * @version 28.11.21
 */
public class Homework_7 {
    public static void main(String[] ags) {

        Plate plate = new Plate(30);


        Cat cat2 = new Cat("Villi", 10);
        Cat cat3 = new Cat("Dilli", 12);
        Cat cat4 = new Cat("Billi", 9);

        Cat[] cats = {cat2, cat3, cat4};
        boolean status = false;
        while (!status) {
            System.out.println(plate);
            for (Cat cat : cats) {
                status = cat.eat(plate);
                if (status) {
                    System.out.println("Cat " + cat.name + " is satieti.");
                } else {
                    System.out.println("Cat " + cat.name + " is hungry. There is little food (" + plate.food +") in the plate." );
                }

            }
            System.out.println(plate);
            plate.addFood(10);
        }

    }

    static class Cat {
        String name;
        int appetite;
        boolean satieti;

        Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.satieti = false;
        }

        boolean eat(Plate plate) {

            if (!this.satieti) {
                this.satieti = plate.decreaseFood(appetite);
            }
            return this.satieti;

        }

        @Override
        public String toString() {
            return "Cat: " + name + ", appetite: " + appetite;
        }

    }

    static class Plate {
        int food;

        Plate(int food) {
            this.food = food;
        }

        void addFood(int food) {
            this.food += food;
        }


        boolean decreaseFood(int appetite) {

            if (this.food < appetite) {
                return false;
            } else {
                this.food -= appetite;
                return true;
            }

        }

        @Override
        public String toString() {
            return "Food: " + food;
        }

    }

}