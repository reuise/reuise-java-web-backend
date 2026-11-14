package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendButtonPart;
import dev.reuise.web.core.menu.WebMenuButtonItemPart;
public interface WebBackendMenuButtonItemPart extends WebBackendButtonPart , WebBackendComponentPart , WebBackendMenuButtonItemFeatures , WebMenuButtonItemPart {
    WebBackendButtonPart getButtonPart();
}
