package design.abstractFactory.ui.checkboxes;

/**
 * @author：HeHongyi
 * @date: 2023/9/4
 * @description:
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
