package dev.reuise.web.backend.splitcontainer;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPanelPart;
public interface WebBackendSplitContainerPanelPart extends WebBackendComponentPart , WebBackendContainerPart , WebSplitContainerPanelPart , WebBackendSplitContainerPanelFeatures {
    WebBackendContainerPart getContainerPart();
}