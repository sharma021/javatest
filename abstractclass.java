abstract class Animal {
        abstract void breed();
     
     }
     
     class Dog extends Animal {
        public void breed() {
           System.out.println("GOLDEN RETRIEVER");
        }
     }
     
     class Cat extends Animal {
        public void breed() {
           System.out.println("Persian Cat");
        }
     }
     
     class abstractclass{
        public static void main(String[] args) {
           Dog d1 = new Dog();
           d1.breed();
     
           Cat c1 = new Cat();
           c1.breed();
        }
     }
