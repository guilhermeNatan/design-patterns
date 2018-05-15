package observer;

/**
 * Interface que representa o sujeito, aquele que é observado
 * quem implementa esta inferface irá provê os mecanismos para que os observadores
 * sejam avisados quando houver alteração no estado da classe que implementa esta inferface
 */
public interface Subject {

    void registerObserver(Observer observador);

    void removeObserver(Observer observador);

    void notifyObservers();

}
