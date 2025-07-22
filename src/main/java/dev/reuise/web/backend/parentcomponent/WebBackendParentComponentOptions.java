package dev.reuise.web.backend.parentcomponent;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendParentComponentOptions extends WebBackendBaseComponentPartOptions , WebParentComponentOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendBaseComponentOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();
}