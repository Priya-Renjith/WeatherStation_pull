import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
  private float temperature;
  private float humidity;
  private float pressure;
  
  public WeatherData() {}
  
  public void measurementsChanged() {
    setChanged(); //first call setChanged() method to indicate the state has changed before call the notifyObservers()
    notifyObservers(); //not sending a data object with method call. So, this is a pull method.
  }
  
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature =  temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  /** Observers use these methods to get the WeatherData object's state  
   * 
   * 
   */
  public float getTemperature() {
    return temperature;
  }
  
  public float getHumidity() {
    return humidity;
  }
  
  public float getPressure() {
    return pressure;
  }
}