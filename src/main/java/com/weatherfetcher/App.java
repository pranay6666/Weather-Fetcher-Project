package com.weatherfetcher;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);

		// Step 1: Ask user for city name
		System.out.print("Enter city name: ");
		String city = sc.nextLine();

		// Step 2: Provide your OpenWeatherMap API key
		String apiKey = "135f8aa1e3b448a9a8ad926bc345e730"; // <-- Replace with your API key

		// Step 3: Create WeatherFetcher object
		WeatherDataFetcher fetcher = new WeatherDataFetcher(apiKey);

		// Step 4: Fetch weather data
		WeatherData data = fetcher.fetchWeather(city);

		// Step 5: Check if data was fetched successfully
		if (data != null) {
			System.out.println("\nWeather Data for " + data.getCity() + ":");
			System.out.println("Description : " + data.getDescription());
			System.out.println("Temperature : " + data.getTempC() + " °C [" 
					+ WeatherConverter.celsiusToFahrenheit(data.getTempC()) + " °F]");
			System.out.println("human sensed temperature : " + data.getHumanSensedTempC() + " °C [" 
					+ WeatherConverter.celsiusToFahrenheit(data.getHumanSensedTempC()) + " °F]");
			System.out.println("Humidity : " + data.getHumidity() + " %");
			System.out.println("Pressure : " + data.getPressure() + " hPa");
			System.out.println("Wind Speed : " + data.getWindMs() + " m/s / " 
					+ WeatherConverter.msToMph(data.getWindMs()) + " mph");
		} else {
			System.out.println("Could not fetch weather data. Please check the city name");
		}

		sc.close();
	}
}
