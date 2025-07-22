package dev.reuise.web.backend.input;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.input.WebMultiEmailAddressFieldPartOptions;
public interface WebBackendMultiEmailAddressFieldPartOptions extends WebMultiEmailAddressFieldPartOptions {
    WebBackendChipFieldPartOptions getChipFieldPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendMultiEmailAddressField getComponent();
}