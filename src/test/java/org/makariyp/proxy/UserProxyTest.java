package org.makariyp.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserProxyTest {

    @Test
    public void testGetPassword() {
        // gives
        UserInfo user = DataBase.getUser("admin");
        UserInfo proxyUser = new UserProxy("admin");

        // when
        String userPass = user.getPassword();
        String proxyPass = proxyUser.getPassword();
        String proxyPass2 = proxyUser.getPassword();

        // then
        assertEquals(userPass, proxyPass);
        assertEquals(proxyPass2, proxyPass);
    }
}