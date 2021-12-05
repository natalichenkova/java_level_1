/**
 * Java_1.Homework_6
 *
 * @author natalichenkova
 * @version 23.11.21
 */
public class Homework_6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Bon", 200, 0, false);
        System.out.println(cat.run(250));
        System.out.println(cat.swim(150));


        Dog dog = new Dog("Jon", 500, 10, true);
        System.out.println(dog.run(400));
        System.out.println(dog.swim(5));

    }

}

interface IAnimal {
        String run (int rundistance);
        String swim (int swimdistance);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int maxrundistance;
    protected int maxswimdistance;
    protected boolean canswim;

    Animal(String name, int maxrundistance, int maxswimdistance, boolean canswim) {
        this.name = name;
        this.maxrundistance = maxrundistance;
        this.maxswimdistance = maxswimdistance;
        this.canswim = canswim;
    }

    @Override
    public String toString() {
        return name;
    }

}

class Dog extends Animal {
    Dog(String name, int maxrundistance, int maxswimdistance, boolean canswim) {
        super(name, maxrundistance, maxswimdistance, canswim);
    }

    @Override
    public String run(int rundistance) {
        if (rundistance > this.maxrundistance) {
            return "Собака по кличке " + this.name + " не может пробежать " + this.maxrundistance + "m";
        }
        return "Собака по кличке " + this.name + " пробежал " + rundistance + "m";
    }

    @Override
    public String swim(int swimdistance) {
        if (!canswim) {
            return "Собака по кличке " + this.name + " не умеет плавать";
        }
        if (swimdistance > this.maxswimdistance) {
            return "Собака по кличке " + this.name + " не может проплыть " + this.maxswimdistance + "m";
        }
        return "Собака по кличке " + this.name + " проплыл " + swimdistance + "m";
    }

}

class Cat extends Animal {
    Cat(String name, int maxrundistance, int maxswimdistance, boolean canswim) {
        super(name, maxrundistance, maxswimdistance, canswim);
    }

    @Override
    public String run(int rundistance) {
        if (rundistance > this.maxrundistance) {
            return "Кот по имени " + this.name + " не может пробежать " + this.maxrundistance + "m";
        }
        return "Кот по имени " + this.name + " пробежал " + rundistance + "m";
    }

    @Override
    public String swim(int swimdistance) {
        if (!canswim) {
            return "Кот по имени " + this.name + " не умеет плавать";
        }
        if (swimdistance > this.maxswimdistance) {
            return "Кот по имени " + this.name + " не может проплыть " + this.maxswimdistance + "m";
        }
        return "Кот по имени " + this.name + " проплыл " + swimdistance + "m";
    }

}




