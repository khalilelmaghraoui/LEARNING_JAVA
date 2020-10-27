public class Animal {

    private String name ;
    private int body;
    private int size;
    private int brain;
    private int weight;

    public Animal(String name, int body, int size, int brain, int weight) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.brain = brain;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("animal.eat() called ");

    }
    public void move(){

    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getBrian() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }

}
