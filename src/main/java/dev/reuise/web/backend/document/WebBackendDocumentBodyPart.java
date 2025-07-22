package dev.reuise.web.backend.document;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.document.WebDocumentBodyPart;
public interface WebBackendDocumentBodyPart extends WebBackendDocumentBodyFeatures , WebBackendComponentPart , WebDocumentBodyPart , WebBackendParentComponentPart {
    WebBackendParentComponentPart getParentComponentPart();
}