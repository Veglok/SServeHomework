package Homework.FifthTask;


public class DogApp {
    DogApp.Breed breed = DogApp.Breed.Labrador;
    DogApp.Breed breed2 = DogApp.Breed.Malamute;
    DogApp.Breed breed3 = DogApp.Breed.Shepherd;

    public static void main(String[] args) {

      Dog dog1 = new Dog("Buster", "Labrador", 8);
      Dog dog2 = new Dog("Pumpkin", "Malamute", 12);
      Dog dog3 = new Dog("Lucky", "Shepherd", 6);

      if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName())) {
          System.out.println("There are dogs with same name.");
      }

      else if (dog2.getName().equals(dog3.getName()) || dog2.getName().equals(dog1.getName())) {
          System.out.println("There are dogs with same name.");
      }
      else {
          System.out.println("There are no dogs with same name");

          System.out.println();

          if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
              System.out.println("Oldest dog is: " + dog1.getName() + "; Age: " + dog1.getAge() + "; Kind: " + dog1.getBreed());
          }
          else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
              System.out.println("Oldest dog is: " + dog2.getName() + "; Age: " + dog2.getAge() + "; Kind: " + dog2.getBreed());
          }
          else if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge()) {
              System.out.println("Oldest dog is: " + dog3.getName() + "; Age: " + dog3.getAge() + "; Kind: " + dog3.getBreed());
          }
          else {
              System.out.println("There are two or more dogs with same maximum age.");
          }
      }
    }

    public enum Breed {
        Labrador, Malamute, Shepherd
    }

}


