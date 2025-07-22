package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.input.WebPasswordFieldOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendPasswordFieldOptions extends WebBackendBaseComponentPartOptions , WebBackendTextFieldPartOptions , WebBackendComponentOptions , WebBackendPasswordFieldPartOptions , WebBackendParentComponentPartOptions , WebPasswordFieldOptions , WebBackendTextFieldOptions {
    WebBackendTextFieldPartOptions getTextFieldPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}