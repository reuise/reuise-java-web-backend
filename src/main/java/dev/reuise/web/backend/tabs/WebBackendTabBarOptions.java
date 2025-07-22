package dev.reuise.web.backend.tabs;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.tabs.WebTabBarOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendTabBarOptions extends WebBackendContainerPartOptions , WebBackendBaseComponentPartOptions , WebBackendContainerOptions , WebBackendComponentOptions , WebTabBarOptions , WebBackendParentComponentPartOptions , WebBackendTabBarPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}