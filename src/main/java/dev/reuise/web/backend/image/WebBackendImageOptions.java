package dev.reuise.web.backend.image;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.image.WebImageOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendImageOptions extends WebBackendImagePartOptions , WebImageOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendBaseComponentOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();
}