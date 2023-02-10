public class DogLoop {
    public static void main(String[] args) {
        Dog smallDog = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog hugeDog = new Dog(150);
        Dog[] manydogs = new Dog[3];
        manydogs[0] = smallDog;
        manydogs[1] = mediumDog;
        manydogs[2] = hugeDog;
        int i = 0;
        while (i < manydogs.length) {
            Dog.maxDog(manydogs[i], mediumDog).makeNoise();
            i += 1;
        }
    }
}