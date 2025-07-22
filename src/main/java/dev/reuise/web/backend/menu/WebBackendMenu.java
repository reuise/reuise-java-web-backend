package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.menu.WebMenu;
public interface WebBackendMenu extends WebMenu , WebBackendMenuPart , WebBackendParentComponent , WebBackendComponent {
    WebBackendMenu getComponent();
}