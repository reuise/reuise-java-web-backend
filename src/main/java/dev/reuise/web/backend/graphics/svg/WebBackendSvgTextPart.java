package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.graphics.svg.WebSvgTextPart;
public interface WebBackendSvgTextPart extends WebBackendComponentPart , WebSvgTextPart , WebBackendSvgTextFeatures , WebBackendSvgPart {
    WebBackendSvgPart getSvgPart();
}