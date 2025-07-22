package dev.reuise.web.backend.image;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.core.image.WebImage;
public interface WebBackendImage extends WebImage , WebBackendBaseComponent , WebBackendComponent , WebBackendImagePart {
    WebBackendImage getComponent();
}