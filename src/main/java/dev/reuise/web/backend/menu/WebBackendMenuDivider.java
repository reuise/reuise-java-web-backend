package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.menu.WebMenuDivider;
public interface WebBackendMenuDivider extends WebBackendMenuItem , WebMenuDivider , WebBackendComponent , WebBackendMenuDividerPart {
    WebBackendMenuDivider getComponent();
}