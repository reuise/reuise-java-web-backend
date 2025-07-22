package dev.reuise.web.backend.chip;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.chip.WebChip;
public interface WebBackendChip extends WebChip , WebBackendParentComponent , WebBackendComponent , WebBackendChipPart {
    WebBackendChip getComponent();
}