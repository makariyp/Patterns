package org.makariyp.abstractFactory.ui.windows;

import org.makariyp.abstractFactory.ui.TextField;

public class WindowsTextField implements TextField {
    @Override
    public void onValueChanged() {
        System.out.println("Windows TextField value changed");
    }
}
