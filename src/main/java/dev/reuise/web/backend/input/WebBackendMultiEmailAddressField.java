package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.input.WebMultiEmailAddressField;
public interface WebBackendMultiEmailAddressField extends WebMultiEmailAddressField , WebBackendMultiEmailAddressFieldPart , WebBackendComponent , WebBackendChipField {
    WebBackendMultiEmailAddressField getComponent();
}