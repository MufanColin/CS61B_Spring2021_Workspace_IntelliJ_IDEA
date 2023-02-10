public class DogsLauncher {
    public static void main(String[] args) {
        Dogs firstDog = new Dogs(5);
        Dogs secondDog = new Dogs(100);
        Dogs biggerDog = firstDog.maxDog(secondDog);
        System.out.println(Dogs.binomialName);
        biggerDog.makeNoise();
    }
}