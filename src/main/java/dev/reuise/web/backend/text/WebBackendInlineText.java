package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.text.WebInlineText;
public interface WebBackendInlineText extends WebInlineText , WebBackendText , WebBackendComponent , WebBackendInlineTextPart {
    WebBackendInlineText getComponent();
}