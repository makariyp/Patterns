package org.makariyp.abstractFactory.factory;

import org.makariyp.abstractFactory.ui.Button;
import org.makariyp.abstractFactory.ui.TextField;
import org.makariyp.abstractFactory.ui.macos.MacOsButton;
import org.makariyp.abstractFactory.ui.macos.MacOsTextField;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public TextField createTextField() {
        return new MacOsTextField();
    }
}
