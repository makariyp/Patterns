package org.makariyp.proxy;

public class DefaultUser implements UserInfo {
    private final String username;
    private final String password;

    public DefaultUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
