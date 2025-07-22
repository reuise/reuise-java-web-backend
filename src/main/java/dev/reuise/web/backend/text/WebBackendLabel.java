package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.text.WebLabel;
public interface WebBackendLabel extends WebBackendInlineText , WebLabel , WebBackendComponent , WebBackendLabelPart {
    WebBackendLabel getComponent();
}