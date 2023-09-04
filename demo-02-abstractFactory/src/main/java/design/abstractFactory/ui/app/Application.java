package design.abstractFactory.ui.app;

import design.abstractFactory.ui.buttons.Button;
import design.abstractFactory.ui.checkboxes.Checkbox;
import design.abstractFactory.ui.factories.GUIFactory;

/**
 * @author：HeHongyi
 * @date: 2023/9/4
 * @description: 程序入口
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
