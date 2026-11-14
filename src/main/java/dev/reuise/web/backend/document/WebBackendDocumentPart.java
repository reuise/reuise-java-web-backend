package dev.reuise.web.backend.document;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.document.WebDocumentPart;
import java.util.Map;
public interface WebBackendDocumentPart extends WebBackendDocumentFeatures , WebDocumentPart , WebBackendComponentPart , WebBackendParentComponentPart {
    String serializeModel(Map<String, Object> model);

    WebBackendDocumentPart addAlternateLanguageLink(String languageTag, String url);

    WebBackendDocumentBody getBody();

    WebBackendParentComponentPart getParentComponentPart();
}
