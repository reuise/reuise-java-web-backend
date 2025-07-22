package dev.reuise.web.backend.icon;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.graphics.svg.WebBackendSvg;
import dev.reuise.web.backend.image.WebBackendImage;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.icon.WebIconPart;
public interface WebBackendIconPart extends WebIconPart , WebBackendComponentPart , WebBackendParentComponentPart , WebBackendIconFeatures {
    WebBackendSvg getSvg();

    WebBackendLink getLink();

    WebBackendImage getImage();

    WebBackendParentComponentPart getParentComponentPart();
}