package org.makariyp.abstractFactory.ui.macos;

import org.makariyp.abstractFactory.ui.Button;

public class MacOsButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Mac OS button clicked");
    }
}
