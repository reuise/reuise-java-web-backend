package dev.reuise.web.backend.chip;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.icon.WebBackendIconOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.text.WebBackendLabel;
import dev.reuise.web.backend.text.WebBackendLabelOptions;
import dev.reuise.web.core.chip.WebChipPartOptions;
public interface WebBackendChipPartOptions extends WebChipPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendChipPartOptions setStartIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> startIconCreator);

    WebBackendChipPartOptions setLabelContainerCreator(ComponentCreator<? extends WebBackendLabel, ? extends WebBackendLabelOptions> labelContainerCreator);

    WebBackendChipPartOptions setEndIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> endIconCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendChip getComponent();
}