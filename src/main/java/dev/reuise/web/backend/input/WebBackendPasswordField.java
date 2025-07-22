package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.input.WebPasswordField;
public interface WebBackendPasswordField extends WebPasswordField , WebBackendPasswordFieldPart , WebBackendComponent , WebBackendTextField {
    WebBackendPasswordField getComponent();
}