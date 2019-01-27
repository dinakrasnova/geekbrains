public class Animal {

                public int run;
        public int sweem;
        public double jump;

        public Animal() {
        }


    public void animalInfo() {
        System.out.println();

    }
    }

    class Cat extends Animal {




        public Cat(int run, int sweem, double jump) {
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }

             public void catInfo() {
            System.out.println(" /RunLimit: " + run+ " meters/" + " /Sweem: " + sweem + " /Jump: " +jump+ " meters/");
        }


    }

    class Dog extends Animal {


          public Dog(int run, int sweem, double jump ) {
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }
        public void dogInfo() {
            System.out.println(" /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem + " /Jump: " +jump+ " meters/");
        }



        public static void main(String[] args) {

            Animal animal = new Animal();
            Cat cat = new Cat(200, 0,2.0);
            animal.animalInfo();
            cat.animalInfo();
            cat.catInfo();

            Animal animal2 = new Animal();
            Dog dog = new Dog (500,10,0.5);
            animal2.animalInfo();
            dog.animalInfo();
            dog.dogInfo();

        }
    }