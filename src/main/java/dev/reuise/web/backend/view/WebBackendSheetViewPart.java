package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.view.WebSheetViewPart;
public interface WebBackendSheetViewPart extends WebSheetViewPart , WebBackendComponentPart , WebBackendSheetViewFeatures , WebBackendViewPart {
    WebBackendViewPart getViewPart();
}