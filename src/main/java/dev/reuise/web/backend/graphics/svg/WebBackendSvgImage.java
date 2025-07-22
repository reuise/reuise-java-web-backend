package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.graphics.svg.WebSvgImage;
public interface WebBackendSvgImage extends WebSvgImage , WebBackendSvgImagePart , WebBackendComponent , WebBackendSvg {
    WebBackendSvgImage getComponent();
}