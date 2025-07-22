package dev.reuise.web.backend.config;
import dev.reuise.web.backend.document.DocumentModelSerializer;
public class ReuiseWebBackendConfig {
    private static ReuiseWebBackendConfig INSTANCE = new ReuiseWebBackendConfig();

    protected DocumentModelSerializer documentModelSerializer;

    public ReuiseWebBackendConfig() {
    }

    public static ReuiseWebBackendConfig getInstance() {
        return ReuiseWebBackendConfig.INSTANCE;
    }

    public DocumentModelSerializer getDocumentModelSerializer() {
        return documentModelSerializer;
    }

    public ReuiseWebBackendConfig setDocumentModelSerializer(DocumentModelSerializer documentModelSerializer) {
        this.documentModelSerializer = documentModelSerializer;
        return this;
    }
}