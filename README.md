# 🌦️ WeatherFetcher Project

## 🧩 Overview
A Java console app that fetches **real-time weather data** from the **OpenWeatherMap API** using Java networking and JSON parsing.

---

## ⚙️ How to Run This Project (Eclipse)

### 1️⃣ Prerequisites
- **Java JDK 8+** installed  
- **Eclipse IDE** for Java Developers  
- A valid **OpenWeatherMap API Key** (get it free: https://openweathermap.org/api)

---

### 2️⃣ Add JSON Library (External JAR)
1. Create a folder `lib` inside your Eclipse project.  
2. Download the latest **JSON-java** JAR:  
   https://repo1.maven.org/maven2/org/json/json/  
   (e.g., `json-20230227.jar`)
3. Copy the JAR into your `lib` folder.  
4. In Eclipse:  
   - Right-click project → **Build Path → Configure Build Path**  
   - Click **Add JARs...** → select `lib/json-20230227.jar`  
   - Click **Apply and Close**

---

### 3️⃣ Run the Project
1. In Eclipse, open the class `WeatherMain.java`.  
2. Right-click it → **Run As → Java Application**.  
3. When prompted, enter your **OpenWeatherMap API key**.  
4. Enter a **city name** (e.g., `London`, `Hyderabad`, `New York`).  

✅ You’ll see real-time weather data printed in the console!

---

### 💡 Example Output
------ Weather Info ------
City: Hyderabad
Condition: clear sky
Temperature: 28.3 °C (82.9 °F)
Feels like: 30.1 °C
Humidity: 67%
Pressure: 1012 hPa
Wind Speed: 2.5 m/s (5.6 mph)
