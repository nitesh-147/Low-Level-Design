package Stock.StockStore;

import Stock.Observable.IphoneStockObservable;
import Stock.Observable.StockObservable;
import Stock.Observer.EmailAlertObserver;
import Stock.Observer.MobileAlertObserver;
import Stock.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable stockObs = new IphoneStockObservable();

        NotificationAlertObserver obs1 = new EmailAlertObserver("abc@gmail.com", stockObs);
        NotificationAlertObserver obs2 = new EmailAlertObserver("nst@gmail.com", stockObs);
        NotificationAlertObserver obs3 = new MobileAlertObserver("nkr147", stockObs);

        stockObs.add(obs3);
        stockObs.add(obs2);
        stockObs.add(obs1);

        stockObs.setStockCount(10);
    }
}
