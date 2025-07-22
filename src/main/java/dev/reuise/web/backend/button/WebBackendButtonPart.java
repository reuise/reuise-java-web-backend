package dev.reuise.web.backend.button;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.button.WebButtonPart;
public interface WebBackendButtonPart extends WebButtonPart , WebBackendButtonFeatures , WebBackendComponentPart , WebBackendParentComponentPart {
    WebBackendIcon getStartIcon();

    WebBackendInlineText getLabelContainer();

    WebBackendIcon getEndIcon();

    WebBackendParentComponentPart getParentComponentPart();
}