package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.text.WebIconLabelOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendIconLabelOptions extends WebBackendBaseComponentPartOptions , WebBackendIconLabelPartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebBackendParentComponentPartOptions , WebIconLabelOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}