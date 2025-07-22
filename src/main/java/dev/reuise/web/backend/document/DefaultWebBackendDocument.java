package dev.reuise.web.backend.document;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponentOptions;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.config.ReuiseWebBackendConfig;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.style.WebBackendStyleSheet;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.document.DefaultWebDocumentPart;
import dev.reuise.web.core.document.DocumentIcon;
import dev.reuise.web.core.document.ExternalResource;
import dev.reuise.web.core.document.ExternalScript;
import dev.reuise.web.core.document.ExternalStyleSheet;
import dev.reuise.web.core.document.ImportMap;
import dev.reuise.web.core.document.Metadata;
import dev.reuise.web.core.document.StructuredData;
import dev.reuise.web.core.document.StructuredDataType;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheet;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
// Option: Children - CORE
// Option: Id - WEB
// Option: TagName - WEB
// Option: XmlNamespace - WEB
// Option: Tooltip - WEB
// Option: BaseStyleClass - WEB
// Option: Attributes - WEB
// Option: StyleClasses - WEB
// Option: Data - WEB
// Option: Style - WEB
// Option: InlineStyle - WEB
// Option: Rehydration - WEB
// Option: ContentEditable - WEB
// Option: StoreInElementOptions - WEB
// Option: Mounted - CORE
// Option: Margin - CORE
// Option: MarginTop - CORE
// Option: MarginRight - CORE
// Option: MarginBottom - CORE
// Option: MarginLeft - CORE
// Option: Width - CORE
// Option: MinWidth - CORE
// Option: MaxWidth - CORE
// Option: Height - CORE
// Option: MinHeight - CORE
// Option: MaxHeight - CORE
// Option: RequiredLayoutComponent - CORE
// Option: Parent - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: parentComponent
// base comp: baseComponent
// add composition for baseComponent: writeTo
// add composition for baseComponent: writeStartTag
// add composition for baseComponent: writeStartTag
// add composition for baseComponent: writeStartTag
// add composition for baseComponent: writeEndTag
// add composition for baseComponent: writeEndTag
// add composition for baseComponent: isRehydrated
// add composition for baseComponent: getComputedStyle
// add composition for baseComponent: addOrRemoveStyleClass
// add composition for baseComponent: hasStyleClass
// add composition for baseComponent: removeStyleClass
// add composition for baseComponent: setAttribute
// add composition for baseComponent: removeAttribute
// add composition for baseComponent: getAttribute
// add composition for baseComponent: hasAttribute
// add composition for baseComponent: setData
// add composition for baseComponent: getData
// add composition for baseComponent: hasData
// add composition for baseComponent: setAria
// add composition for baseComponent: getAria
// add composition for baseComponent: hasAria
// add composition for baseComponent: getUniqueId
// add composition for baseComponent: getUniqueStyleClass
// add composition for baseComponent: getStyleSheetId
// add composition for baseComponent: getStyleStates
// add composition for baseComponent: setStyleSheetFactory
// add composition for baseComponent: getStyle
// add composition for baseComponent: hasWrapper
// add composition for baseComponent: isInitialized
// add composition for baseComponent: log
// add composition for baseComponent: removeFromParent
public abstract class DefaultWebBackendDocument<S extends DefaultWebBackendDocument<S, O>, O extends WebBackendDocumentOptions> extends DefaultWebDocumentPart<S, O> implements WebBackendComponentType<S, O> , WebBackendDocument {
    @Override
    public S addMetadata(String name, String value) {
        return addMetadata(new Metadata(name, value));
    }

    @Override
    public S addPreconnect(String url) {
        return addPreconnect(url, false);
    }

    @Override
    public S addPreconnect(String url, boolean crossOrigin) {
        return addPreconnect(new ExternalResource(url, crossOrigin));
    }

    @Override
    public S addDnsPrefetch(String url) {
        return addDnsPrefetch(new ExternalResource(url));
    }

    private String getStructuredDataTypes(List<StructuredDataType> types) {
        return types.stream().map(this::getStructuredDataType).collect(Collectors.joining(","));
    }

    private String getStructuredDataType(StructuredDataType type) {
        return ((((("{\"@context\":\"" + type.getContext()) + "\",\"@type\":\"") + type.getType()) + "\",") + getStructuredDataProperties(type)) + "}";
    }

    private String getStructuredDataProperties(StructuredDataType type) {
        return type.getProperties().entrySet().stream().map(e -> getStructuredDataProperty(e)).collect(Collectors.joining(","));
    }

