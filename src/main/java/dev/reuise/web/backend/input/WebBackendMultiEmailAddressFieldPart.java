package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.input.WebMultiEmailAddressFieldPart;
public interface WebBackendMultiEmailAddressFieldPart extends WebBackendChipFieldPart , WebBackendMultiEmailAddressFieldFeatures , WebBackendComponentPart , WebMultiEmailAddressFieldPart {
    WebBackendChipFieldPart getChipFieldPart();
}