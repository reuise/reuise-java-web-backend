package dev.reuise.web.backend.layout;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainer;
import dev.reuise.web.core.layout.WebSheetLayout;
public interface WebBackendSheetLayout extends WebBackendSplitContainer , WebBackendSheetLayoutPart , WebBackendComponent , WebSheetLayout {
    WebBackendSheetLayout getComponent();

    WebBackendSheetLayout setAnimation(ComponentAnimation animation);

    WebBackendSheetLayout startAnimation();

    WebBackendSheetLayout cancelAnimation();
}
