package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.text.WebTextOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendTextOptions extends WebTextOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendTextPartOptions , WebBackendParentComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}