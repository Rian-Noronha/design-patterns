package observer;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged(){
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressura = getPressure();

        //currentConditionsDisplay.update(temp, humidity, pressure);
        //statisticsDisplay.update(temp, humidity, pressura);
        //forecastDisplay.update(temp, humidity, pressure);
    }
}
