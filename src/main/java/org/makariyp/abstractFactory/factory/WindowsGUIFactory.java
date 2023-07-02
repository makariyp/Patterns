package org.makariyp.abstractFactory.factory;

import org.makariyp.abstractFactory.ui.Button;
import org.makariyp.abstractFactory.ui.TextField;
import org.makariyp.abstractFactory.ui.windows.WindowsButton;
import org.makariyp.abstractFactory.ui.windows.WindowsTextField;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
