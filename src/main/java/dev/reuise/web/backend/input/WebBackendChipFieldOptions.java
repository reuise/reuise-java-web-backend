package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.input.WebChipFieldOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendChipFieldOptions extends WebChipFieldOptions , WebBackendBaseComponentPartOptions , WebBackendTextFieldPartOptions , WebBackendComponentOptions , WebBackendChipFieldPartOptions , WebBackendParentComponentPartOptions , WebBackendTextFieldOptions {
    WebBackendTextFieldPartOptions getTextFieldPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}