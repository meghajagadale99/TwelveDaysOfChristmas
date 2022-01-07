public
class TwelveDays {

    public static
    void main(String[] args) {

        int number = 12;

        for (int i = 1; i <= number; i++) {
            System.out.print("On the ");
            switch (i) {
                case 1:
                    System.out.print("1st");
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
            switch (i) {
                case 12:
                    System.out.print("twelve Drummers Drumming, ");
                case 11:
                    System.out.println("eleven Pipers Piping, ");
                case 10:
                    System.out.print("ten Lords-a-Leaping, ");
                case 9:
                    System.out.print("nine Ladies Dancing, ");
                case 8:
                    System.out.print("eight Maids-a-Milking, ");
                case 7:
                    System.out.print("seven Swans-a-Swimming, ");
                case 6:
                    System.out.print("six Geese-a-Laying, ");
                case 5:
                    System.out.print("five Gold Rings,");
                case 4:
                    System.out.print("four Calling Birds, ");
                case 3:
                    System.out.print("three French Hens, ");
                case 2:
                    System.out.print("Turtle Doves,and ");
                case 1:
                    System.out.print("a Partridge in a Pear Tree.");
                    System.out.println();
            }
            System.out.println();
        }
    }
}
