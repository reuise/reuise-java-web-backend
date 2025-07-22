package dev.reuise.web.backend.scrollablecontainer;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollAreaPart;
public interface WebBackendScrollableContainerScrollAreaPart extends WebBackendComponentPart , WebBackendScrollableContainerScrollAreaFeatures , WebBackendParentComponentPart , WebScrollableContainerScrollAreaPart {
    WebBackendContainer getScrollAreaTopFade();

    WebBackendContainer getScrollAreaLeftFade();

    WebBackendContainer getScrollAreaContent();

    WebBackendContainer getScrollAreaBottomFade();

    WebBackendContainer getScrollAreaRightFade();

    WebBackendParentComponentPart getParentComponentPart();
}