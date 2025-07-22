package dev.reuise.web.backend.card;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.layout.CoreSurfaceOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.image.WebBackendImage;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.backend.layout.WebBackendSurfacePart;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendTextBlock;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.card.DefaultWebCardPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
// Option: Type - CORE
// Option: Direction - CORE
// Option: JustifyContent - CORE
// Option: AlignItems - CORE
// Option: ColumnGap - CORE
// Option: RowGap - CORE
// Option: Gap - CORE
// Option: Wrap - CORE
// Option: Padding - CORE
// Option: PaddingTop - CORE
// Option: PaddingRight - CORE
// Option: PaddingBottom - CORE
// Option: PaddingLeft - CORE
// Option: Position - CORE
// Option: Inset - CORE
// Option: BackdropFilter - CORE
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
// base comp: surface
// base comp: flexContainer
// base comp: container
// add composition for container: addHeading
// add composition for container: addDivider
// add composition for container: addParagraph
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
public abstract class DefaultWebBackendCard<S extends DefaultWebBackendCard<S, O>, O extends WebBackendCardOptions> extends DefaultWebCardPart<S, O> implements WebBackendComponentType<S, O> , WebBackendCard {
    protected final WebBackendSurfacePart surfacePart;

    protected final WebBackendFlexContainerPart flexContainerPart;

    protected final WebBackendContainerPart containerPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendCard(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        surfacePart = options.getComponentFactory().createSurface(((CoreSurfaceOptions) (options.getSurfacePart())));
        flexContainerPart = surfacePart.getFlexContainerPart();
        containerPart = flexContainerPart.getContainerPart();
        parentComponentPart = containerPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, surfacePart);
    }

    public WebBackendSurfacePart getSurfacePart() {
        return surfacePart;
    }

    @Override
    public RootComponent getRootComponent() {
        return surfacePart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.surfacePart.setRootComponent(rootComponent);
        if (mediaLink != null)
            mediaLink.setRootComponent(rootComponent);

        if (mediaContainer != null)
            mediaContainer.setRootComponent(rootComponent);

        if (image != null)
            image.setRootComponent(rootComponent);

        if (textContent != null)
            textContent.setRootComponent(rootComponent);

        if (headline != null)
            headline.setRootComponent(rootComponent);

        if (headingLink != null)
            headingLink.setRootComponent(rootComponent);

        if (headingContainer != null)
            headingContainer.setRootComponent(rootComponent);

        if (subHeadingContainer != null)
            subHeadingContainer.setRootComponent(rootComponent);

        if (textContainer != null)
            textContainer.setRootComponent(rootComponent);

        if (actionsContainer != null)
            actionsContainer.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return surfacePart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (mediaLink != null)
            mediaLink.setTheme(theme);

        if (mediaContainer != null)
            mediaContainer.setTheme(theme);

        if (image != null)
            image.setTheme(theme);

        if (textContent != null)
            textContent.setTheme(theme);

        if (headline != null)
            headline.setTheme(theme);

        if (headingLink != null)
            headingLink.setTheme(theme);

        if (headingContainer != null)
            headingContainer.setTheme(theme);

        if (subHeadingContainer != null)
            subHeadingContainer.setTheme(theme);

        if (textContainer != null)
            textContainer.setTheme(theme);

        if (actionsContainer != null)
            actionsContainer.setTheme(theme);

        this.surfacePart.setTheme(theme);
        return self();
    }

    public WebBackendFlexContainerPart getFlexContainerPart() {
        return flexContainerPart;
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S addHeading(int level, String text) {
        surfacePart.addHeading(level, text);
        return self();
    }

    public S addHeading(String text) {
        surfacePart.addHeading(text);
        return self();
    }

    public S addHeading(int level, Html html) {
        surfacePart.addHeading(level, html);
        return self();
    }

    public S addHeading(Html html) {
        surfacePart.addHeading(html);
        return self();
    }

    public S addDivider() {
        surfacePart.addDivider();
        return self();
    }

    public S addDivider(String label) {
        surfacePart.addDivider(label);
        return self();
    }

    public S addParagraph(String text) {
        surfacePart.addParagraph(text);
        return self();
    }

    public S addParagraph(Html html) {
        surfacePart.addParagraph(html);
        return self();
    }

    public WebBackendContainerPart getContainerPart() {
        return containerPart;
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

    public void writeStartTag(PrintWriter writer) {
        surfacePart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        surfacePart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        surfacePart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        surfacePart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        surfacePart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (surfacePart == null)
            return false;

        return surfacePart.isRehydrated();
    }

    public Style getComputedStyle() {
        return surfacePart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        surfacePart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return surfacePart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        surfacePart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        surfacePart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        surfacePart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        surfacePart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return surfacePart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return surfacePart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        surfacePart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return surfacePart.getData(data);
    }

    public boolean hasData(String data) {
        return surfacePart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        surfacePart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return surfacePart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return surfacePart.hasAria(attribute);
    }

    public String getUniqueId() {
        return surfacePart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return surfacePart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return surfacePart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return surfacePart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return surfacePart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        surfacePart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return surfacePart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return surfacePart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return surfacePart.hasWrapper();
    }

    public boolean isInitialized() {
        return surfacePart.isInitialized();
    }

    public void log(Object obj) {
        surfacePart.log(obj);
    }

    public void removeFromParent() {
        surfacePart.removeFromParent();
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
    public WebBackendCard getComponent() {
        return ((WebBackendCard) (baseComponentPart.getComponent()));
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
        surfacePart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    @Override
    public WebBackendLink getMediaLink() {
        return ((WebBackendLink) (super.getMediaLink()));
    }

    @Override
    public WebBackendFlexContainer getMediaContainer() {
        return ((WebBackendFlexContainer) (super.getMediaContainer()));
    }

    @Override
    public WebBackendImage getImage() {
        return ((WebBackendImage) (super.getImage()));
    }

    @Override
    public WebBackendFlexContainer getTextContent() {
        return ((WebBackendFlexContainer) (super.getTextContent()));
    }

    @Override
    public WebBackendFlexContainer getHeadline() {
        return ((WebBackendFlexContainer) (super.getHeadline()));
    }

    @Override
    public WebBackendLink getHeadingLink() {
        return ((WebBackendLink) (super.getHeadingLink()));
    }

    @Override
    public WebBackendTextBlock getHeadingContainer() {
        return ((WebBackendTextBlock) (super.getHeadingContainer()));
    }

    @Override
    public WebBackendTextBlock getSubHeadingContainer() {
        return ((WebBackendTextBlock) (super.getSubHeadingContainer()));
    }

    @Override
    public WebBackendTextBlock getTextContainer() {
        return ((WebBackendTextBlock) (super.getTextContainer()));
    }

    @Override
    public WebBackendFlexContainer getActionsContainer() {
        return ((WebBackendFlexContainer) (super.getActionsContainer()));
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }

    @Override
    public S setAction(CoreButton action) {
        setActions(new ArrayList<CoreButton>(Arrays.asList(action)));
        return self();
    }

    @Override
    public void writeTo(PrintWriter writer) {
        writeStartTag(writer);
        parentComponentPart.writeTo(writer);
        writeEndTag(writer);
    }
}