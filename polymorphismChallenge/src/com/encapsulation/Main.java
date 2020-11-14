package com.encapsulation;


     class  Car {
        private boolean engine;
        private int cylinders;
        private String name;
        private int wheels;

        public Car(int cylinders, String name) {
            this.engine = true;
            this.cylinders = cylinders;
            this.name = name;
            this.wheels = 4;
        }

        public boolean isEngine() {
            return engine;
        }

        public void setEngine(boolean engine) {
            this.engine = engine;
        }

        public int getCylinders() {
            return cylinders;
        }

        public void setCylinders(int cylinders) {
            this.cylinders = cylinders;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWheels() {
            return wheels;
        }

        public void setWheels(int wheels) {
            this.wheels = wheels;
        }
        public  void stareengin(){
            System.out.println("the engine start");
        }
        public void acceleration(){
            System.out.println("acceleration");

        }
        public void breeak(){
            System.out.println("the care break");
        }}

     class Ferarri extends Car {


        public Ferarri(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public void stareengin() {
            super.stareengin();
        }

        @Override
        public void acceleration() {
            super.acceleration();
        }

        @Override
        public void breeak() {
            super.breeak();
        }

    }
     class Mercides extends Car {

        public Mercides(int cylinders, String name) {
            super(cylinders, name);
        }

         @Override
         public void stareengin() {
             super.stareengin();
         }

         @Override
         public void acceleration() {
             super.acceleration();
         }

         @Override
         public void breeak() {
             super.breeak();
         }
     }
     class pusrhes extends Car {

        public pusrhes(int cylinders, String name) {
            super(cylinders, name);
        }

         @Override
         public void stareengin() {
             super.stareengin();
         }

         @Override
         public void acceleration() {
             super.acceleration();
         }

         @Override
         public void breeak() {
             super.breeak();
         }
     }
         public class Main {


             public static void main(String[] args) {
                 // write your code here
                 Car car = new Car(8, "Base Car ");

                 System.out.println(car.getCylinders());
                 car.acceleration();
                 car.breeak();
                 Mercides mercides = new Mercides(4,"khalil");
                 mercides.acceleration();
                 mercides.breeak();
                 Car ford = new Car(3, "camleon") {
                     @Override
                     public void stareengin() {
                         super.stareengin();
                     }

                     @Override
                     public void acceleration() {
                         super.acceleration();
                     }

                     @Override
                     public void breeak() {
                         super.breeak();
                     }
                 };


             }
         }
