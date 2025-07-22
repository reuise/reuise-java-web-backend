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
import dev.reuise.core.text.CoreTextOptions;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.text.DefaultWebInlineTextPart;
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
public abstract class DefaultWebBackendInlineText<S extends DefaultWebBackendInlineText<S, O>, O extends WebBackendInlineTextOptions> extends DefaultWebInlineTextPart<S, O> implements WebBackendInlineText , WebBackendComponentType<S, O> {
    protected final WebBackendTextPart textPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendInlineText(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        textPart = options.getComponentFactory().createText(((CoreTextOptions) (options.getTextPart())));
        parentComponentPart = textPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, textPart);
    }

    @Override
    public S setText(Html html) {
        this.textPart.setText(html);
        return self();
    }

    public boolean containsText(String text) {
        return textPart.containsText(text);
    }

    public WebBackendTextPart getTextPart() {
        return textPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return textPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.textPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return textPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.textPart.setTheme(theme);
        return self();
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

    // Implementation
    public void writeTo(PrintWriter writer) {
        writeStartTag(writer);
        String text = this.getText();
        if (text != null)
            writer.write(text);

        writeEndTag(writer);
    }

    public void writeStartTag(PrintWriter writer) {
        textPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        textPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        textPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        textPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        textPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (textPart == null)
            return false;

        return textPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return textPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        textPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return textPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        textPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        textPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        textPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        textPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return textPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return textPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        textPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return textPart.getData(data);
    }

    public boolean hasData(String data) {
        return textPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        textPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return textPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return textPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return textPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return textPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return textPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return textPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return textPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        textPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return textPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return textPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return textPart.hasWrapper();
    }

    public boolean isInitialized() {
        return textPart.isInitialized();
    }

    public void log(Object obj) {
        textPart.log(obj);
    }

    public void removeFromParent() {
        textPart.removeFromParent();
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
    public WebBackendInlineText getComponent() {
        return ((WebBackendInlineText) (baseComponentPart.getComponent()));
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
        textPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }
}