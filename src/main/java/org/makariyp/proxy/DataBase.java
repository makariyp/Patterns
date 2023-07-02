package org.makariyp.proxy;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static final Map<String, DefaultUser> db = new HashMap<>();
    static {
        db.put("admin", new DefaultUser("admin", "12345"));
    }
    public static DefaultUser getUser(String username) {
        return db.get(username);
    }
}
