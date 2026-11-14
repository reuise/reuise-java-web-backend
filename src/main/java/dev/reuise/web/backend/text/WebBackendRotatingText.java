package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.core.text.WebRotatingText;
public interface WebBackendRotatingText extends WebBackendRotatingTextPart , WebBackendBaseComponent , WebBackendComponent , WebRotatingText {
    WebBackendRotatingText getComponent();
}
