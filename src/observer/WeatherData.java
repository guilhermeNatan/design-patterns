package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observadores;
    private float temperatura;
    private float pressao;
    private float humidade;

    public WeatherData() {
        this.observadores = new ArrayList<Observer>();
    }


    @Override
    public void registerObserver(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void removeObserver(Observer observador) {
        if (observadores.indexOf(observador) >= 0) {
            observadores.remove(observador);
        }
    }

    @Override
    public void notifyObservers() {
        observadores.forEach(observer -> observer.update(temperatura, humidade, pressao));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    //Sempre que este método for usado todos os observadores serão avisados
    // da mudança de estado
    public void setMeasuments(float temperatura, float pressao, float humidade) {
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.humidade = humidade;
        measurementsChanged();
    }
}
