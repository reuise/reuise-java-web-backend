package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendRowLayout;
import dev.reuise.web.core.input.WebSegmentedTextField;
public interface WebBackendSegmentedTextField extends WebBackendRowLayout , WebBackendSegmentedTextFieldPart , WebBackendComponent , WebSegmentedTextField {
    WebBackendSegmentedTextField getComponent();
}
