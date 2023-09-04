package design.abstractFactory.ui.factories;

import design.abstractFactory.ui.buttons.Button;
import design.abstractFactory.ui.buttons.WindowsButton;
import design.abstractFactory.ui.checkboxes.Checkbox;
import design.abstractFactory.ui.checkboxes.WindowsCheckbox;

/**
 * @author：HeHongyi
 * @date: 2023/9/4
 * @description:
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
