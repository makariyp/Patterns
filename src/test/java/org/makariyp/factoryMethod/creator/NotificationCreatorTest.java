package org.makariyp.factoryMethod.creator;

import org.junit.jupiter.api.Test;
import org.makariyp.factoryMethod.notification.EmailNotification;
import org.makariyp.factoryMethod.notification.Notification;
import org.makariyp.factoryMethod.notification.PushNotification;
import org.makariyp.factoryMethod.notification.SMSNotification;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class NotificationCreatorTest {

    @Test
    void createNotification() {
        // gives
        NotificationCreator sms = new SmsNotificationCreator();
        NotificationCreator email = new EmainNotificationCreator();
        NotificationCreator push = new PushNotificationCreator();

        // when
        Notification smsNotification = sms.createNotification();
        Notification emailNotification = email.createNotification();
        Notification pushNotification = push.createNotification();

        // then
        assertInstanceOf(SMSNotification.class, smsNotification);
        assertInstanceOf(EmailNotification.class, emailNotification);
        assertInstanceOf(PushNotification.class, pushNotification);
    }
}