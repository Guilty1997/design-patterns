package design.abstractFactory.ui.buttons;

/**
 * @author：HeHongyi
 * @date: 2023/9/4
 * @description:
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
