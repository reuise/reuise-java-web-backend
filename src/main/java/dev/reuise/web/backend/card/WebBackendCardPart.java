package dev.reuise.web.backend.card;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.image.WebBackendImage;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendSurfacePart;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.text.WebBackendTextBlock;
import dev.reuise.web.core.card.WebCardPart;
public interface WebBackendCardPart extends WebCardPart , WebBackendComponentPart , WebBackendCardFeatures , WebBackendSurfacePart {
    WebBackendLink getMediaLink();

    WebBackendFlexContainer getMediaContainer();

    WebBackendImage getImage();

    WebBackendFlexContainer getTextContent();

    WebBackendFlexContainer getHeadline();

    WebBackendLink getHeadingLink();

    WebBackendTextBlock getHeadingContainer();

    WebBackendTextBlock getSubHeadingContainer();

    WebBackendTextBlock getTextContainer();

    WebBackendFlexContainer getActionsContainer();

    WebBackendSurfacePart getSurfacePart();
}