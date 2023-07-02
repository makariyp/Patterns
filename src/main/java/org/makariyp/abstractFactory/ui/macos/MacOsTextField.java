package org.makariyp.abstractFactory.ui.macos;

import org.makariyp.abstractFactory.ui.TextField;

public class MacOsTextField implements TextField {
    @Override
    public void onValueChanged() {
        System.out.println("Mac OS TextField value changed");
    }
}
