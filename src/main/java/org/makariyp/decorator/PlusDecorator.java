package org.makariyp.decorator;

public class PlusDecorator extends Decorator {
    public PlusDecorator(Component component) {
        super(component);
    }

    @Override
    public int operation() {
        return super.operation() + 1;
    }
}
