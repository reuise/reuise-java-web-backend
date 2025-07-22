package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.text.WebLabelOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendLabelOptions extends WebLabelOptions , WebBackendInlineTextOptions , WebBackendBaseComponentPartOptions , WebBackendInlineTextPartOptions , WebBackendComponentOptions , WebBackendTextPartOptions , WebBackendLabelPartOptions , WebBackendParentComponentPartOptions {
    WebBackendInlineTextPartOptions getInlineTextPart();

    WebBackendTextPartOptions getTextPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}