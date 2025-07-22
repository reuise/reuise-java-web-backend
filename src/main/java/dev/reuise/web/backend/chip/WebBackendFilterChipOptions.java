package dev.reuise.web.backend.chip;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.chip.WebFilterChipOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendFilterChipOptions extends WebBackendChipOptions , WebBackendChipPartOptions , WebBackendBaseComponentPartOptions , WebFilterChipOptions , WebBackendFilterChipPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendChipPartOptions getChipPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}