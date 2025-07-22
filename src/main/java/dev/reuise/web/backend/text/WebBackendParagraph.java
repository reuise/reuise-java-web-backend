package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.text.WebParagraph;
public interface WebBackendParagraph extends WebBackendParentComponent , WebParagraph , WebBackendComponent , WebBackendParagraphPart {
    WebBackendParagraph getComponent();
}