package dev.reuise.web.backend.button;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.button.WebIconButtonPart;
// Size here??
public interface WebBackendIconButtonPart extends WebBackendComponentPart , WebBackendIconButtonFeatures , WebBackendParentComponentPart , WebIconButtonPart {
    Object getSize();

    WebBackendIconButtonPart setSize(Object size);

    WebBackendIcon getIcon();

    WebBackendParentComponentPart getParentComponentPart();
}