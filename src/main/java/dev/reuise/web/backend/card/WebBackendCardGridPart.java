package dev.reuise.web.backend.card;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.card.WebCardGridPart;
public interface WebBackendCardGridPart extends WebBackendComponentPart , WebBackendContainerPart , WebCardGridPart , WebBackendCardGridFeatures {
    WebBackendContainer getScrim();

    WebBackendContainer getCardContainer();

    WebBackendContainerPart getContainerPart();
}