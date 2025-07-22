package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.text.WebTextBlock;
public interface WebBackendTextBlock extends WebBackendTextBlockPart , WebTextBlock , WebBackendText , WebBackendComponent {
    WebBackendTextBlock getComponent();
}