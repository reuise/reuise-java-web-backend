package dev.reuise.web.backend.document;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.WebBackendRootComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.document.WebDocument;
public interface WebBackendDocument extends WebBackendDocumentPart , WebBackendParentComponent , WebDocument , WebBackendComponent , WebBackendRootComponent {
    WebBackendDocument getComponent();
}