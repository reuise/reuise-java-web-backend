package dev.reuise.web.backend.document;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.document.DocumentIcon;
import dev.reuise.web.core.document.ExternalResource;
import dev.reuise.web.core.document.ExternalScript;
import dev.reuise.web.core.document.ExternalStyleSheet;
import dev.reuise.web.core.document.ImportMap;
import dev.reuise.web.core.document.Metadata;
import dev.reuise.web.core.document.StructuredData;
import dev.reuise.web.core.document.WebDocumentPartOptions;
import java.util.List;
public interface WebBackendDocumentPartOptions extends WebDocumentPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    String getFrontendScript();

    ComponentOption<String> getFrontendScriptOption();

    WebBackendDocumentPartOptions setFrontendScript(String frontendScript);

    String getViewport();

    ComponentOption<String> getViewportOption();

    WebBackendDocumentPartOptions setViewport(String viewport);

    String getCanonicalUrl();

    ComponentOption<String> getCanonicalUrlOption();

    WebBackendDocumentPartOptions setCanonicalUrl(String canonicalUrl);

    List<ExternalStyleSheet> getExternalStyleSheet();

    ComponentOption<List<ExternalStyleSheet>> getExternalStyleSheetOption();

    WebBackendDocumentPartOptions setExternalStyleSheet(List<ExternalStyleSheet> externalStyleSheet);

    WebBackendDocumentPartOptions addExternalStyleSheet(ExternalStyleSheet externalStyleSheet);

    WebBackendDocumentPartOptions setExternalStyleSheet(ExternalStyleSheet externalStyleSheet);

    WebBackendDocumentPartOptions removeExternalStyleSheet(ExternalStyleSheet externalStyleSheet);

    List<ExternalScript> getExternalScript();

    ComponentOption<List<ExternalScript>> getExternalScriptOption();

    WebBackendDocumentPartOptions setExternalScript(List<ExternalScript> externalScript);

    WebBackendDocumentPartOptions addExternalScript(ExternalScript externalScript);

    WebBackendDocumentPartOptions setExternalScript(ExternalScript externalScript);

    WebBackendDocumentPartOptions removeExternalScript(ExternalScript externalScript);

    List<ExternalResource> getPreconnect();

    ComponentOption<List<ExternalResource>> getPreconnectOption();

    WebBackendDocumentPartOptions setPreconnect(List<ExternalResource> preconnect);

    WebBackendDocumentPartOptions addPreconnect(ExternalResource preconnect);

    WebBackendDocumentPartOptions removePreconnect(ExternalResource preconnect);

    List<ExternalResource> getDnsPrefetch();

    ComponentOption<List<ExternalResource>> getDnsPrefetchOption();

    WebBackendDocumentPartOptions setDnsPrefetch(List<ExternalResource> dnsPrefetch);

    WebBackendDocumentPartOptions addDnsPrefetch(ExternalResource dnsPrefetch);

    WebBackendDocumentPartOptions removeDnsPrefetch(ExternalResource dnsPrefetch);

    List<Metadata> getMetadata();

    ComponentOption<List<Metadata>> getMetadataOption();

    WebBackendDocumentPartOptions setMetadata(List<Metadata> metadata);

    WebBackendDocumentPartOptions addMetadata(Metadata metadata);

    WebBackendDocumentPartOptions removeMetadata(Metadata metadata);

    boolean hasMetadata(Metadata metadata);

    List<ImportMap> getImportMap();

    ComponentOption<List<ImportMap>> getImportMapOption();

    WebBackendDocumentPartOptions setImportMap(List<ImportMap> importMap);

    WebBackendDocumentPartOptions addImportMap(ImportMap importMap);

    WebBackendDocumentPartOptions setImportMap(ImportMap importMap);

    WebBackendDocumentPartOptions removeImportMap(ImportMap importMap);

    List<String> getScript();

    ComponentOption<List<String>> getScriptOption();

    WebBackendDocumentPartOptions setScript(List<String> script);

    WebBackendDocumentPartOptions addScript(String script);

    WebBackendDocumentPartOptions setScript(String script);

    WebBackendDocumentPartOptions removeScript(String script);

    String getManifest();

    ComponentOption<String> getManifestOption();

    WebBackendDocumentPartOptions setManifest(String manifest);

    List<DocumentIcon> getIcon();

    ComponentOption<List<DocumentIcon>> getIconOption();

    WebBackendDocumentPartOptions setIcon(List<DocumentIcon> icon);

    WebBackendDocumentPartOptions addIcon(DocumentIcon icon);

    WebBackendDocumentPartOptions setIcon(DocumentIcon icon);

    WebBackendDocumentPartOptions removeIcon(DocumentIcon icon);

    StructuredData getStructuredData();

    ComponentOption<StructuredData> getStructuredDataOption();

    WebBackendDocumentPartOptions setStructuredData(StructuredData structuredData);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendDocumentPartOptions addPreconnect(String url);

    WebBackendDocumentPartOptions addPreconnect(String url, boolean crossOrigin);

    WebBackendDocumentPartOptions addDnsPrefetch(String url);

    WebBackendDocumentPartOptions addMetadata(String name, String value);

    WebBackendDocumentPartOptions setBodyCreator(ComponentCreator<? extends WebBackendDocumentBody, ? extends WebBackendDocumentBodyOptions> bodyCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendDocument getComponent();
}