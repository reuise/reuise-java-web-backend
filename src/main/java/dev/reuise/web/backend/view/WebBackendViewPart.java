package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.core.view.WebViewPart;
public interface WebBackendViewPart extends WebBackendComponentPart , WebBackendViewFeatures , WebBackendFlexContainerPart , WebViewPart {
    WebBackendFlexContainerPart getFlexContainerPart();
}