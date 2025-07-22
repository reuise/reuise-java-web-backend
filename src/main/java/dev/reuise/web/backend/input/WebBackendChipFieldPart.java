package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.chip.WebBackendChipGroup;
import dev.reuise.web.core.input.WebChipFieldPart;
public interface WebBackendChipFieldPart extends WebChipFieldPart , WebBackendTextFieldPart , WebBackendComponentPart , WebBackendChipFieldFeatures {
    WebBackendChipGroup getChipGroup();

    WebBackendTextFieldPart getTextFieldPart();
}