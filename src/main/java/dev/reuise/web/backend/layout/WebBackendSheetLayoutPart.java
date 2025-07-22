package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerPart;
import dev.reuise.web.core.layout.WebSheetLayoutPart;
public interface WebBackendSheetLayoutPart extends WebBackendSplitContainerPart , WebBackendComponentPart , WebSheetLayoutPart , WebBackendSheetLayoutFeatures {
    WebBackendSplitContainerPart getSplitContainerPart();
}