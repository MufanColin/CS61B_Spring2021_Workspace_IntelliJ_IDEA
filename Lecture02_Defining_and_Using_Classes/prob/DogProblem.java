public class DogProblem {
    // Dog sizes are [10, 15, 20, 15, 10, 5, 10, 15, 22, 20],
    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        Dog[] returnDogs = new Dog[dogs.length];
        int cnt = 0;
        for (int i = 0; i < dogs.length; i++) {
            if (isBiggestOfFour(dogs, i)) {
                returnDogs[cnt] = dogs[i];
                cnt += 1;
            }
        }
        returnDogs = arrayWithNoNulls(returnDogs, cnt);
        return returnDogs;
    }

    public static Dog[] arrayWithNoNulls(Dog[] completeDogs, int bound) {
        Dog[] newDogs = new Dog[bound];
        System.arraycopy(completeDogs, 0, newDogs, 0, bound);
        return newDogs;
    }
    public static boolean isBiggestOfFour(Dog[] dogs, int i) {
        for (int j = -2; j <= 2; j++) {
            if (j != 0 && 0 <= i + j && i + j < dogs.length && dogs[i + j].weightInPounds >= dogs[i].weightInPounds) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Dog[] dogs = new Dog[] {
                new Dog(10),
                new Dog(15),
                new Dog(20),
                new Dog(15),
                new Dog(10),
                new Dog(5),
                new Dog(10),
                new Dog(15),
                new Dog(22),
                new Dog(20)
        };
        Dog[] bigDogs = largerThanFourNeighbors(dogs);
        for (Dog bigDog : bigDogs) {
            System.out.print(bigDog.weightInPounds + " ");
        }
        System.out.println();
    }
}
