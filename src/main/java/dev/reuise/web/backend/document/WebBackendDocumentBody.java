package dev.reuise.web.backend.document;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.document.WebDocumentBody;
public interface WebBackendDocumentBody extends WebDocumentBody , WebBackendParentComponent , WebBackendDocumentBodyPart , WebBackendComponent {
    WebBackendDocumentBody getComponent();
}