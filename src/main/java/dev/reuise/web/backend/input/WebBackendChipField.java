package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.input.WebChipField;
public interface WebBackendChipField extends WebBackendChipFieldPart , WebBackendComponent , WebBackendTextField , WebChipField {
    WebBackendChipField getComponent();
}