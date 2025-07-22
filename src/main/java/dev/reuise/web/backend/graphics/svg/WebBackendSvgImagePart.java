package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.graphics.svg.WebSvgImagePart;
public interface WebBackendSvgImagePart extends WebSvgImagePart , WebBackendComponentPart , WebBackendSvgImageFeatures , WebBackendSvgPart {
    WebBackendSvgPart getSvgPart();
}