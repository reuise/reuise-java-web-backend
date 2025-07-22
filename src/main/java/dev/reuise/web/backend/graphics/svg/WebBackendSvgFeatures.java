package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.ClassResource;
import dev.reuise.web.core.graphics.svg.WebSvgFeatures;
public interface WebBackendSvgFeatures extends WebSvgFeatures {
    ClassResource getSourceResource();

    WebBackendSvgFeatures setSourceResource(ClassResource sourceResource);
}