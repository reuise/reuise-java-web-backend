package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.core.menu.WebMenuButtonItem;
public interface WebBackendMenuButtonItem extends WebBackendMenuButtonItemPart , WebMenuButtonItem , WebBackendButton , WebBackendComponent {
    WebBackendMenuButtonItem getComponent();
}
