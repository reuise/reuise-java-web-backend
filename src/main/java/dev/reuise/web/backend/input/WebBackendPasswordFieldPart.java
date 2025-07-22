package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.input.WebPasswordFieldPart;
public interface WebBackendPasswordFieldPart extends WebBackendPasswordFieldFeatures , WebBackendTextFieldPart , WebBackendComponentPart , WebPasswordFieldPart {
    WebBackendTextFieldPart getTextFieldPart();
}