package dev.reuise.web.backend.currencyselector;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenu;
import dev.reuise.web.core.currencyselector.WebCurrencySelector;
public interface WebBackendCurrencySelector extends WebCurrencySelector , WebBackendCurrencySelectorPart , WebBackendComponent , WebBackendSelectMenu {
    WebBackendCurrencySelector getComponent();
}
