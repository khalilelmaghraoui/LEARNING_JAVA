public class Vehicle {

    private String name;
    private String size;
    private int currentvelocity;
    private int currentDirection;


    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection=0;
        this.currentvelocity=0;
    }
    public void steer(int   direction ){
        this.currentDirection+=direction;
        System.out.println("Steer.vehicule() caleed " + currentDirection + "degrees");
    }

   public void move (int currentDirection , int currentvelocity ){
        this.currentDirection=currentDirection;
        this.currentvelocity=currentvelocity;

       System.out.println("vehicul.move() : moving at " + currentvelocity + "in derection " + currentDirection  );
   }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCurrentvelocity(int currentvelocity) {
        this.currentvelocity = currentvelocity;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

}
