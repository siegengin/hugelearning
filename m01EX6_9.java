public class m01EX6_9 {
    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("-----------------------------");

        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
            double convertedMeters = footToMeter(feet);
            double convertedFeet = meterToFoot(meters);

            System.out.printf("%.1f\t%.3f\t|\t%.1f\t%.3f%n",
                    feet, convertedMeters, meters, convertedFeet);
        }
    }
}
