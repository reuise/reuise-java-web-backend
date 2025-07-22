package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendInlineTextOptions extends WebBackendBaseComponentPartOptions , WebBackendTextOptions , WebInlineTextOptions , WebBackendInlineTextPartOptions , WebBackendComponentOptions , WebBackendTextPartOptions , WebBackendParentComponentPartOptions {
    WebBackendTextPartOptions getTextPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}