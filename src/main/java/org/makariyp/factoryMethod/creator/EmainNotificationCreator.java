package org.makariyp.factoryMethod.creator;

import org.makariyp.factoryMethod.notification.EmailNotification;
import org.makariyp.factoryMethod.notification.Notification;

public class EmainNotificationCreator implements NotificationCreator{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
