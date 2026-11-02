package dev.reuise.web.backend.regionselector;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuPartOptions;
import dev.reuise.web.core.regionselector.WebRegionSelectorPartOptions;
public interface WebBackendRegionSelectorPartOptions extends WebRegionSelectorPartOptions {
    WebBackendSelectMenuPartOptions getSelectMenuPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendRegionSelector getComponent();
}
