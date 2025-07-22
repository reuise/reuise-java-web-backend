package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.core.input.WebBasicInputFieldPart;
public interface WebBackendBasicInputFieldPart extends WebBackendBasicInputFieldFeatures , WebBackendComponentPart , WebBackendBaseComponentPart , WebBasicInputFieldPart {
    WebBackendBaseComponentPart getBaseComponentPart();
}