package dev.reuise.web.backend.chip;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.chip.WebFilterChip;
public interface WebBackendFilterChip extends WebBackendFilterChipPart , WebBackendChip , WebBackendComponent , WebFilterChip {
    WebBackendFilterChip getComponent();
}