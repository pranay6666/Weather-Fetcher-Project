package com.weatherfetcher;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.json.JSONObject;

public class WeatherDataFetcher 
{
	private String apiKey; // API key for OpenWeatherMap

	// Constructor
	public WeatherDataFetcher(String apiKey)
	{
		this.apiKey = apiKey;
	}
	public WeatherData fetchWeather(String city) {
		try {
			// Step 1: Encode city name to handle spaces/special characters
			String encodedCity = URLEncoder.encode(city, "UTF-8");

			// Step 2: Build the API URL string
			String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" 
					+ encodedCity + "&appid=" + apiKey + "&units=metric";

			// Step 3: Create a URL object from the API URL string
			URL weatherUrl = new URL(urlString);

			// Step 4: Open a generic URL connection
			URLConnection connection = weatherUrl.openConnection();

			// Step 5: Cast the generic URLConnection to HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) connection;

			// Step 6: Set the request method to GET
			conn.setRequestMethod("GET");

			// Step 7: Read the response from the connection
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder content = new StringBuilder();
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();        // Step 8: Close the input stream
			conn.disconnect(); // Step 9: Disconnect the HTTP connection

			// Step 10: Parse the JSON response
			JSONObject obj = new JSONObject(content.toString());
			String cityName = obj.getString("name");
			JSONObject main = obj.getJSONObject("main");
			double tempC = main.getDouble("temp");
			double humanSensedTempC = main.getDouble("feels_like");
			int humidity = main.getInt("humidity");
			int pressure = main.getInt("pressure");
			JSONObject wind = obj.getJSONObject("wind");
			double windMs = wind.getDouble("speed");
			String description = obj.getJSONArray("weather")
					.getJSONObject(0)
					.getString("description");

			// Step 11: Create and return the WeatherData object
			return new WeatherData(cityName, description, tempC, humanSensedTempC, humidity, pressure, windMs);

		} catch (Exception e) {
			System.out.println("Error fetching weather data: " + e.getMessage());
			return null;
		}
	}
}
