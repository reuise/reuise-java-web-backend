package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.view.WebSheetView;
public interface WebBackendSheetView extends WebSheetView , WebBackendView , WebBackendComponent , WebBackendSheetViewPart {
    WebBackendSheetView getComponent();
}