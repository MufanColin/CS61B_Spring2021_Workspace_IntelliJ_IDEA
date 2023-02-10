public class Dog {
    public int weightInPounds;
    public Dog(int weight) {
        //this.weightInPounds = weight;
        weightInPounds = weight;
    }
    public void makeNoise() {
        if (this.weightInPounds < 10) {
            System.out.println("yip!");
        } else if (this.weightInPounds < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woooof!");
        }
    }
    public static Dog maxDog(Dog d1, Dog d2) {
        return (d1.weightInPounds > d2.weightInPounds) ? d1 : d2;
    }
}