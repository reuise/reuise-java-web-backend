package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.core.text.WebLineBreak;
public interface WebBackendLineBreak extends WebBackendLineBreakPart , WebLineBreak , WebBackendBaseComponent , WebBackendComponent {
    WebBackendLineBreak getComponent();
}
