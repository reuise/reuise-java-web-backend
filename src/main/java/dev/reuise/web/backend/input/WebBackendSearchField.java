package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.input.WebSearchField;
public interface WebBackendSearchField extends WebBackendSearchFieldPart , WebSearchField , WebBackendComponent , WebBackendTextField {
    WebBackendSearchField getComponent();
}