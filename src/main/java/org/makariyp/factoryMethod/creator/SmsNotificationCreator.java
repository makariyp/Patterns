package org.makariyp.factoryMethod.creator;

import org.makariyp.factoryMethod.notification.Notification;
import org.makariyp.factoryMethod.notification.SMSNotification;

public class SmsNotificationCreator implements NotificationCreator{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
