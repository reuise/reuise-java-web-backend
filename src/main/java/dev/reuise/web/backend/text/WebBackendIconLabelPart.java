package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.text.WebIconLabelPart;
public interface WebBackendIconLabelPart extends WebBackendIconLabelFeatures , WebBackendComponentPart , WebBackendParentComponentPart , WebIconLabelPart {
    WebBackendLink getLink();

    WebBackendIcon getStartIcon();

    WebBackendInlineText getLabelContainer();

    WebBackendIcon getEndIcon();

    WebBackendParentComponentPart getParentComponentPart();
}