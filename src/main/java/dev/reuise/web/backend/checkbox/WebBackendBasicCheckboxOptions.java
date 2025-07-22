package dev.reuise.web.backend.checkbox;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.checkbox.WebBasicCheckboxOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendBasicCheckboxOptions extends WebBasicCheckboxOptions , WebBackendBaseComponentPartOptions , WebBackendBasicCheckboxPartOptions , WebBackendComponentOptions , WebBackendBaseComponentOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();
}