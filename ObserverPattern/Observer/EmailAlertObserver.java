package ObserverPattern.Observer;

import ObserverPattern.Observable.*;

public class EmailAlertObserver implements NotificationAlertObserver{
    StockObservable observable;
    String emailId;

    public EmailAlertObserver(StockObservable observable, String emailId){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "prosuct is in-stock");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("mail sent to: "+emailId);
    }
    
}
