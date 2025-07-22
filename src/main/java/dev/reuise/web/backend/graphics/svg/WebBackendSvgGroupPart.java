package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.graphics.svg.WebSvgGroupPart;
public interface WebBackendSvgGroupPart extends WebBackendComponentPart , WebBackendSvgGroupFeatures , WebBackendSvgPart , WebSvgGroupPart {
    WebBackendSvgPart getSvgPart();
}