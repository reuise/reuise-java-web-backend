package dev.reuise.web.backend.splitcontainer;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.splitcontainer.WebSplitContainerDividerPart;
public interface WebBackendSplitContainerDividerPart extends WebBackendSplitContainerDividerFeatures , WebBackendComponentPart , WebBackendContainerPart , WebSplitContainerDividerPart {
    WebBackendContainerPart getContainerPart();
}