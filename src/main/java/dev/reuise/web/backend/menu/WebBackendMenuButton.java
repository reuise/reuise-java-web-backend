package dev.reuise.web.backend.menu;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.menu.WebMenuButton;
public interface WebBackendMenuButton extends WebBackendMenuButtonPart , WebBackendComponent , WebMenuButton , WebBackendContainer {
    WebBackendMenuButton getComponent();

    WebBackendMenuButton setAnimation(ComponentAnimation animation);

    WebBackendMenuButton startAnimation();

    WebBackendMenuButton cancelAnimation();
}
