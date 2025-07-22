package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.text.WebTextBlockPart;
public interface WebBackendTextBlockPart extends WebBackendTextPart , WebBackendComponentPart , WebTextBlockPart , WebBackendTextBlockFeatures {
    WebBackendTextPart getTextPart();
}