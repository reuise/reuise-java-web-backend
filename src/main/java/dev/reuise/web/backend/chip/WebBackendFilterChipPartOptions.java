package dev.reuise.web.backend.chip;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.chip.WebFilterChipPartOptions;
public interface WebBackendFilterChipPartOptions extends WebFilterChipPartOptions {
    WebBackendChipPartOptions getChipPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendFilterChip getComponent();
}