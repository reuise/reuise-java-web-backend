package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.input.WebSearchFieldOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSearchFieldOptions extends WebBackendBaseComponentPartOptions , WebBackendTextFieldPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendSearchFieldPartOptions , WebBackendTextFieldOptions , WebSearchFieldOptions {
    WebBackendTextFieldPartOptions getTextFieldPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}