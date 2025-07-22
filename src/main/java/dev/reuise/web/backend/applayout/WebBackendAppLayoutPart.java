package dev.reuise.web.backend.applayout;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainer;
import dev.reuise.web.core.applayout.WebAppLayoutPart;
public interface WebBackendAppLayoutPart extends WebBackendAppLayoutFeatures , WebBackendComponentPart , WebAppLayoutPart , WebBackendParentComponentPart {
    WebBackendContainer getDrawerScrim();

    WebBackendSplitContainer getDrawerSplit();

    WebBackendSplitContainer getTopAppBarSplit();

    WebBackendAppLayoutBody getBody();

    WebBackendParentComponentPart getParentComponentPart();
}