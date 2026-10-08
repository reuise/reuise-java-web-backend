package dev.reuise.web.backend.input;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendRowLayoutPart;
import dev.reuise.web.core.input.WebSegmentedTextFieldPart;
public interface WebBackendSegmentedTextFieldPart extends WebSegmentedTextFieldPart , WebBackendRowLayoutPart , WebBackendComponentPart , WebBackendSegmentedTextFieldFeatures {
    WebBackendRowLayoutPart getRowLayoutPart();
}
