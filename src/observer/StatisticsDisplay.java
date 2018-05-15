package observer;

public class StatisticsDisplay implements Observer {

    private Subject wheaterData ;

    public StatisticsDisplay(Subject wheaterData) {
        this.wheaterData = wheaterData;
    }

    @Override
    public void update(float temperatura, float pressao, float humidade) {
        System.out.println("StatisticsDisplay temperatura ### "
                + temperatura + "pressao ### " + pressao + "humidade ### " );
    }
}
