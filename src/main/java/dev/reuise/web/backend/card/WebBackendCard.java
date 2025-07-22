package dev.reuise.web.backend.card;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendSurface;
import dev.reuise.web.core.card.WebCard;
public interface WebBackendCard extends WebCard , WebBackendCardPart , WebBackendComponent , WebBackendSurface {
    WebBackendCard getComponent();
}