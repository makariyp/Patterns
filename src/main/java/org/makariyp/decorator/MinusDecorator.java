package org.makariyp.decorator;

public class MinusDecorator extends Decorator {
    public MinusDecorator(Component component) {
        super(component);
    }

    @Override
    public int operation() {
        return super.operation() - 1;
    }
}
