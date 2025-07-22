package dev.reuise.web.backend.button;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.icon.WebBackendIconOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.button.WebIconButtonPartOptions;
public interface WebBackendIconButtonPartOptions extends WebIconButtonPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendIconButtonPartOptions setIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> iconCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendIconButton getComponent();
}