package Stock.Observable;

import Stock.Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver obs);

    void remove(NotificationAlertObserver obs);

    void notifySubscriber();

    void setStockCount(int newStockAdded);

    int getStockCount();
}
