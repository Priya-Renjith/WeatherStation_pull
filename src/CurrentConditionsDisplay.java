/**
 * This display element implements Observer and uses the pull method to get the data from
 * WeatherData object.
 * 
 * @author Priya Renjith
 *
 */
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Observable observable;

  public CurrentConditionsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  public void update(Observable obs, Object arg) {
    if (obs instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) obs;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }

  public void display() {
    System.out.println("Current Conditions: " + this.temperature + "F Degrees and " + this.humidity
        + "% humidity");
  }
}
