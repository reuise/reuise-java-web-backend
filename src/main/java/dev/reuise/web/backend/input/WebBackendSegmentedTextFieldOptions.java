package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendRowLayoutOptions;
import dev.reuise.web.backend.layout.WebBackendRowLayoutPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.input.WebSegmentedTextFieldOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSegmentedTextFieldOptions extends WebSegmentedTextFieldOptions , WebBackendContainerPartOptions , WebBackendBaseComponentPartOptions , WebBackendRowLayoutPartOptions , WebBackendFlexContainerPartOptions , WebBackendSegmentedTextFieldPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendRowLayoutOptions {
    WebBackendRowLayoutPartOptions getRowLayoutPart();

    WebBackendFlexContainerPartOptions getFlexContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
