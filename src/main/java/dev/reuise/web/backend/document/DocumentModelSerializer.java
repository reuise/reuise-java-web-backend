package dev.reuise.web.backend.document;
import java.util.Map;
public interface DocumentModelSerializer {
    String serialize(Map<String, Object> model);
}