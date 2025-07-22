package dev.reuise.web.backend.list;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.list.WebBasicListItemOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendBasicListItemOptions extends WebBackendBasicListItemPartOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebBackendParentComponentPartOptions , WebBasicListItemOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}