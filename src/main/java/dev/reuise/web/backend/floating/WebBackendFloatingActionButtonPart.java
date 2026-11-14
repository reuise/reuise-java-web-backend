package dev.reuise.web.backend.floating;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendButtonPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.floating.WebFloatingActionButtonPart;
public interface WebBackendFloatingActionButtonPart extends WebBackendButtonPart , WebBackendComponentPart , WebBackendFloatingActionButtonFeatures , WebFloatingActionButtonPart {
    WebBackendInlineText getBadge();

    WebBackendButtonPart getButtonPart();
}
