package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.input.WebSearchFieldPart;
public interface WebBackendSearchFieldPart extends WebSearchFieldPart , WebBackendSearchFieldFeatures , WebBackendTextFieldPart , WebBackendComponentPart {
    WebBackendTextFieldPart getTextFieldPart();
}