package dev.reuise.web.backend.card;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.card.WebCardGrid;
public interface WebBackendCardGrid extends WebCardGrid , WebBackendComponent , WebBackendCardGridPart , WebBackendContainer {
    WebBackendCardGrid getComponent();
}