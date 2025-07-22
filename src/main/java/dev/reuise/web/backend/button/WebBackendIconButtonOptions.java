package dev.reuise.web.backend.button;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.button.WebIconButtonOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendIconButtonOptions extends WebIconButtonOptions , WebBackendIconButtonPartOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}