package dev.reuise.web.backend.currencyselector;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuOptions;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuPartOptions;
import dev.reuise.web.core.currencyselector.WebCurrencySelectorOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendCurrencySelectorOptions extends WebBackendCurrencySelectorPartOptions , WebBackendBaseComponentPartOptions , WebBackendSelectMenuOptions , WebCurrencySelectorOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendSelectMenuPartOptions {
    WebBackendSelectMenuPartOptions getSelectMenuPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
