public class Dog  extends Animal {

    private String coat;
    private int tail;
    private int eyes;


    public Dog(String name, int size, int weight ,String coat , int tail , int eyes) {
        super(name, 1, size, 1, weight);
        this.coat=coat;
        this.eyes=eyes;
        this.tail=tail;

    }

    @Override
    public void eat(){
        System.out.println("dog.eat() called");
        super.eat();
    }

}
