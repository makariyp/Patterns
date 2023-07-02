package org.makariyp.abstractFactory.ui.windows;

import org.makariyp.abstractFactory.ui.Button;

public class WindowsButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Windows button clicked");
    }
}
