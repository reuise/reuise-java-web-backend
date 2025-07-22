package dev.reuise.web.backend.progressindicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.progressindicator.WebProgressIndicatorPart;
public interface WebBackendProgressIndicatorPart extends WebProgressIndicatorPart , WebBackendProgressIndicatorFeatures , WebBackendComponentPart , WebBackendParentComponentPart {
    WebBackendContainer getTrack();

    WebBackendParentComponentPart getParentComponentPart();
}