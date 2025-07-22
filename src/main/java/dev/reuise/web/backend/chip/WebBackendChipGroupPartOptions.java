package dev.reuise.web.backend.chip;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendFieldSetPartOptions;
import dev.reuise.web.core.chip.WebChipGroupPartOptions;
public interface WebBackendChipGroupPartOptions extends WebChipGroupPartOptions {
    WebBackendFieldSetPartOptions getFieldSetPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendChipGroupPartOptions setAddButtonCreator(ComponentCreator<? extends WebBackendChip, ? extends WebBackendChipOptions> addButtonCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendChipGroup getComponent();
}