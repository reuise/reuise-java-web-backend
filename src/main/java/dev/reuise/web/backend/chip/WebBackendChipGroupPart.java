package dev.reuise.web.backend.chip;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendFieldSetPart;
import dev.reuise.web.core.chip.WebChipGroupPart;
public interface WebBackendChipGroupPart extends WebBackendFieldSetPart , WebBackendChipGroupFeatures , WebBackendComponentPart , WebChipGroupPart {
    WebBackendChip getAddButton();

    WebBackendFieldSetPart getFieldSetPart();
}