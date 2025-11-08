package com.weatherfetcher;

public class WeatherData
{
    private String city;
    private String description;
    private double tempC;               // Actual temperature in Celsius
    private double humanSensedTempC;    // “Feels like” temperature in Celsius
    private int humidity;
    private int pressure;
    private double windMs;
    
    public WeatherData()
    {
    	
    }
	public WeatherData(String city, String description, double tempC, double humanSensedTempC, int humidity,
			int pressure, double windMs) {
		this.city = city;
		this.description = description;
		this.tempC = tempC;
		this.humanSensedTempC = humanSensedTempC;
		this.humidity = humidity;
		this.pressure = pressure;
		this.windMs = windMs;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getTempC() {
		return tempC;
	}

	public void setTempC(double tempC) {
		this.tempC = tempC;
	}

	public double getHumanSensedTempC() {
		return humanSensedTempC;
	}

	public void setHumanSensedTempC(double humanSensedTempC) {
		this.humanSensedTempC = humanSensedTempC;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public double getWindMs() {
		return windMs;
	}

	public void setWindMs(double windMs) {
		this.windMs = windMs;
	}

	@Override
	public String toString() {
		return "WeatherData [city=" + city + ", description=" + description + ", tempC=" + tempC + ", humanSensedTempC="
				+ humanSensedTempC + ", humidity=" + humidity + ", pressure=" + pressure + ", windMs=" + windMs + "]";
	}
	
    
}
