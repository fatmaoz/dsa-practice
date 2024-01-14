package animal_feast;

public class FeastRules {
    public static void main(String[] args) {

        System.out.println(canBringDish("great blue heron", "garlic naan")); // true
        System.out.println(canBringDish("chickadee", "chocolate cake")); // true
        System.out.println(canBringDish("lion", "lasagna")); // false
    }

    /**
     * All the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start and
     * end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and
     * the chickadee is bringing chocolate cake.
     * ################
     * Write a method that takes the animal's name and dish as arguments and returns true or false to indicate
     * whether the beast is allowed to bring the dish to the feast.
     * ################
     * Assume that beast and dish are always lowercase strings, and that each has at least two letters.
     * Beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
     * They will not contain numerals.*
     */

    public static boolean canBringDish(String beast, String dish) {

        beast = beast.replaceAll("[\\s-]", "");
        dish = dish.replaceAll("[\\s-]", "");

        if (beast.length() < 2 || dish.length() < 2) {
            return false;
        }

        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
}
