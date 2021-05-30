package com.Collection;


    interface Animal {
        public void animalSound(); // interface method (does not have a body)
        public void sleep(); // interface method (does not have a body)
    }

    // Pig "implements" the Animal interface
    class Pig implements Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
        public void sleep() {
            // The body of sleep() is provided here
            System.out.println("Zzz");
        }
    }

    class mmain {
        Exception exception = new Exception();
        public static void main(String[] args) {
            Pig myPig = new Pig();  // Create a Pig object
            String string = new String();
            int i = Integer.parseInt(string);
            int x = 10;


            System.out.println(i+x);
            Animal animal = new Pig();

            myPig.animalSound();
            myPig.sleep();
        }
    }

