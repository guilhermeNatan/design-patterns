package observer;

/**
 * Quem implementa esta inferce  será trado como observador por algum objeto que implementa a interface
 * Subject, sendo este responsável por invocar o método update de todos os seus observadores .
 */
public interface Observer {

    //Este método pode sser melhorado para usar como parâmetro um objeto que representa os dados trafegados
    // entre o subject e o observer 
    void update(float temperatura,float pressao,float humidade );
}
