package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.text.WebTextBlockOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendTextBlockOptions extends WebBackendBaseComponentPartOptions , WebBackendTextOptions , WebBackendTextBlockPartOptions , WebBackendComponentOptions , WebBackendTextPartOptions , WebBackendParentComponentPartOptions , WebTextBlockOptions {
    WebBackendTextPartOptions getTextPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}