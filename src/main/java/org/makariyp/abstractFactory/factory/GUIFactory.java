package org.makariyp.abstractFactory.factory;

import org.makariyp.abstractFactory.ui.Button;
import org.makariyp.abstractFactory.ui.TextField;

public interface GUIFactory {
    Button createButton();
    TextField createTextField();
}
