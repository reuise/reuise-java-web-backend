package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.text.WebHeadingOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendHeadingOptions extends WebBackendHeadingPartOptions , WebBackendBaseComponentPartOptions , WebBackendTextOptions , WebBackendComponentOptions , WebBackendTextPartOptions , WebBackendParentComponentPartOptions , WebHeadingOptions {
    WebBackendTextPartOptions getTextPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}