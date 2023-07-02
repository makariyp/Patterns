package org.makariyp.decorator;

public abstract class Decorator implements Component {
    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public int operation() {
        return component.operation();
    }
}
