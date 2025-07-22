package dev.reuise.web.backend.list;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.list.WebListItemPart;
public interface WebBackendListItemPart extends WebListItemPart , WebBackendListItemFeatures , WebBackendBasicListItemPart , WebBackendComponentPart {
    WebBackendCheckbox getCheckbox();

    WebBackendIcon getStartIcon();

    WebBackendContainer getTextContainer();

    WebBackendInlineText getLabelContainer();

    WebBackendInlineText getSecondaryLabelContainer();

    WebBackendIcon getEndIcon();

    WebBackendBasicListItemPart getBasicListItemPart();
}