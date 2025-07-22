package dev.reuise.web.backend.image;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.core.image.WebImagePart;
public interface WebBackendImagePart extends WebBackendImageFeatures , WebBackendComponentPart , WebBackendBaseComponentPart , WebImagePart {
    WebBackendLink getLink();

    WebBackendBaseComponentPart getBaseComponentPart();
}