package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.graphics.svg.WebSvgText;
public interface WebBackendSvgText extends WebBackendComponent , WebBackendSvg , WebSvgText , WebBackendSvgTextPart {
    WebBackendSvgText getComponent();
}