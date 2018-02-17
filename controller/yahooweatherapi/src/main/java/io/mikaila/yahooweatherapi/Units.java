package io.mikaila.yahooweatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Units {
    private String distance;

    public Units(){

    }

    @Override
    public String toString() {
        return "Units{" +
                "distance='" + distance + '\'' +
                ", pressure='" + pressure + '\'' +
                ", speed='" + speed + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    private String pressure;
    private String speed;
    private String temperature;
}
