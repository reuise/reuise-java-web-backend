package dev.reuise.web.backend.chip;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendFieldSet;
import dev.reuise.web.core.chip.WebChipGroup;
public interface WebBackendChipGroup extends WebBackendFieldSet , WebBackendChipGroupPart , WebBackendComponent , WebChipGroup {
    WebBackendChipGroup getComponent();
}