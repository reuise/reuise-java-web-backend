package dev.reuise.web.backend.currencyselector;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuPartOptions;
import dev.reuise.web.core.currencyselector.WebCurrencySelectorPartOptions;
public interface WebBackendCurrencySelectorPartOptions extends WebCurrencySelectorPartOptions {
    WebBackendSelectMenuPartOptions getSelectMenuPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendCurrencySelector getComponent();
}
