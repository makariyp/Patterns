package org.makariyp.factoryMethod.creator;

import org.makariyp.factoryMethod.notification.Notification;
import org.makariyp.factoryMethod.notification.PushNotification;

public class PushNotificationCreator implements NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
