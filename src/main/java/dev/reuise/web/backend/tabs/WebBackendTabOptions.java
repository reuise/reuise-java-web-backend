package dev.reuise.web.backend.tabs;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.tabs.WebTabOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendTabOptions extends WebBackendTabPartOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebTabOptions , WebBackendParentComponentPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
