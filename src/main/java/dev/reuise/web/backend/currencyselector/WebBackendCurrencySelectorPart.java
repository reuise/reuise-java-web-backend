package dev.reuise.web.backend.currencyselector;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuPart;
import dev.reuise.web.core.currencyselector.WebCurrencySelectorPart;
public interface WebBackendCurrencySelectorPart extends WebCurrencySelectorPart , WebBackendSelectMenuPart , WebBackendComponentPart , WebBackendCurrencySelectorFeatures {
    WebBackendSelectMenuPart getSelectMenuPart();
}
