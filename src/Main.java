public class Main {
    public static void main(String[] args) {
        convertToCentimeters(70);
        convertToCentimeters(5, 10);
    }

    public static double convertToCentimeters(int heightInInches) {
        double heightInCentimeters = heightInInches * 2.54;
        System.out.println("Your height is "  + heightInInches + " inches which in centimeters is " + heightInCentimeters + " centimeters.");
        return heightInCentimeters;
    }
    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        double feetToCentimeters = heightInFeet * 30.48;
        double inchesToCentimeters = heightInInches * 2.54;
        double totalSum = feetToCentimeters + inchesToCentimeters;
        System.out.println("Your height is " + heightInFeet + " foot " + heightInInches + " inches which in centimeters is " + totalSum + " centimeters.");
        return totalSum;
    }
}