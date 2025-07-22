package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.input.WebTextField;
public interface WebBackendTextField extends WebBackendParentComponent , WebBackendTextFieldPart , WebTextField , WebBackendComponent {
    WebBackendTextField getComponent();
}