package ObserverPattern;

import ObserverPattern.Observable.*;
import ObserverPattern.Observer.*;

public class Store {

    public static void main(String[] args) {
        StockObservable Iphone = new IphoneObservableImpl();

        NotificationAlertObserver obs1 = new EmailAlertObserver(Iphone,"xyz@abc.com");   
        NotificationAlertObserver obs2 = new EmailAlertObserver(Iphone,"xyz1@abc.com");   
        NotificationAlertObserver obs3 = new MobileAlertObserver(Iphone,"xyz_123"); 
        
        Iphone.add(obs1);
        Iphone.add(obs2);
        Iphone.add(obs3);

        Iphone.setStockCount(20);
    }
        
}
