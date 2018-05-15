package observer;

public class CurrentConditionDisplay implements Observer {

    private Subject wheaterData ;

    public CurrentConditionDisplay(Subject wheaterData) {
        this.wheaterData = wheaterData;
    }

    @Override
    public void update(float temperatura, float pressao, float humidade) {
        System.out.println("CurrentConditionDisplay temperatura >>> "
                + temperatura + "pressao >>> " + pressao + "humidade >>> " );
    }
}
