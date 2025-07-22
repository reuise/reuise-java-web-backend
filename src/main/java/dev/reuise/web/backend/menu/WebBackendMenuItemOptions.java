package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.list.WebBackendBasicListItemPartOptions;
import dev.reuise.web.backend.list.WebBackendListItemOptions;
import dev.reuise.web.backend.list.WebBackendListItemPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.menu.WebMenuItemOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendMenuItemOptions extends WebBackendListItemPartOptions , WebBackendMenuItemPartOptions , WebBackendBasicListItemPartOptions , WebBackendBaseComponentPartOptions , WebBackendListItemOptions , WebMenuItemOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendListItemPartOptions getListItemPart();

    WebBackendBasicListItemPartOptions getBasicListItemPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}