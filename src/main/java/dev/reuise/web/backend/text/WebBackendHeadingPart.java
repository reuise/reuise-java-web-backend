package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.text.WebHeadingPart;
public interface WebBackendHeadingPart extends WebBackendTextPart , WebBackendComponentPart , WebHeadingPart , WebBackendHeadingFeatures {
    WebBackendTextPart getTextPart();
}