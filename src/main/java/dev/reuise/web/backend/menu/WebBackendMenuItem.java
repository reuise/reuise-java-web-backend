package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.list.WebBackendListItem;
import dev.reuise.web.core.menu.WebMenuItem;
public interface WebBackendMenuItem extends WebMenuItem , WebBackendMenuItemPart , WebBackendListItem , WebBackendComponent {
    WebBackendMenuItem getComponent();
}