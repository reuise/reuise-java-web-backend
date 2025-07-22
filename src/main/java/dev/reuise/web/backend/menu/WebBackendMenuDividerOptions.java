package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.list.WebBackendBasicListItemPartOptions;
import dev.reuise.web.backend.list.WebBackendListItemPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.menu.WebMenuDividerOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendMenuDividerOptions extends WebBackendListItemPartOptions , WebBackendMenuItemPartOptions , WebBackendBasicListItemPartOptions , WebBackendBaseComponentPartOptions , WebMenuDividerOptions , WebBackendMenuDividerPartOptions , WebBackendMenuItemOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendMenuItemPartOptions getMenuItemPart();

    WebBackendListItemPartOptions getListItemPart();

    WebBackendBasicListItemPartOptions getBasicListItemPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}