import java.util.Observable;
import java.util.Observer;
import java.util.List;
import java.util.ArrayList;

public class WeatherData extends Observable {
  private float temperature;
  private float humidity;
  private float pressure;
  public WeatherData() {

  }
  public float gettemperature() {
    return temperature;
  }
  public float gethumidity() {
    return humidity;
  }
  public float getpressure() {
    return pressure;
  }
  public void measurementsChanged() {
    setChanged();
    notifyObservers();
  }
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}