    private String getStructuredDataProperty(Map.Entry<String, String> e) {
        return ((("\"" + e.getKey()) + "\":\"") + e.getValue()) + "\"";
    }

    @Override
    public String getUrlParameter(String urlParameter) {
        return null;
    }

    @Override
    public Map<String, String> getUrlParameters() {
        return null;
    }

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected String frontendScript;

    protected String viewport;

    protected String canonicalUrl;

    protected List<ExternalStyleSheet> externalStyleSheet;

    protected List<ExternalScript> externalScript;

    protected List<ExternalResource> preconnect;

    protected List<ExternalResource> dnsPrefetch;

    protected List<Metadata> metadata;

    protected List<ImportMap> importMap;

    protected List<String> script;

    protected String manifest;

    protected List<DocumentIcon> icon;

    protected StructuredData structuredData;

    protected String title;

    protected String viewId;

    protected String description;

    protected List<String> keywords;

    protected String themeColor;

    protected String language;

    protected String path;

    protected String url;

    protected String charset;

    protected List<StyleSheet> styleSheet;

    protected Map<String, Object> model;

    protected DefaultWebBackendDocument(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        parentComponentPart = options.getComponentFactory().createParentComponent(((CoreParentComponentOptions) (options.getParentComponentPart())));
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, parentComponentPart);
        this.commonStyles.setStyleSheetFactory(WebBackendStyleSheet::new);
    }

    public WebBackendParentComponentPart getParentComponentPart() {
        return parentComponentPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return parentComponentPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.parentComponentPart.setRootComponent(rootComponent);
        if (body != null)
            body.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return parentComponentPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (body != null)
            body.setTheme(theme);

        this.parentComponentPart.setTheme(theme);
        return self();
    }

    @Override
    public S setRehydration(String rehydration, Boolean canFail) {
        this.baseComponentPart.setRehydration(rehydration, canFail);
        return self();
    }

    @Override
    public S setRehydration(String selector, CoreComponent parent) {
        this.baseComponentPart.setRehydration(selector, parent);
        return self();
    }

    @Override
    public S setRehydration(String selector, CoreComponent parent, Boolean canFail) {
        this.baseComponentPart.setRehydration(selector, parent, canFail);
        return self();
    }

    public void writeStartTag(PrintWriter writer) {
        parentComponentPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        parentComponentPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        parentComponentPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        parentComponentPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        parentComponentPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (parentComponentPart == null)
            return false;

        return parentComponentPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return parentComponentPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        parentComponentPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return parentComponentPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        parentComponentPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        parentComponentPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        parentComponentPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        parentComponentPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return parentComponentPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return parentComponentPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        parentComponentPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return parentComponentPart.getData(data);
    }

    public boolean hasData(String data) {
        return parentComponentPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        parentComponentPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return parentComponentPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return parentComponentPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return parentComponentPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return parentComponentPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return parentComponentPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return parentComponentPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return parentComponentPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        parentComponentPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return parentComponentPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return parentComponentPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return parentComponentPart.hasWrapper();
    }

    public boolean isInitialized() {
        return parentComponentPart.isInitialized();
    }

    public void log(Object obj) {
        parentComponentPart.log(obj);
    }

    public void removeFromParent() {
        parentComponentPart.removeFromParent();
    }

    @Override
    public WebBackendComponentFactory getComponentFactory() {
        return ((WebBackendComponentFactory) (baseComponentPart.getComponentFactory()));
    }

    public WebBackendBaseComponentPart getBaseComponentPart() {
        return baseComponentPart;
    }

    @Override
    public void addPart(ComponentPart.Type type, ComponentPart part) {
        baseComponentPart.addPart(type, part);
    }

    @Override
    public <C extends ComponentType<?, T>, T extends CoreComponentOptions> void initialize(C component, T options) {
        setupReferences();
        baseComponentPart.initialize(component, options);
    }

    @Override
    public WebBackendDocument getComponent() {
        return ((WebBackendDocument) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
        WebBackendDocumentPart component = ((WebBackendDocumentPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getFrontendScriptOption(), component::setFrontendScript);
        applicator.add(options.getViewportOption(), component::setViewport);
        applicator.add(options.getCanonicalUrlOption(), component::setCanonicalUrl);
        applicator.add(options.getExternalStyleSheetOption(), component::setExternalStyleSheet);
        applicator.add(options.getExternalScriptOption(), component::setExternalScript);
        applicator.add(options.getPreconnectOption(), component::setPreconnect);
        applicator.add(options.getDnsPrefetchOption(), component::setDnsPrefetch);
        applicator.add(options.getMetadataOption(), component::setMetadata);
        applicator.add(options.getImportMapOption(), component::setImportMap);
        applicator.add(options.getScriptOption(), component::setScript);
        applicator.add(options.getManifestOption(), component::setManifest);
        applicator.add(options.getIconOption(), component::setIcon);
        applicator.add(options.getStructuredDataOption(), component::setStructuredData);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        if (isRehydrated() || ((WebRootComponent) (rootComponent)).isComponentTypeRegistered(getComponent().getClass()))
            return;

        super.onInitializeComponentType(rootComponent);
        parentComponentPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    @Override
    public WebBackendDocumentBody getBody() {
        return ((WebBackendDocumentBody) (super.getBody()));
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }

    @Override
    public String getFrontendScript() {
        return frontendScript;
    }

    @Override
    public S setFrontendScript(String frontendScript) {
        this.frontendScript = frontendScript;
        return self();
    }

    @Override
    public String getViewport() {
        return viewport;
    }

    @Override
    public S setViewport(String viewport) {
        this.viewport = viewport;
        return self();
    }

    @Override
    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    @Override
    public S setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
        return self();
    }

    @Override
    public List<ExternalStyleSheet> getExternalStyleSheet() {
        return externalStyleSheet;
    }

    @Override
    public S setExternalStyleSheet(List<ExternalStyleSheet> externalStyleSheet) {
        // Create copy of
        this.externalStyleSheet = new ArrayList<ExternalStyleSheet>(externalStyleSheet);
        return self();
    }

    @Override
    public S addExternalStyleSheet(ExternalStyleSheet externalStyleSheet) {
        if (this.externalStyleSheet == null) {
            setExternalStyleSheet(new ArrayList<ExternalStyleSheet>());
        }
        this.externalStyleSheet.add(externalStyleSheet);
        return self();
    }

    @Override
    public S setExternalStyleSheet(ExternalStyleSheet externalStyleSheet) {
        setExternalStyleSheet(new ArrayList<ExternalStyleSheet>(Arrays.asList(externalStyleSheet)));
        return self();
    }

    @Override
    public S removeExternalStyleSheet(ExternalStyleSheet externalStyleSheet) {
        this.externalStyleSheet.remove(externalStyleSheet);
        return self();
    }

    @Override
    public List<ExternalScript> getExternalScript() {
        return externalScript;
    }

    @Override
    public S setExternalScript(List<ExternalScript> externalScript) {
        // Create copy of
        this.externalScript = new ArrayList<ExternalScript>(externalScript);
        return self();
    }

    @Override
    public S addExternalScript(ExternalScript externalScript) {
        if (this.externalScript == null) {
            setExternalScript(new ArrayList<ExternalScript>());
        }
        this.externalScript.add(externalScript);
        return self();
    }

    @Override
    public S setExternalScript(ExternalScript externalScript) {
        setExternalScript(new ArrayList<ExternalScript>(Arrays.asList(externalScript)));
        return self();
    }

    @Override
    public S removeExternalScript(ExternalScript externalScript) {
        this.externalScript.remove(externalScript);
        return self();
    }

    @Override
    public List<ExternalResource> getPreconnect() {
        return preconnect;
    }

    @Override
    public S setPreconnect(List<ExternalResource> preconnect) {
        // Create copy of
        this.preconnect = new ArrayList<ExternalResource>(preconnect);
        return self();
    }

    @Override
    public S addPreconnect(ExternalResource preconnect) {
        if (this.preconnect == null) {
            setPreconnect(new ArrayList<ExternalResource>());
        }
        this.preconnect.add(preconnect);
        return self();
    }

    @Override
    public S removePreconnect(ExternalResource preconnect) {
        this.preconnect.remove(preconnect);
        return self();
    }

    @Override
    public List<ExternalResource> getDnsPrefetch() {
        return dnsPrefetch;
    }

    @Override
    public S setDnsPrefetch(List<ExternalResource> dnsPrefetch) {
        // Create copy of
        this.dnsPrefetch = new ArrayList<ExternalResource>(dnsPrefetch);
        return self();
    }

    @Override
    public S addDnsPrefetch(ExternalResource dnsPrefetch) {
        if (this.dnsPrefetch == null) {
            setDnsPrefetch(new ArrayList<ExternalResource>());
        }
        this.dnsPrefetch.add(dnsPrefetch);
        return self();
    }

    @Override
    public S removeDnsPrefetch(ExternalResource dnsPrefetch) {
        this.dnsPrefetch.remove(dnsPrefetch);
        return self();
    }

    @Override
    public List<Metadata> getMetadata() {
        return metadata;
    }

    @Override
    public S setMetadata(List<Metadata> metadata) {
        // Create copy of
        this.metadata = new ArrayList<Metadata>(metadata);
        return self();
    }

    @Override
    public S addMetadata(Metadata metadata) {
        if (this.metadata == null) {
            setMetadata(new ArrayList<Metadata>());
        }
        this.metadata.add(metadata);
        return self();
    }

    @Override
    public S removeMetadata(Metadata metadata) {
        this.metadata.remove(metadata);
        return self();
    }

    @Override
    public boolean hasMetadata(Metadata metadata) {
        return this.metadata.contains(metadata);
    }

    @Override
    public List<ImportMap> getImportMap() {
        return importMap;
    }

    @Override
    public S setImportMap(List<ImportMap> importMap) {
        // Create copy of
        this.importMap = new ArrayList<ImportMap>(importMap);
        return self();
    }

    @Override
    public S addImportMap(ImportMap importMap) {
        if (this.importMap == null) {
            setImportMap(new ArrayList<ImportMap>());
        }
        this.importMap.add(importMap);
        return self();
    }

    @Override
    public S setImportMap(ImportMap importMap) {
        setImportMap(new ArrayList<ImportMap>(Arrays.asList(importMap)));
        return self();
    }

    @Override
    public S removeImportMap(ImportMap importMap) {
        this.importMap.remove(importMap);
        return self();
    }

    @Override
    public List<String> getScript() {
        return script;
    }

    @Override
    public S setScript(List<String> script) {
        // Create copy of
        this.script = new ArrayList<String>(script);
        return self();
    }

    @Override
    public S addScript(String script) {
        if (this.script == null) {
            setScript(new ArrayList<String>());
        }
        this.script.add(script);
        return self();
    }

    @Override
    public S setScript(String script) {
        setScript(new ArrayList<String>(Arrays.asList(script)));
        return self();
    }

    @Override
    public S removeScript(String script) {
        this.script.remove(script);
        return self();
    }

    @Override
    public String getManifest() {
        return manifest;
    }

    @Override
    public S setManifest(String manifest) {
        this.manifest = manifest;
        return self();
    }

    @Override
    public List<DocumentIcon> getIcon() {
        return icon;
    }

    @Override
    public S setIcon(List<DocumentIcon> icon) {
        // Create copy of
        this.icon = new ArrayList<DocumentIcon>(icon);
        return self();
    }

    @Override
    public S addIcon(DocumentIcon icon) {
        if (this.icon == null) {
            setIcon(new ArrayList<DocumentIcon>());
        }
        this.icon.add(icon);
        return self();
    }

    @Override
    public S setIcon(DocumentIcon icon) {
        setIcon(new ArrayList<DocumentIcon>(Arrays.asList(icon)));
        return self();
    }

    @Override
    public S removeIcon(DocumentIcon icon) {
        this.icon.remove(icon);
        return self();
    }

    @Override
    public StructuredData getStructuredData() {
        return structuredData;
    }

    @Override
    public S setStructuredData(StructuredData structuredData) {
        this.structuredData = structuredData;
        return self();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public S setTitle(String title) {
        this.title = title;
        return self();
    }

    @Override
    public String getViewId() {
        return viewId;
    }

    // Implementation
    @Override
    public S setViewId(String viewId) {
        this.viewId = viewId;
        this.body.setData("viewid", viewId);
        this.body.addStyleClass(viewId);
        return self();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public S setDescription(String description) {
        this.description = description;
        return self();
    }

    @Override
    public List<String> getKeywords() {
        return keywords;
    }

    @Override
    public S setKeywords(List<String> keywords) {
        // Create copy of
        this.keywords = new ArrayList<String>(keywords);
        return self();
    }

    @Override
    public S addKeyword(String keyword) {
        if (this.keywords == null) {
            setKeywords(new ArrayList<String>());
        }
        this.keywords.add(keyword);
        return self();
    }

    @Override
    public S removeKeyword(String keyword) {
        this.keywords.remove(keyword);
        return self();
    }

    @Override
    public boolean hasKeyword(String keyword) {
        return this.keywords.contains(keyword);
    }

    @Override
    public String getThemeColor() {
        return themeColor;
    }

    @Override
    public S setThemeColor(String themeColor) {
        this.themeColor = themeColor;
        return self();
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public S setLanguage(String language) {
        this.language = language;
        return self();
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public S setPath(String path) {
        this.path = path;
        return self();
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public S setUrl(String url) {
        this.url = url;
        return self();
    }

    @Override
    public String getCharset() {
        return charset;
    }

    @Override
    public S setCharset(String charset) {
        this.charset = charset;
        return self();
    }

    @Override
    public List<StyleSheet> getStyleSheet() {
        return styleSheet;
    }

    @Override
    public S setStyleSheet(List<StyleSheet> styleSheet) {
        // Create copy of
        this.styleSheet = new ArrayList<StyleSheet>(styleSheet);
        return self();
    }

    @Override
    public S addStyleSheet(StyleSheet styleSheet) {
        if (this.styleSheet == null) {
            setStyleSheet(new ArrayList<StyleSheet>());
        }
        this.styleSheet.add(styleSheet);
        return self();
    }

    @Override
    public S setStyleSheet(StyleSheet styleSheet) {
        setStyleSheet(new ArrayList<StyleSheet>(Arrays.asList(styleSheet)));
        return self();
    }

    @Override
    public S removeStyleSheet(StyleSheet styleSheet) {
        this.styleSheet.remove(styleSheet);
        return self();
    }

    @Override
    public Map<String, Object> getModel() {
        return model;
    }

    @Override
    public S setModel(Map<String, Object> model) {
        this.model = model;
        return self();
    }

    // Implementation
    public String serializeModel(Map<String, Object> model) {
        DocumentModelSerializer documentModelSerializer = ReuiseWebBackendConfig.getInstance().getDocumentModelSerializer();
        if (documentModelSerializer != null)
            return documentModelSerializer.serialize(model);

        return null;
    }

    // Implementation
    @Override
    public void writeTo(PrintWriter writer) {
        writer.write(("<!DOCTYPE html><html lang=\"" + this.language) + "\">");
        writer.write("<head>");
        if ((this.frontendScript != null) && (!this.frontendScript.isEmpty())) {
            writer.write(("<script type=\"text/javascript\" language=\"javascript\" src=\"" + this.frontendScript) + "\"></script>");
        }
        if ((this.preconnect != null) && (!this.preconnect.isEmpty())) {
            this.preconnect.stream().forEach(p -> {
                writer.write(("<link rel=\"preconnect\" href=\"" + p.getUrl()) + "\"");
                if (p.isCrossOrigin())
                    writer.write(" crossorigin");

                writer.write(">");
            });
        }
        if ((this.dnsPrefetch != null) && (!this.dnsPrefetch.isEmpty())) {
            this.dnsPrefetch.stream().forEach(p -> {
                writer.write(("<link rel=\"dns-prefetch\" href=\"" + p.getUrl()) + "\"");
                if (p.isCrossOrigin())
                    writer.write(" crossorigin");

                writer.write(">");
            });
        }
        if (this.charset != null)
            writer.write(("<meta charset=\"" + this.charset) + "\">");

        if (this.title != null)
            writer.write(("<title>" + this.title) + "</title>");

        if (this.description != null)
            writer.write(("<meta name=\"description\" content=\"" + this.description) + "\">");

        if ((this.keywords != null) && (!this.keywords.isEmpty()))
            writer.write(("<meta name=\"keywords\" content=\"" + String.join(",", this.keywords)) + "\">");

        if (this.themeColor != null)
            writer.write(("<meta name=\"theme-color\" content=\"" + this.themeColor) + "\">");

        if (this.viewport != null)
            writer.write(("<meta name=\"viewport\" content=\"" + this.viewport) + "\">");

        if (this.metadata != null)
            this.metadata.forEach(m -> writer.write(((("<meta name=\"" + m.getName()) + "\" content=\"") + m.getContent()) + "\">"));

        if (this.manifest != null)
            writer.write(("<link rel=\"manifest\" href=\"" + this.manifest) + "\">");

        if (this.canonicalUrl != null)
            writer.write(("<link rel=\"canonical\" href=\"" + this.canonicalUrl) + "\">");

        if ((this.externalStyleSheet != null) && (!this.externalStyleSheet.isEmpty())) {
            this.externalStyleSheet.stream().forEach(s -> {
                writer.write(("<link href=\"" + s.getUrl()) + "\"");
                if (s.isAsync())
                    writer.write(" rel=\"preload\" as=\"style\" onload=\"this.onload=null;this.rel=\'stylesheet\'\"");
                else
                    writer.write(" rel=\"stylesheet\"");

                writer.write(">");
            });
        }
        Collection<StyleSheet> commonStyleSheets = this.commonStyles.getStyleSheets();
        if (commonStyleSheets != null) {
            commonStyleSheets.stream().forEach(s -> {
                String stateKey = s.getStateKey();
                String stateQuery = s.getStateQuery();
                String cssText = s.getCssText();
                if ((cssText != null) && (!cssText.isEmpty())) {
                    writer.write("<style");
                    writer.write((" id=\"reuise-commonstyles" + ((stateKey != null) && (!stateKey.isEmpty()) ? "_" + stateKey : "")) + "\"");
                    if ((stateQuery != null) && (!stateQuery.isEmpty()))
                        writer.write((" media=\"" + stateQuery) + "\"");

                    writer.write(">");
                    writer.write(s.getCssText());
                    writer.write("</style>");
                }
            });
        }
        if ((this.externalScript != null) && (!this.externalScript.isEmpty())) {
            this.externalScript.stream().forEach(s -> {
                writer.write("<script");
                if (s.isDefer())
                    writer.write(" defer");

                if (s.isAsync())
                    writer.write(" async");

                String url = s.getUrl();
                if (url != null)
                    writer.write((" src=\"" + url) + "\"");

                String type = s.getType();
                if (type != null)
                    writer.write((" type=\"" + type) + "\"");

                String language = s.getLanguage();
                if (language != null)
                    writer.write((" language=\"" + language) + "\"");

                String crossOrigin = s.getCrossOrigin();
                if (crossOrigin != null)
                    writer.write((" crossorigin=\"" + crossOrigin) + "\"");

                writer.write("></script>");
            });
        }
        if ((this.importMap != null) && (!this.importMap.isEmpty())) {
            this.importMap.stream().forEach(m -> {
                writer.write("<script type=\"importmap\">");
                Map<String, String> imports = m.getImports();
                if ((imports != null) && (!imports.isEmpty())) {
                    writer.write("{\"imports\": {");
                    imports.entrySet().stream().forEach(e -> {
                        writer.write(((("\"" + e.getKey()) + "\":\"") + e.getValue()) + "\"");
                    });
                    writer.write("}}");
                }
                writer.write("</script>");
            });
        }
        if ((this.script != null) && (!this.script.isEmpty())) {
            this.script.stream().forEach(s -> writer.write(("<script>" + s) + "</script>"));
        }
        if ((this.icon != null) && (!this.icon.isEmpty())) {
            this.icon.stream().forEach(i -> {
                String type = i.getType();
                String path = i.getPath();
                int w = i.getWidth();
                int h = i.getHeight();
                writer.write("<link rel=\"icon\"");
                if (type != null)
                    writer.write((" type=\"" + type) + "\"");

                if ((w != (-1)) && (h != (-1)))
                    writer.write((((" sizes=\"" + w) + "x") + h) + "\"");

                if (path != null)
                    writer.write((" href=\"" + path) + "\"");

                writer.write(">");
            });
        }
        writer.write("<script type=\"application/javascript\" language=\"javascript\">");
        if (this.viewId != null)
            writer.write(("var reuiseViewId=\"" + this.viewId) + "\";");

        if ((this.model != null) && (!this.model.isEmpty())) {
            String serializedModel = serializeModel(this.model);
            if ((serializedModel != null) && (!serializedModel.isEmpty())) {
                writer.write("var reuiseDocModel=");
                writer.write(serializedModel);
                writer.write(";");
            }
        }
        writer.write("</script>");
        if (this.structuredData != null) {
            writer.write("<script type=\"application/ld+json\">");
            writer.write(getStructuredDataTypes(this.structuredData.getTypes()));
            writer.write("</script>");
        }
        writer.write("</head>");
        // writer.write("<body"+((viewId != null && !viewId.isEmpty()) ? " data-viewid=\""+viewId+"\"" : "")+">");
        this.parentComponentPart.writeTo(writer);
        // writer.write("</body>");
        writer.write("</html>");
    }
}