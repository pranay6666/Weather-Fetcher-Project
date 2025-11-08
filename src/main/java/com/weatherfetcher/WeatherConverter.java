package com.weatherfetcher;

public class WeatherConverter
{
	public static double celsiusToFahrenheit(double tempC)
	{
		return (tempC*9/5)+32;
	}
	public static double msToMph(double windMs) {
		return windMs * 2.23694;
	}
}
