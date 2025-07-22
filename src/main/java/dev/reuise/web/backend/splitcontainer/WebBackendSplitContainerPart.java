package dev.reuise.web.backend.splitcontainer;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPart;
public interface WebBackendSplitContainerPart extends WebBackendComponentPart , WebBackendContainerPart , WebBackendSplitContainerFeatures , WebSplitContainerPart {
    WebBackendContainer getContainer();

    WebBackendSplitContainerPanel getStartPanel();

    WebBackendSplitContainerDivider getDivider();

    WebBackendSplitContainerPanel getEndPanel();

    WebBackendContainerPart getContainerPart();
}