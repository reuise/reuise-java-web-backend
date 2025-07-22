package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.graphics.svg.WebSvgRect;
public interface WebBackendSvgRect extends WebBackendSvgShape , WebBackendComponent , WebSvgRect , WebBackendSvgRectPart {
    WebBackendSvgRect getComponent();
}