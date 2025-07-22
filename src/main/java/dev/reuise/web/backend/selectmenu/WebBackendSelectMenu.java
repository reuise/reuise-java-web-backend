package dev.reuise.web.backend.selectmenu;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.selectmenu.WebSelectMenu;
public interface WebBackendSelectMenu extends WebBackendParentComponent , WebBackendSelectMenuPart , WebBackendComponent , WebSelectMenu {
    WebBackendSelectMenu getComponent();
}