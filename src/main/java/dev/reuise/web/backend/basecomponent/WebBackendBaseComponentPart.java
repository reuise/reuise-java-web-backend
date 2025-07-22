package dev.reuise.web.backend.basecomponent;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import java.io.PrintWriter;
public interface WebBackendBaseComponentPart extends WebBackendComponentPart , WebBackendBaseComponentFeatures , WebBaseComponentPart {
    void writeTo(PrintWriter writer);

    void writeStartTag(PrintWriter writer);

    void writeStartTag(PrintWriter writer, String tagName, boolean close);

    void writeStartTag(PrintWriter writer, boolean close);

    void writeEndTag(PrintWriter writer);

    void writeEndTag(PrintWriter writer, String tagName);

    WebBackendComponentFactory getComponentFactory();
}