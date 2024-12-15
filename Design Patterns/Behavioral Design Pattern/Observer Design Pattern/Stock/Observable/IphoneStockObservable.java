package Stock.Observable;

import java.util.ArrayList;
import java.util.List;

import Stock.Observer.NotificationAlertObserver;

public class IphoneStockObservable implements StockObservable {
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver obs) {
        observerList.add(obs);
    }

    @Override
    public void remove(NotificationAlertObserver obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            notifySubscriber();
        }
        this.stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

}
