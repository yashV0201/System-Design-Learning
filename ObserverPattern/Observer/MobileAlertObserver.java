package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    StockObservable observable;
    String userName;

    public MobileAlertObserver(StockObservable observable, String emailId){
        this.userName = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(userName, "prosuct is in-stock");
    }

    private void sendMail(String userName, String msg){
        System.out.println("mail sent to: "+userName);
    }
    
}
