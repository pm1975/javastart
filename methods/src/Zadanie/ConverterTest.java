package Zadanie;

/**
 * Created by Piotr on 2019-09-23
 */
public class ConverterTest {
    public static void main(String[] args) {
        TimeConverter timeConverter = new TimeConverter();
        int hours = 14;
        int minutes = timeConverter.hoursToMinutes(hours);
        int seconds = timeConverter.minutesToSeconds(minutes);
        int miliseconds = timeConverter.secondsToMiliseconds(seconds);
        System.out.println(hours + " godzin to " + miliseconds + " milisekund.");

        MetricConverter metricConverter = new MetricConverter();
        double meters = 2.5;
        double cm = metricConverter.metersToCm(meters);
        double mm = metricConverter.metersToMm(meters);
        System.out.println(meters + " m to " + cm + " cm i " + mm + " mm.");
    }
}
