package design.abstractFactory.ui.factories;

import design.abstractFactory.ui.buttons.Button;
import design.abstractFactory.ui.buttons.MacOSButton;
import design.abstractFactory.ui.checkboxes.Checkbox;
import design.abstractFactory.ui.checkboxes.MacOSCheckbox;

/**
 * @author：HeHongyi
 * @date: 2023/9/4
 * @description:
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
