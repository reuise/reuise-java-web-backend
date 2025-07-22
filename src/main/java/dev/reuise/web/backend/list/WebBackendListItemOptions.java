package dev.reuise.web.backend.list;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.list.WebListItemOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendListItemOptions extends WebBackendListItemPartOptions , WebBackendBasicListItemOptions , WebBackendBasicListItemPartOptions , WebListItemOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendBasicListItemPartOptions getBasicListItemPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}