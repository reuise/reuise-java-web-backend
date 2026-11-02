package dev.reuise.web.backend.regionselector;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenu;
import dev.reuise.web.core.regionselector.WebRegionSelector;
public interface WebBackendRegionSelector extends WebBackendRegionSelectorPart , WebBackendComponent , WebBackendSelectMenu , WebRegionSelector {
    WebBackendRegionSelector getComponent();
}
