package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.text.WebLabelPart;
public interface WebBackendLabelPart extends WebBackendComponentPart , WebBackendLabelFeatures , WebLabelPart , WebBackendInlineTextPart {
    WebBackendInlineTextPart getInlineTextPart();
}