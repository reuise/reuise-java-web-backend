package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.input.WebBasicInputFieldOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendBasicInputFieldOptions extends WebBackendBaseComponentPartOptions , WebBasicInputFieldOptions , WebBackendComponentOptions , WebBackendBasicInputFieldPartOptions , WebBackendBaseComponentOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
