package dev.reuise.web.backend.layout;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerPartOptions;
import dev.reuise.web.core.layout.WebSheetLayoutPartOptions;
public interface WebBackendSheetLayoutPartOptions extends WebSheetLayoutPartOptions {
    WebBackendSplitContainerPartOptions getSplitContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSheetLayout getComponent();
}