package observer;

public class TesteObserver {

    public static void main(String ...args)
    {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay cd = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay std = new StatisticsDisplay(weatherData);
        weatherData.registerObserver(cd);
        weatherData.registerObserver(std);
        weatherData.setMeasuments(5,2,3);
        weatherData.setMeasuments(10,12,32);
        weatherData.removeObserver(std);
        weatherData.setMeasuments(25,34,60);

    }
}
