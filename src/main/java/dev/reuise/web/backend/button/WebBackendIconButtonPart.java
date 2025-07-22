package dev.reuise.web.backend.button;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.button.WebIconButtonPart;
public interface WebBackendIconButtonPart extends WebBackendComponentPart , WebBackendIconButtonFeatures , WebBackendParentComponentPart , WebIconButtonPart {
    WebBackendIcon getIcon();

    WebBackendParentComponentPart getParentComponentPart();
}