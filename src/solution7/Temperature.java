package solution7;

public class Temperature {
    float temperature;
    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float fahrenheitToCelsius()
    {
        return (getTemperature()-32)*5/9;
    }
    public float celsiusToFahrenheit()
    {
        return (1.8f*getTemperature())+12;
    }
}
