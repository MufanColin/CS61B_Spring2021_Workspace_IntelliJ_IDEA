public class printAnimals{
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].contains("horse")) {
                continue;
            }
            for (int j = 0; j < 3; j++) {
                System.out.println(animals[i]);
            }
        }
    }
}