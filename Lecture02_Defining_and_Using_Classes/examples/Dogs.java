public class Dogs {
    public int weightInPounds;
    public static String binomialName = "Canis familiaris";
    public Dogs(int weight) {
        weightInPounds = weight;
    }
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woooof!");
        }
    }
    public Dogs maxDog(Dogs anotherDog) {
        return (this.weightInPounds > anotherDog.weightInPounds) ? this : anotherDog;
    }
}