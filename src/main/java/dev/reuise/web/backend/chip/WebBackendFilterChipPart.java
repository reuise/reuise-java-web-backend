package dev.reuise.web.backend.chip;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.chip.WebFilterChipPart;
public interface WebBackendFilterChipPart extends WebBackendComponentPart , WebFilterChipPart , WebBackendFilterChipFeatures , WebBackendChipPart {
    WebBackendChipPart getChipPart();
}