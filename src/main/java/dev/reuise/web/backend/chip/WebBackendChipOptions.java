package dev.reuise.web.backend.chip;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.chip.WebChipOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendChipOptions extends WebBackendChipPartOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebBackendParentComponentPartOptions , WebChipOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}