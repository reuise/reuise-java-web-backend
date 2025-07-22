package dev.reuise.web.backend.applayout;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.applayout.WebAppLayoutOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendAppLayoutOptions extends WebAppLayoutOptions , WebBackendBaseComponentPartOptions , WebBackendAppLayoutPartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}