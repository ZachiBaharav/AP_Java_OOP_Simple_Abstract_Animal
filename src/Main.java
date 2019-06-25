


public class Main {

    
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        System.out.println("Dog: " + d1.sound());
        System.out.println("Cat: " + c1.sound());

        
        
        Animal[] as = {d1, c1};

        System.out.println("Animal[0] makes:" +as[0].sound() );
        System.out.println("Animal[1] makes:" +as[1].sound() );

    }
    
}
