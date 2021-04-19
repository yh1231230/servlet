package test01;

public class DuoTai {
    public static void main(String[] args) {
       String cc=new String("ccc");
       StringBuilder dd=new StringBuilder("ddd");


        Animal a = new Cat();
        a.eat();

        Animal b = new Dog();
        Dog c = (Dog) b;
        c.eat();

        show(new Cat());
        show(new Dog());

    }

    public static void show(Animal animal) {
        animal.eat();
        if (animal instanceof Cat) {
            Cat c = (Cat) animal;
            c.play();
        } else if (animal instanceof Dog) {
            Dog d =(Dog) animal;
            d.play();
        }
    }
}

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void play() {
        System.out.println("逗猫");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void play() {
        System.out.println("逗狗");
    }
}