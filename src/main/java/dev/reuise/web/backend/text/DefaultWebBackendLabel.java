package dev.reuise.web.backend.text;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.text.DefaultWebLabelPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Text - CORE
// Option: FontSize - CORE
// Option: LineHeight - CORE
// Option: HighlightText - CORE
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
// base comp: inlineText
// base comp: text
// add composition for text: containsText
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
public abstract class DefaultWebBackendLabel<S extends DefaultWebBackendLabel<S, O>, O extends WebBackendLabelOptions> extends DefaultWebLabelPart<S, O> implements WebBackendComponentType<S, O> , WebBackendLabel {
    protected final WebBackendInlineTextPart inlineTextPart;

    protected final WebBackendTextPart textPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendLabel(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        inlineTextPart = options.getComponentFactory().createInlineText(((CoreInlineTextOptions) (options.getInlineTextPart())));
        textPart = inlineTextPart.getTextPart();
        parentComponentPart = textPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, inlineTextPart);
    }

    public WebBackendInlineTextPart getInlineTextPart() {
        return inlineTextPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return inlineTextPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.inlineTextPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return inlineTextPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.inlineTextPart.setTheme(theme);
        return self();
    }

    @Override
    public S setText(Html html) {
        this.textPart.setText(html);
        return self();
    }

    public boolean containsText(String text) {
        return inlineTextPart.containsText(text);
    }

    public WebBackendTextPart getTextPart() {
        return textPart;
    }

    public WebBackendParentComponentPart getParentComponentPart() {
        return parentComponentPart;
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

    public void writeTo(PrintWriter writer) {
        inlineTextPart.writeTo(writer);
    }

    public void writeStartTag(PrintWriter writer) {
        inlineTextPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        inlineTextPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        inlineTextPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        inlineTextPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        inlineTextPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (inlineTextPart == null)
            return false;

        return inlineTextPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return inlineTextPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        inlineTextPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return inlineTextPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        inlineTextPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        inlineTextPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        inlineTextPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        inlineTextPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return inlineTextPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return inlineTextPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        inlineTextPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return inlineTextPart.getData(data);
    }

    public boolean hasData(String data) {
        return inlineTextPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        inlineTextPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return inlineTextPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return inlineTextPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return inlineTextPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return inlineTextPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return inlineTextPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return inlineTextPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return inlineTextPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        inlineTextPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return inlineTextPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return inlineTextPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return inlineTextPart.hasWrapper();
    }

    public boolean isInitialized() {
        return inlineTextPart.isInitialized();
    }

    public void log(Object obj) {
        inlineTextPart.log(obj);
    }

    public void removeFromParent() {
        inlineTextPart.removeFromParent();
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
    public WebBackendLabel getComponent() {
        return ((WebBackendLabel) (baseComponentPart.getComponent()));
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
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        if (isRehydrated() || ((WebRootComponent) (rootComponent)).isComponentTypeRegistered(getComponent().getClass()))
            return;

        super.onInitializeComponentType(rootComponent);
        inlineTextPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }
}