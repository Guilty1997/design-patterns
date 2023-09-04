package design.abstractFactory.ui;

import design.abstractFactory.ui.app.Application;
import design.abstractFactory.ui.factories.GUIFactory;
import design.abstractFactory.ui.factories.MacOSFactory;
import design.abstractFactory.ui.factories.WindowsFactory;
import org.junit.Test;

/**
 * @author：HeHongyi
 * @date: 2023/9/4
 * @description: Ui 测试
 */
public class UIApiTest {
    public static Application configApplication() {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        application = new Application(factory);
        return application;
    }

    @Test
    public void uiTest(){
        Application application = configApplication();
        application.paint();
    }
}
