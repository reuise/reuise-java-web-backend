package dev.reuise.web.backend.bottomappbar;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.core.bottomappbar.WebBottomAppBarPart;
public interface WebBackendBottomAppBarPart extends WebBackendComponentPart , WebBackendBaseComponentPart , WebBackendBottomAppBarFeatures , WebBottomAppBarPart {
    WebBackendBaseComponentPart getBaseComponentPart();
}