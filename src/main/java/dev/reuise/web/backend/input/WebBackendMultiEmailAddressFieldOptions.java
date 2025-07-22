package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.input.WebMultiEmailAddressFieldOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendMultiEmailAddressFieldOptions extends WebMultiEmailAddressFieldOptions , WebBackendBaseComponentPartOptions , WebBackendTextFieldPartOptions , WebBackendComponentOptions , WebBackendChipFieldPartOptions , WebBackendParentComponentPartOptions , WebBackendChipFieldOptions , WebBackendMultiEmailAddressFieldPartOptions {
    WebBackendChipFieldPartOptions getChipFieldPart();

    WebBackendTextFieldPartOptions getTextFieldPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}