abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
   
    public void sound() {
        System.out.println("arrgghhhhhhhhhhhh.....");
    }
}

class Tiger extends Animal {
 
    public void sound() {
        System.out.println("arrrrrrrrrrrrrrrrrrrrrr");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();
        tiger.sound();
    }
}
