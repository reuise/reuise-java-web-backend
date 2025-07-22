package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.list.WebBackendListItemPart;
import dev.reuise.web.core.menu.WebMenuItemPart;
public interface WebBackendMenuItemPart extends WebBackendListItemPart , WebBackendMenuItemFeatures , WebBackendComponentPart , WebMenuItemPart {
    WebBackendListItemPart getListItemPart();
}