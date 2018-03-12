/**
 * Weather Station test application
 * 
 * @author Priya Renjith
 *
 */

public class WeatherStation {
  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData(); // creates the WeatherData object

    // create the display element and pass the WeatherData object
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    weatherData.setMeasurements(100f, 67f, 30.4f);
    weatherData.setMeasurements(92f, 100f, 35f);
    weatherData.setMeasurements(87f, 90f, 29.2f);

  }
}
