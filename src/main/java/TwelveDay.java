public
class TwelveDay {

    public static
    void main(String[] args) {
        String days[] = {"first", "second", "third", "fourth", "fifth",
                "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};


        String gifts[] = {"a Partridge in a Pear Tree.", "Turtle Doves,and ",
                "three French Hens,", "four Calling Birds,", "five Gold Rings,", "six Geese-a-Laying,",
                "seven Swans-a-Swimming,", "eight Maids-a-Milking,", "nine Ladies Dancing,",
                "ten Lords-a-Leaping,", "eleven Pipers Piping,", "twelve Drummers Drumming,"};


        for (int i = 0; i < days.length; i++) {
            System.out.print("On The " + days[i] + " day of Christmas my true love gave to me: ");
            for (int j = i; j >= 0; j--) {
                System.out.print(gifts[j]);
            }
            System.out.println();
            System.out.println();
        }
    }
}


