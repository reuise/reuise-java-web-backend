package dev.reuise.web.backend.chip;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendFieldSetOptions;
import dev.reuise.web.backend.layout.WebBackendFieldSetPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.chip.WebChipGroupOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendChipGroupOptions extends WebChipGroupOptions , WebBackendContainerPartOptions , WebBackendFieldSetOptions , WebBackendChipGroupPartOptions , WebBackendBaseComponentPartOptions , WebBackendFieldSetPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendFieldSetPartOptions getFieldSetPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}