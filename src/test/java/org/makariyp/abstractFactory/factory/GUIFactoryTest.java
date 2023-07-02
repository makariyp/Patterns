package org.makariyp.abstractFactory.factory;

import org.junit.jupiter.api.Test;
import org.makariyp.abstractFactory.ui.Button;
import org.makariyp.abstractFactory.ui.TextField;
import org.makariyp.abstractFactory.ui.macos.MacOsButton;
import org.makariyp.abstractFactory.ui.macos.MacOsTextField;
import org.makariyp.abstractFactory.ui.windows.WindowsButton;
import org.makariyp.abstractFactory.ui.windows.WindowsTextField;

import static org.junit.jupiter.api.Assertions.*;

class GUIFactoryTest {

    @Test
    void createButton() {
        // gives
        GUIFactory windowsFactory = new WindowsGUIFactory();
        GUIFactory macFactory = new MacGUIFactory();

        // when
        Button windowsButton = windowsFactory.createButton();
        Button macButton = macFactory.createButton();

        // then
        assertInstanceOf(WindowsButton.class, windowsButton);
        assertInstanceOf(MacOsButton.class, macButton);
    }

    @Test
    void createTextField() {
        // gives
        GUIFactory windowsFactory = new WindowsGUIFactory();
        GUIFactory macFactory = new MacGUIFactory();

        // when
        TextField windowsTextField = windowsFactory.createTextField();
        TextField macTextField = macFactory.createTextField();

        // then
        assertInstanceOf(WindowsTextField.class, windowsTextField);
        assertInstanceOf(MacOsTextField.class, macTextField);
    }
}