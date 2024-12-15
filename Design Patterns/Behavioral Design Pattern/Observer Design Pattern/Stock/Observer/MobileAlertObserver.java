package Stock.Observer;

import Stock.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    StockObservable _stockObservable;
    String _username;

    public MobileAlertObserver(String username, StockObservable stockObservable) {
        _stockObservable = stockObservable;
        _username = username;
    }

    @Override
    public void update() {
        System.out.println("Mobile alert has been sent to username : " + _username);
    }

}
