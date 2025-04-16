import java.util.Scanner;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize time with hours, minutes, and seconds
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalizeTime();
    }

    // Constructor to initialize time with only hours and minutes
    public Time(int hours, int minutes) {
        this(hours, minutes, 0);
    }

    // Constructor to initialize time with only hours
    public Time(int hours) {
        this(hours, 0, 0);
    }

    // Default constructor (initialize to 00:00:00)
    public Time() {
        this(0, 0, 0);
    }

    // Method to normalize time (convert overflow in minutes and seconds)
    private void normalizeTime() {
        this.minutes += this.seconds / 60;
        this.seconds = this.seconds % 60;
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
        this.hours = this.hours % 24; // Ensures hours stay within 24-hour format
    }

    // Method to add two Time objects
    public Time add(Time other) {
        return new Time(this.hours + other.hours, this.minutes + other.minutes, this.seconds + other.seconds);
    }

    // Method to find the difference between two Time objects
    public Time difference(Time other) {
        int totalSeconds1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int totalSeconds2 = other.hours * 3600 + other.minutes * 60 + other.seconds;
        int diffSeconds = Math.abs(totalSeconds1 - totalSeconds2);

        int diffHours = diffSeconds / 3600;
        diffSeconds %= 3600;
        int diffMinutes = diffSeconds / 60;
        diffSeconds %= 60;

        return new Time(diffHours, diffMinutes, diffSeconds);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time1 (hours minutes seconds):");
        Time time1 = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("Enter time2 (hours minutes seconds):");
        Time time2 = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        Time addedTime = time1.add(time2);
        Time diffTime = time1.difference(time2);

        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);
        System.out.println("Added Time: " + addedTime);
        System.out.println("Difference Time: " + diffTime);

        scanner.close();
    }
}
