package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.text.WebInlineTextPart;
public interface WebBackendInlineTextPart extends WebBackendTextPart , WebBackendComponentPart , WebInlineTextPart , WebBackendInlineTextFeatures {
    WebBackendTextPart getTextPart();
}