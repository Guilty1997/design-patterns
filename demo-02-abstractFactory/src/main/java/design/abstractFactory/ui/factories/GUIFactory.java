package design.abstractFactory.ui.factories;

import design.abstractFactory.ui.buttons.Button;
import design.abstractFactory.ui.checkboxes.Checkbox;

/**
 * @author：HeHongyi
 * @date: 2023/9/4
 * @description: GUI工厂
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
