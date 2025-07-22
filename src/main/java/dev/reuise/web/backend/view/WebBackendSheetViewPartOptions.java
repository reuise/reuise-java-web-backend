package dev.reuise.web.backend.view;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.view.WebSheetViewPartOptions;
public interface WebBackendSheetViewPartOptions extends WebSheetViewPartOptions {
    WebBackendViewPartOptions getViewPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSheetView getComponent();
}