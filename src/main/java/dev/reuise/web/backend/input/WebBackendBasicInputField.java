package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.core.input.WebBasicInputField;
public interface WebBackendBasicInputField extends WebBackendBasicInputFieldPart , WebBackendBaseComponent , WebBackendComponent , WebBasicInputField {
    WebBackendBasicInputField getComponent();
}