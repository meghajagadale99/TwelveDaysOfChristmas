import java.util.ArrayList;
import java.util.Arrays;

public
class Twelve {
    public static void main(String[] args) {

        ArrayList<String> gifts = new ArrayList<>();
        gifts.addAll(Arrays.asList("a Partridge in a Pear Tree.", "Turtle Doves,and ",
                "three French Hens,", "four Calling Birds,", "five Gold Rings,", "six Geese-a-Laying,",
                "seven Swans-a-Swimming,", "eight Maids-a-Milking,", "nine Ladies Dancing,",
                "ten Lords-a-Leaping,", "eleven Pipers Piping,", "twelve Drummers Drumming,"));

        int number = 12;

        for (int i = 1; i <= number; i++) {
            System.out.print("On the ");

            switch (i) {
                case 1:
                    System.out.print("1St");
                    break;
                case 2:
                    System.out.print("2nd");
                    break;
                case 3:
                    System.out.print("3rd");
                    break;
                default:
                    System.out.print(i + "th");
            }
            System.out.print(" day of Christmas my true love gave to me: \n");

            for (int j = i - 1; j >= 0; j--) {
                System.out.print(gifts.get(j));

            }
            System.out.println();
        }

    }
}
