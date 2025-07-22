package dev.reuise.web.backend.document;
import dev.reuise.web.core.document.DocumentIcon;
import dev.reuise.web.core.document.ExternalResource;
import dev.reuise.web.core.document.ExternalScript;
import dev.reuise.web.core.document.ExternalStyleSheet;
import dev.reuise.web.core.document.ImportMap;
import dev.reuise.web.core.document.Metadata;
import dev.reuise.web.core.document.StructuredData;
import dev.reuise.web.core.document.WebDocumentFeatures;
import java.util.List;
public interface WebBackendDocumentFeatures extends WebDocumentFeatures {
    String getFrontendScript();

    WebBackendDocumentFeatures setFrontendScript(String frontendScript);

    String getViewport();

    WebBackendDocumentFeatures setViewport(String viewport);

    String getCanonicalUrl();

    WebBackendDocumentFeatures setCanonicalUrl(String canonicalUrl);

    List<ExternalStyleSheet> getExternalStyleSheet();

    WebBackendDocumentFeatures setExternalStyleSheet(List<ExternalStyleSheet> externalStyleSheet);

    WebBackendDocumentFeatures addExternalStyleSheet(ExternalStyleSheet externalStyleSheet);

    WebBackendDocumentFeatures setExternalStyleSheet(ExternalStyleSheet externalStyleSheet);

    WebBackendDocumentFeatures removeExternalStyleSheet(ExternalStyleSheet externalStyleSheet);

    List<ExternalScript> getExternalScript();

    WebBackendDocumentFeatures setExternalScript(List<ExternalScript> externalScript);

    WebBackendDocumentFeatures addExternalScript(ExternalScript externalScript);

    WebBackendDocumentFeatures setExternalScript(ExternalScript externalScript);

    WebBackendDocumentFeatures removeExternalScript(ExternalScript externalScript);

    List<ExternalResource> getPreconnect();

    WebBackendDocumentFeatures setPreconnect(List<ExternalResource> preconnect);

    WebBackendDocumentFeatures addPreconnect(ExternalResource preconnect);

    WebBackendDocumentFeatures removePreconnect(ExternalResource preconnect);

    List<ExternalResource> getDnsPrefetch();

    WebBackendDocumentFeatures setDnsPrefetch(List<ExternalResource> dnsPrefetch);

    WebBackendDocumentFeatures addDnsPrefetch(ExternalResource dnsPrefetch);

    WebBackendDocumentFeatures removeDnsPrefetch(ExternalResource dnsPrefetch);

    List<Metadata> getMetadata();

    WebBackendDocumentFeatures setMetadata(List<Metadata> metadata);

    WebBackendDocumentFeatures addMetadata(Metadata metadata);

    WebBackendDocumentFeatures removeMetadata(Metadata metadata);

    boolean hasMetadata(Metadata metadata);

    List<ImportMap> getImportMap();

    WebBackendDocumentFeatures setImportMap(List<ImportMap> importMap);

    WebBackendDocumentFeatures addImportMap(ImportMap importMap);

    WebBackendDocumentFeatures setImportMap(ImportMap importMap);

    WebBackendDocumentFeatures removeImportMap(ImportMap importMap);

    List<String> getScript();

    WebBackendDocumentFeatures setScript(List<String> script);

    WebBackendDocumentFeatures addScript(String script);

    WebBackendDocumentFeatures setScript(String script);

    WebBackendDocumentFeatures removeScript(String script);

    String getManifest();

    WebBackendDocumentFeatures setManifest(String manifest);

    List<DocumentIcon> getIcon();

    WebBackendDocumentFeatures setIcon(List<DocumentIcon> icon);

    WebBackendDocumentFeatures addIcon(DocumentIcon icon);

    WebBackendDocumentFeatures setIcon(DocumentIcon icon);

    WebBackendDocumentFeatures removeIcon(DocumentIcon icon);

    StructuredData getStructuredData();

    WebBackendDocumentFeatures setStructuredData(StructuredData structuredData);

    WebBackendDocumentFeatures addPreconnect(String url);

    WebBackendDocumentFeatures addPreconnect(String url, boolean crossOrigin);

    WebBackendDocumentFeatures addDnsPrefetch(String url);

    WebBackendDocumentFeatures addMetadata(String name, String value);
}