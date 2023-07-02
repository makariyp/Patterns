package org.makariyp.proxy;

public class UserProxy implements UserInfo {
    private final String username;
    private DefaultUser user = null;

    public UserProxy(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        if (user == null) {
            user = DataBase.getUser(username);
        }
        return user.getPassword();
    }
}
