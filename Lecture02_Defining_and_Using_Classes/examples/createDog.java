public class createDog {
    public int weightInPounds;
    /** One integer constructor for createDog */
    public createDog(int weight) {
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
}