package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.menu.WebMenuDividerPart;
public interface WebBackendMenuDividerPart extends WebBackendComponentPart , WebBackendMenuItemPart , WebMenuDividerPart , WebBackendMenuDividerFeatures {
    WebBackendMenuItemPart getMenuItemPart();
}