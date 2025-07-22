package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.text.WebParagraphPart;
public interface WebBackendParagraphPart extends WebParagraphPart , WebBackendParagraphFeatures , WebBackendComponentPart , WebBackendParentComponentPart {
    WebBackendParentComponentPart getParentComponentPart();
}