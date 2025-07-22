package dev.reuise.web.backend.input;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.chip.WebBackendChipGroup;
import dev.reuise.web.backend.chip.WebBackendChipGroupOptions;
import dev.reuise.web.core.input.WebChipFieldPartOptions;
public interface WebBackendChipFieldPartOptions extends WebChipFieldPartOptions {
    WebBackendTextFieldPartOptions getTextFieldPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendChipFieldPartOptions setChipGroupCreator(ComponentCreator<? extends WebBackendChipGroup, ? extends WebBackendChipGroupOptions> chipGroupCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendChipField getComponent();
}