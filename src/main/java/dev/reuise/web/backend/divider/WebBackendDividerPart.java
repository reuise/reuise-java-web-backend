package dev.reuise.web.backend.divider;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.divider.WebDividerPart;
public interface WebBackendDividerPart extends WebDividerPart , WebBackendComponentPart , WebBackendDividerFeatures , WebBackendParentComponentPart {
    WebBackendContainer getStartLine();

    WebBackendInlineText getLabelContainer();

    WebBackendContainer getEndLine();

    WebBackendParentComponentPart getParentComponentPart();
}