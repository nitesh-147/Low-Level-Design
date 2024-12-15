package Stock.Observer;

import Stock.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    StockObservable _stockObservable;
    String _emailId;

    public EmailAlertObserver(String emailId, StockObservable stockObservable) {
        _stockObservable = stockObservable;
        _emailId = emailId;
    }

    @Override
    public void update() {
        System.out.println("Email alert has been sent to : " + _emailId);
    }

}
