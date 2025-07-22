package dev.reuise.web.backend.splitcontainer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponent;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.layout.BackdropFilterSetting;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.splitcontainer.CoreSplitContainerDivider;
import dev.reuise.core.splitcontainer.CoreSplitContainerDividerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanel;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.splitcontainer.AbstractWebSplitContainerOptions;
import dev.reuise.webstyles.Style;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
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
public abstract class AbstractWebBackendSplitContainerOptions<S extends AbstractWebBackendSplitContainerOptions<S>> extends AbstractWebSplitContainerOptions<S> implements WebBackendSplitContainerOptions {
    protected final WebBackendContainerPartOptions containerPart;

    protected final WebBackendParentComponentPartOptions parentComponentPart;

    protected final WebBackendBaseComponentPartOptions baseComponentPart;

    protected ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> containerCreator;

    protected ComponentCreator<? extends CoreSplitContainerPanel, ? extends CoreSplitContainerPanelOptions> startPanelCreator;

    protected ComponentCreator<? extends CoreSplitContainerDivider, ? extends CoreSplitContainerDividerOptions> dividerCreator;

    protected ComponentCreator<? extends CoreSplitContainerPanel, ? extends CoreSplitContainerPanelOptions> endPanelCreator;

    protected AbstractWebBackendSplitContainerOptions() {
        this(null);
    }

    protected AbstractWebBackendSplitContainerOptions(WebBackendContainerOptions baseOptions) {
        containerPart = (baseOptions != null) ? baseOptions : getComponentFactory().createContainerOptions();
        parentComponentPart = containerPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        setBaseStyleClass("reuise-splitcontainer");
        setStoreInElementOptions(new ArrayList(Arrays.asList("direction", "reverseDirection", "resizable")));
        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    @Override
    public Object getPadding() {
        return containerPart.getPadding();
    }

    @Override
    public ComponentOption<Object> getPaddingOption() {
        return containerPart.getPaddingOption();
    }

    @Override
    public S setPadding(Object padding) {
        this.containerPart.setPadding(padding);
        return self();
    }

    @Override
    public S setPadding(Object padding, State state) {
        this.containerPart.setPadding(padding, state);
        return self();
    }

    @Override
    public S setPaddingAllStates(Object padding) {
        setPadding(ScreenSizeValues.of(padding, padding));
        setPadding(padding);
        return self();
    }

    @Override
    public S setPadding(ScreenSizeValues<Object> padding) {
        this.containerPart.setPadding(padding);
        return self();
    }

    @Override
    public Object getPadding(State state) {
        return containerPart.getPadding(state);
    }

    @Override
    public ComponentOption<Object> getPaddingOption(State state) {
        return containerPart.getPaddingOption(state);
    }

    @Override
    public Collection<State> getPaddingStates() {
        return containerPart.getPaddingStates();
    }

    @Override
    public Object getPaddingTop() {
        return containerPart.getPaddingTop();
    }

    @Override
    public ComponentOption<Object> getPaddingTopOption() {
        return containerPart.getPaddingTopOption();
    }

    @Override
    public S setPaddingTop(Object paddingTop) {
        this.containerPart.setPaddingTop(paddingTop);
        return self();
    }

    @Override
    public S setPaddingTop(Object paddingTop, State state) {
        this.containerPart.setPaddingTop(paddingTop, state);
        return self();
    }

    @Override
    public S setPaddingTopAllStates(Object paddingTop) {
        setPaddingTop(ScreenSizeValues.of(paddingTop, paddingTop));
        setPaddingTop(paddingTop);
        return self();
    }

    @Override
    public S setPaddingTop(ScreenSizeValues<Object> paddingTop) {
        this.containerPart.setPaddingTop(paddingTop);
        return self();
    }

    @Override
    public Object getPaddingTop(State state) {
        return containerPart.getPaddingTop(state);
    }

    @Override
    public ComponentOption<Object> getPaddingTopOption(State state) {
        return containerPart.getPaddingTopOption(state);
    }

    @Override
    public Collection<State> getPaddingTopStates() {
        return containerPart.getPaddingTopStates();
    }

    @Override
    public Object getPaddingRight() {
        return containerPart.getPaddingRight();
    }

    @Override
    public ComponentOption<Object> getPaddingRightOption() {
        return containerPart.getPaddingRightOption();
    }

    @Override
    public S setPaddingRight(Object paddingRight) {
        this.containerPart.setPaddingRight(paddingRight);
        return self();
    }

    @Override
    public S setPaddingRight(Object paddingRight, State state) {
        this.containerPart.setPaddingRight(paddingRight, state);
        return self();
    }

    @Override
    public S setPaddingRightAllStates(Object paddingRight) {
        setPaddingRight(ScreenSizeValues.of(paddingRight, paddingRight));
        setPaddingRight(paddingRight);
        return self();
    }

    @Override
    public S setPaddingRight(ScreenSizeValues<Object> paddingRight) {
        this.containerPart.setPaddingRight(paddingRight);
        return self();
    }

    @Override
    public Object getPaddingRight(State state) {
        return containerPart.getPaddingRight(state);
    }

    @Override
    public ComponentOption<Object> getPaddingRightOption(State state) {
        return containerPart.getPaddingRightOption(state);
    }

    @Override
    public Collection<State> getPaddingRightStates() {
        return containerPart.getPaddingRightStates();
    }

    @Override
    public Object getPaddingBottom() {
        return containerPart.getPaddingBottom();
    }

    @Override
    public ComponentOption<Object> getPaddingBottomOption() {
        return containerPart.getPaddingBottomOption();
    }

    @Override
    public S setPaddingBottom(Object paddingBottom) {
        this.containerPart.setPaddingBottom(paddingBottom);
        return self();
    }

    @Override
    public S setPaddingBottom(Object paddingBottom, State state) {
        this.containerPart.setPaddingBottom(paddingBottom, state);
        return self();
    }

    @Override
    public S setPaddingBottomAllStates(Object paddingBottom) {
        setPaddingBottom(ScreenSizeValues.of(paddingBottom, paddingBottom));
        setPaddingBottom(paddingBottom);
        return self();
    }

    @Override
    public S setPaddingBottom(ScreenSizeValues<Object> paddingBottom) {
        this.containerPart.setPaddingBottom(paddingBottom);
        return self();
    }

    @Override
    public Object getPaddingBottom(State state) {
        return containerPart.getPaddingBottom(state);
    }

    @Override
    public ComponentOption<Object> getPaddingBottomOption(State state) {
        return containerPart.getPaddingBottomOption(state);
    }

    @Override
    public Collection<State> getPaddingBottomStates() {
        return containerPart.getPaddingBottomStates();
    }

    @Override
    public Object getPaddingLeft() {
        return containerPart.getPaddingLeft();
    }

    @Override
    public ComponentOption<Object> getPaddingLeftOption() {
        return containerPart.getPaddingLeftOption();
    }

    @Override
    public S setPaddingLeft(Object paddingLeft) {
        this.containerPart.setPaddingLeft(paddingLeft);
        return self();
    }

    @Override
    public S setPaddingLeft(Object paddingLeft, State state) {
        this.containerPart.setPaddingLeft(paddingLeft, state);
        return self();
    }

    @Override
    public S setPaddingLeftAllStates(Object paddingLeft) {
        setPaddingLeft(ScreenSizeValues.of(paddingLeft, paddingLeft));
        setPaddingLeft(paddingLeft);
        return self();
    }

    @Override
    public S setPaddingLeft(ScreenSizeValues<Object> paddingLeft) {
        this.containerPart.setPaddingLeft(paddingLeft);
        return self();
    }

    @Override
    public Object getPaddingLeft(State state) {
        return containerPart.getPaddingLeft(state);
    }

    @Override
    public ComponentOption<Object> getPaddingLeftOption(State state) {
        return containerPart.getPaddingLeftOption(state);
    }

    @Override
    public Collection<State> getPaddingLeftStates() {
        return containerPart.getPaddingLeftStates();
    }

    @Override
    public String getPosition() {
        return containerPart.getPosition();
    }

    @Override
    public ComponentOption<String> getPositionOption() {
        return containerPart.getPositionOption();
    }

    @Override
    public S setPosition(String position) {
        this.containerPart.setPosition(position);
        return self();
    }

    @Override
    public S setPosition(String position, State state) {
        this.containerPart.setPosition(position, state);
        return self();
    }

    @Override
    public S setPositionAllStates(String position) {
        setPosition(ScreenSizeValues.of(position, position));
        setPosition(position);
        return self();
    }

    @Override
    public S setPosition(ScreenSizeValues<String> position) {
        this.containerPart.setPosition(position);
        return self();
    }

    @Override
    public String getPosition(State state) {
        return containerPart.getPosition(state);
    }

    @Override
    public ComponentOption<String> getPositionOption(State state) {
        return containerPart.getPositionOption(state);
    }

    @Override
    public Collection<State> getPositionStates() {
        return containerPart.getPositionStates();
    }

    @Override
    public Object getInset() {
        return containerPart.getInset();
    }

    @Override
    public ComponentOption<Object> getInsetOption() {
        return containerPart.getInsetOption();
    }

    @Override
    public S setInset(Object inset) {
        this.containerPart.setInset(inset);
        return self();
    }

    @Override
    public S setInset(Object inset, State state) {
        this.containerPart.setInset(inset, state);
        return self();
    }

    @Override
    public S setInsetAllStates(Object inset) {
        setInset(ScreenSizeValues.of(inset, inset));
        setInset(inset);
        return self();
    }

    @Override
    public S setInset(ScreenSizeValues<Object> inset) {
        this.containerPart.setInset(inset);
        return self();
    }

    @Override
    public Object getInset(State state) {
        return containerPart.getInset(state);
    }

    @Override
    public ComponentOption<Object> getInsetOption(State state) {
        return containerPart.getInsetOption(state);
    }

    @Override
    public Collection<State> getInsetStates() {
        return containerPart.getInsetStates();
    }

    @Override
    public BackdropFilterSetting getBackdropFilter() {
        return containerPart.getBackdropFilter();
    }

    @Override
    public ComponentOption<BackdropFilterSetting> getBackdropFilterOption() {
        return containerPart.getBackdropFilterOption();
    }

    @Override
    public S setBackdropFilter(BackdropFilterSetting backdropFilter) {
        this.containerPart.setBackdropFilter(backdropFilter);
        return self();
    }

    @Override
    public S setBackdropFilter(BackdropFilterSetting backdropFilter, State state) {
        this.containerPart.setBackdropFilter(backdropFilter, state);
        return self();
    }

    @Override
    public S setBackdropFilterAllStates(BackdropFilterSetting backdropFilter) {
        setBackdropFilter(ScreenSizeValues.of(backdropFilter, backdropFilter));
        setBackdropFilter(backdropFilter);
        return self();
    }

    @Override
    public S setBackdropFilter(ScreenSizeValues<BackdropFilterSetting> backdropFilter) {
        this.containerPart.setBackdropFilter(backdropFilter);
        return self();
    }

    @Override
    public BackdropFilterSetting getBackdropFilter(State state) {
        return containerPart.getBackdropFilter(state);
    }

    @Override
    public ComponentOption<BackdropFilterSetting> getBackdropFilterOption(State state) {
        return containerPart.getBackdropFilterOption(state);
    }

    @Override
    public Collection<State> getBackdropFilterStates() {
        return containerPart.getBackdropFilterStates();
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public WebBackendContainerPartOptions getContainerPart() {
        return containerPart;
    }

    @Override
    public List<CoreComponent> getChildren() {
        return parentComponentPart.getChildren();
    }

    @Override
    public ComponentOption<List<CoreComponent>> getChildrenOption() {
        return parentComponentPart.getChildrenOption();
    }

    @Override
    public S setChildren(List<CoreComponent> children) {
        this.parentComponentPart.setChildren(children);
        return self();
    }

    @Override
    public S setChild(CoreComponent child) {
        parentComponentPart.setChild(child);
        return self();
    }

    @Override
    public S removeChild(CoreComponent child) {
        parentComponentPart.removeChild(child);
        return self();
    }

    public WebBackendParentComponentPartOptions getParentComponentPart() {
        return parentComponentPart;
    }

    public <T> void setDefaultOption(String option, T value) {
        baseComponentPart.setDefaultOption(option, value);
    }

    public <T> void setDefaultOption(String option, T value, State state) {
        baseComponentPart.setDefaultOption(option, value, state);
    }

    public <T> void setDefaultOption(String option, T value, boolean force) {
        baseComponentPart.setDefaultOption(option, value, force);
    }

    public <T> void setDefaultOption(String option, T value, State state, boolean force) {
        baseComponentPart.setDefaultOption(option, value, state, force);
    }

    @Override
    public String getId() {
        return baseComponentPart.getId();
    }

    @Override
    public ComponentOption<String> getIdOption() {
        return baseComponentPart.getIdOption();
    }

    @Override
    public S setId(String id) {
        this.baseComponentPart.setId(id);
        return self();
    }

    @Override
    public String getTagName() {
        return baseComponentPart.getTagName();
    }

    @Override
    public ComponentOption<String> getTagNameOption() {
        return baseComponentPart.getTagNameOption();
    }

    @Override
    public S setTagName(String tagName) {
        this.baseComponentPart.setTagName(tagName);
        return self();
    }

    @Override
    public String getXmlNamespace() {
        return baseComponentPart.getXmlNamespace();
    }

    @Override
    public ComponentOption<String> getXmlNamespaceOption() {
        return baseComponentPart.getXmlNamespaceOption();
    }

    @Override
    public S setXmlNamespace(String xmlNamespace) {
        this.baseComponentPart.setXmlNamespace(xmlNamespace);
        return self();
    }

    @Override
    public String getTooltip() {
        return baseComponentPart.getTooltip();
    }

    @Override
    public ComponentOption<String> getTooltipOption() {
        return baseComponentPart.getTooltipOption();
    }

    @Override
    public S setTooltip(String tooltip) {
        this.baseComponentPart.setTooltip(tooltip);
        return self();
    }

    @Override
    public String getBaseStyleClass() {
        return baseComponentPart.getBaseStyleClass();
    }

    @Override
    public ComponentOption<String> getBaseStyleClassOption() {
        return baseComponentPart.getBaseStyleClassOption();
    }

    @Override
    public S setBaseStyleClass(String baseStyleClass) {
        this.baseComponentPart.setBaseStyleClass(baseStyleClass);
        return self();
    }

    @Override
    public Map<String, String> getAttributes() {
        return baseComponentPart.getAttributes();
    }

    @Override
    public ComponentOption<Map<String, String>> getAttributesOption() {
        return baseComponentPart.getAttributesOption();
    }

    @Override
    public S setAttributes(Map<String, String> attributes) {
        this.baseComponentPart.setAttributes(attributes);
        return self();
    }

    @Override
    public List<String> getStyleClasses() {
        return baseComponentPart.getStyleClasses();
    }

    @Override
    public ComponentOption<List<String>> getStyleClassesOption() {
        return baseComponentPart.getStyleClassesOption();
    }

    @Override
    public S setStyleClasses(List<String> styleClasses) {
        this.baseComponentPart.setStyleClasses(styleClasses);
        return self();
    }

    @Override
    public S addStyleClass(String styleClass) {
        this.baseComponentPart.addStyleClass(styleClass);
        return self();
    }

    @Override
    public S setStyleClass(String styleClass) {
        baseComponentPart.setStyleClass(styleClass);
        return self();
    }

    @Override
    public S setStyleClasses(String... styleClasses) {
        baseComponentPart.setStyleClasses(styleClasses);
        return self();
    }

    @Override
    public S removeStyleClass(String styleClass) {
        baseComponentPart.removeStyleClass(styleClass);
        return self();
    }

    @Override
    public boolean hasStyleClass(String styleClass) {
        return baseComponentPart.hasStyleClass(styleClass);
    }

    @Override
    public Map<String, String> getData() {
        return baseComponentPart.getData();
    }

    @Override
    public ComponentOption<Map<String, String>> getDataOption() {
        return baseComponentPart.getDataOption();
    }

    @Override
    public S setData(Map<String, String> data) {
        this.baseComponentPart.setData(data);
        return self();
    }

    @Override
    public Style getStyle() {
        return baseComponentPart.getStyle();
    }

    @Override
    public ComponentOption<Style> getStyleOption() {
        return baseComponentPart.getStyleOption();
    }

    @Override
    public S setStyle(Style style) {
        this.baseComponentPart.setStyle(style);
        return self();
    }

    @Override
    public S setStyle(Style style, State state) {
        this.baseComponentPart.setStyle(style, state);
        return self();
    }

    @Override
    public S setStyleAllStates(Style style) {
        setStyle(ScreenSizeValues.of(style, style));
        setStyle(style);
        return self();
    }

    @Override
    public S setStyle(ScreenSizeValues<Style> style) {
        this.baseComponentPart.setStyle(style);
        return self();
    }

    @Override
    public Style getStyle(State state) {
        return baseComponentPart.getStyle(state);
    }

    @Override
    public ComponentOption<Style> getStyleOption(State state) {
        return baseComponentPart.getStyleOption(state);
    }

    @Override
    public Collection<State> getStyleStates() {
        return baseComponentPart.getStyleStates();
    }

    @Override
    public Style getInlineStyle() {
        return baseComponentPart.getInlineStyle();
    }

    @Override
    public ComponentOption<Style> getInlineStyleOption() {
        return baseComponentPart.getInlineStyleOption();
    }

    @Override
    public S setInlineStyle(Style inlineStyle) {
        this.baseComponentPart.setInlineStyle(inlineStyle);
        return self();
    }

    @Override
    public String getRehydration() {
        return baseComponentPart.getRehydration();
    }

    @Override
    public ComponentOption<String> getRehydrationOption() {
        return baseComponentPart.getRehydrationOption();
    }

    @Override
    public S setRehydration(String rehydration) {
        this.baseComponentPart.setRehydration(rehydration);
        return self();
    }

    @Override
    public boolean isContentEditable() {
        return baseComponentPart.isContentEditable();
    }

    @Override
    public ComponentOption<Boolean> getContentEditableOption() {
        return baseComponentPart.getContentEditableOption();
    }

    @Override
    public S setContentEditable(Boolean contentEditable) {
        this.baseComponentPart.setContentEditable(contentEditable);
        return self();
    }

    @Override
    public List<String> getStoreInElementOptions() {
        return baseComponentPart.getStoreInElementOptions();
    }

    @Override
    public ComponentOption<List<String>> getStoreInElementOptionsOption() {
        return baseComponentPart.getStoreInElementOptionsOption();
    }

    @Override
    public S setStoreInElementOptions(List<String> storeInElementOptions) {
        this.baseComponentPart.setStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public S addStoreInElementOptions(String storeInElementOptions) {
        this.baseComponentPart.addStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public S setStoreInElementOptions(String storeInElementOptions) {
        baseComponentPart.setStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public S removeStoreInElementOptions(String storeInElementOptions) {
        baseComponentPart.removeStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public boolean hasStoreInElementOptions(String storeInElementOptions) {
        return baseComponentPart.hasStoreInElementOptions(storeInElementOptions);
    }

    @Override
    public boolean isMounted() {
        return baseComponentPart.isMounted();
    }

    @Override
    public ComponentOption<Boolean> getMountedOption() {
        return baseComponentPart.getMountedOption();
    }

    @Override
    public S setMounted(Boolean mounted) {
        this.baseComponentPart.setMounted(mounted);
        return self();
    }

    @Override
    public Object getMargin() {
        return baseComponentPart.getMargin();
    }

    @Override
    public ComponentOption<Object> getMarginOption() {
        return baseComponentPart.getMarginOption();
    }

    @Override
    public S setMargin(Object margin) {
        this.baseComponentPart.setMargin(margin);
        return self();
    }

    @Override
    public S setMargin(Object margin, State state) {
        this.baseComponentPart.setMargin(margin, state);
        return self();
    }

    @Override
    public S setMarginAllStates(Object margin) {
        setMargin(ScreenSizeValues.of(margin, margin));
        setMargin(margin);
        return self();
    }

    @Override
    public S setMargin(ScreenSizeValues<Object> margin) {
        this.baseComponentPart.setMargin(margin);
        return self();
    }

    @Override
    public Object getMargin(State state) {
        return baseComponentPart.getMargin(state);
    }

    @Override
    public ComponentOption<Object> getMarginOption(State state) {
        return baseComponentPart.getMarginOption(state);
    }

    @Override
    public Collection<State> getMarginStates() {
        return baseComponentPart.getMarginStates();
    }

    @Override
    public Object getMarginTop() {
        return baseComponentPart.getMarginTop();
    }

    @Override
    public ComponentOption<Object> getMarginTopOption() {
        return baseComponentPart.getMarginTopOption();
    }

    @Override
    public S setMarginTop(Object marginTop) {
        this.baseComponentPart.setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginTop(Object marginTop, State state) {
        this.baseComponentPart.setMarginTop(marginTop, state);
        return self();
    }

    @Override
    public S setMarginTopAllStates(Object marginTop) {
        setMarginTop(ScreenSizeValues.of(marginTop, marginTop));
        setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginTop(ScreenSizeValues<Object> marginTop) {
        this.baseComponentPart.setMarginTop(marginTop);
        return self();
    }

    @Override
    public Object getMarginTop(State state) {
        return baseComponentPart.getMarginTop(state);
    }

    @Override
    public ComponentOption<Object> getMarginTopOption(State state) {
        return baseComponentPart.getMarginTopOption(state);
    }

    @Override
    public Collection<State> getMarginTopStates() {
        return baseComponentPart.getMarginTopStates();
    }

    @Override
    public Object getMarginRight() {
        return baseComponentPart.getMarginRight();
    }

    @Override
    public ComponentOption<Object> getMarginRightOption() {
        return baseComponentPart.getMarginRightOption();
    }

    @Override
    public S setMarginRight(Object marginRight) {
        this.baseComponentPart.setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginRight(Object marginRight, State state) {
        this.baseComponentPart.setMarginRight(marginRight, state);
        return self();
    }

    @Override
    public S setMarginRightAllStates(Object marginRight) {
        setMarginRight(ScreenSizeValues.of(marginRight, marginRight));
        setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginRight(ScreenSizeValues<Object> marginRight) {
        this.baseComponentPart.setMarginRight(marginRight);
        return self();
    }

    @Override
    public Object getMarginRight(State state) {
        return baseComponentPart.getMarginRight(state);
    }

    @Override
    public ComponentOption<Object> getMarginRightOption(State state) {
        return baseComponentPart.getMarginRightOption(state);
    }

    @Override
    public Collection<State> getMarginRightStates() {
        return baseComponentPart.getMarginRightStates();
    }

    @Override
    public Object getMarginBottom() {
        return baseComponentPart.getMarginBottom();
    }

    @Override
    public ComponentOption<Object> getMarginBottomOption() {
        return baseComponentPart.getMarginBottomOption();
    }

    @Override
    public S setMarginBottom(Object marginBottom) {
        this.baseComponentPart.setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginBottom(Object marginBottom, State state) {
        this.baseComponentPart.setMarginBottom(marginBottom, state);
        return self();
    }

    @Override
    public S setMarginBottomAllStates(Object marginBottom) {
        setMarginBottom(ScreenSizeValues.of(marginBottom, marginBottom));
        setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginBottom(ScreenSizeValues<Object> marginBottom) {
        this.baseComponentPart.setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public Object getMarginBottom(State state) {
        return baseComponentPart.getMarginBottom(state);
    }

    @Override
    public ComponentOption<Object> getMarginBottomOption(State state) {
        return baseComponentPart.getMarginBottomOption(state);
    }

    @Override
    public Collection<State> getMarginBottomStates() {
        return baseComponentPart.getMarginBottomStates();
    }

    @Override
    public Object getMarginLeft() {
        return baseComponentPart.getMarginLeft();
    }

    @Override
    public ComponentOption<Object> getMarginLeftOption() {
        return baseComponentPart.getMarginLeftOption();
    }

    @Override
    public S setMarginLeft(Object marginLeft) {
        this.baseComponentPart.setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setMarginLeft(Object marginLeft, State state) {
        this.baseComponentPart.setMarginLeft(marginLeft, state);
        return self();
    }

    @Override
    public S setMarginLeftAllStates(Object marginLeft) {
        setMarginLeft(ScreenSizeValues.of(marginLeft, marginLeft));
        setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setMarginLeft(ScreenSizeValues<Object> marginLeft) {
        this.baseComponentPart.setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public Object getMarginLeft(State state) {
        return baseComponentPart.getMarginLeft(state);
    }

    @Override
    public ComponentOption<Object> getMarginLeftOption(State state) {
        return baseComponentPart.getMarginLeftOption(state);
    }

    @Override
    public Collection<State> getMarginLeftStates() {
        return baseComponentPart.getMarginLeftStates();
    }

    @Override
    public Object getWidth() {
        return baseComponentPart.getWidth();
    }

    @Override
    public ComponentOption<Object> getWidthOption() {
        return baseComponentPart.getWidthOption();
    }

    @Override
    public S setWidth(Object width) {
        this.baseComponentPart.setWidth(width);
        return self();
    }

    @Override
    public S setWidth(Object width, State state) {
        this.baseComponentPart.setWidth(width, state);
        return self();
    }

    @Override
    public S setWidthAllStates(Object width) {
        setWidth(ScreenSizeValues.of(width, width));
        setWidth(width);
        return self();
    }

    @Override
    public S setWidth(ScreenSizeValues<Object> width) {
        this.baseComponentPart.setWidth(width);
        return self();
    }

    @Override
    public Object getWidth(State state) {
        return baseComponentPart.getWidth(state);
    }

    @Override
    public ComponentOption<Object> getWidthOption(State state) {
        return baseComponentPart.getWidthOption(state);
    }

    @Override
    public Collection<State> getWidthStates() {
        return baseComponentPart.getWidthStates();
    }

    @Override
    public Object getMinWidth() {
        return baseComponentPart.getMinWidth();
    }

    @Override
    public ComponentOption<Object> getMinWidthOption() {
        return baseComponentPart.getMinWidthOption();
    }

    @Override
    public S setMinWidth(Object minWidth) {
        this.baseComponentPart.setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMinWidth(Object minWidth, State state) {
        this.baseComponentPart.setMinWidth(minWidth, state);
        return self();
    }

    @Override
    public S setMinWidthAllStates(Object minWidth) {
        setMinWidth(ScreenSizeValues.of(minWidth, minWidth));
        setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMinWidth(ScreenSizeValues<Object> minWidth) {
        this.baseComponentPart.setMinWidth(minWidth);
        return self();
    }

    @Override
    public Object getMinWidth(State state) {
        return baseComponentPart.getMinWidth(state);
    }

    @Override
    public ComponentOption<Object> getMinWidthOption(State state) {
        return baseComponentPart.getMinWidthOption(state);
    }

    @Override
    public Collection<State> getMinWidthStates() {
        return baseComponentPart.getMinWidthStates();
    }

    @Override
    public Object getMaxWidth() {
        return baseComponentPart.getMaxWidth();
    }

    @Override
    public ComponentOption<Object> getMaxWidthOption() {
        return baseComponentPart.getMaxWidthOption();
    }

    @Override
    public S setMaxWidth(Object maxWidth) {
        this.baseComponentPart.setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setMaxWidth(Object maxWidth, State state) {
        this.baseComponentPart.setMaxWidth(maxWidth, state);
        return self();
    }

    @Override
    public S setMaxWidthAllStates(Object maxWidth) {
        setMaxWidth(ScreenSizeValues.of(maxWidth, maxWidth));
        setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setMaxWidth(ScreenSizeValues<Object> maxWidth) {
        this.baseComponentPart.setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public Object getMaxWidth(State state) {
        return baseComponentPart.getMaxWidth(state);
    }

    @Override
    public ComponentOption<Object> getMaxWidthOption(State state) {
        return baseComponentPart.getMaxWidthOption(state);
    }

    @Override
    public Collection<State> getMaxWidthStates() {
        return baseComponentPart.getMaxWidthStates();
    }

    @Override
    public Object getHeight() {
        return baseComponentPart.getHeight();
    }

    @Override
    public ComponentOption<Object> getHeightOption() {
        return baseComponentPart.getHeightOption();
    }

    @Override
    public S setHeight(Object height) {
        this.baseComponentPart.setHeight(height);
        return self();
    }

    @Override
    public S setHeight(Object height, State state) {
        this.baseComponentPart.setHeight(height, state);
        return self();
    }

    @Override
    public S setHeightAllStates(Object height) {
        setHeight(ScreenSizeValues.of(height, height));
        setHeight(height);
        return self();
    }

    @Override
    public S setHeight(ScreenSizeValues<Object> height) {
        this.baseComponentPart.setHeight(height);
        return self();
    }

    @Override
    public Object getHeight(State state) {
        return baseComponentPart.getHeight(state);
    }

    @Override
    public ComponentOption<Object> getHeightOption(State state) {
        return baseComponentPart.getHeightOption(state);
    }

    @Override
    public Collection<State> getHeightStates() {
        return baseComponentPart.getHeightStates();
    }

    @Override
    public Object getMinHeight() {
        return baseComponentPart.getMinHeight();
    }

    @Override
    public ComponentOption<Object> getMinHeightOption() {
        return baseComponentPart.getMinHeightOption();
    }

    @Override
    public S setMinHeight(Object minHeight) {
        this.baseComponentPart.setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMinHeight(Object minHeight, State state) {
        this.baseComponentPart.setMinHeight(minHeight, state);
        return self();
    }

    @Override
    public S setMinHeightAllStates(Object minHeight) {
        setMinHeight(ScreenSizeValues.of(minHeight, minHeight));
        setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMinHeight(ScreenSizeValues<Object> minHeight) {
        this.baseComponentPart.setMinHeight(minHeight);
        return self();
    }

    @Override
    public Object getMinHeight(State state) {
        return baseComponentPart.getMinHeight(state);
    }

    @Override
    public ComponentOption<Object> getMinHeightOption(State state) {
        return baseComponentPart.getMinHeightOption(state);
    }

    @Override
    public Collection<State> getMinHeightStates() {
        return baseComponentPart.getMinHeightStates();
    }

    @Override
    public Object getMaxHeight() {
        return baseComponentPart.getMaxHeight();
    }

    @Override
    public ComponentOption<Object> getMaxHeightOption() {
        return baseComponentPart.getMaxHeightOption();
    }

    @Override
    public S setMaxHeight(Object maxHeight) {
        this.baseComponentPart.setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public S setMaxHeight(Object maxHeight, State state) {
        this.baseComponentPart.setMaxHeight(maxHeight, state);
        return self();
    }

    @Override
    public S setMaxHeightAllStates(Object maxHeight) {
        setMaxHeight(ScreenSizeValues.of(maxHeight, maxHeight));
        setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public S setMaxHeight(ScreenSizeValues<Object> maxHeight) {
        this.baseComponentPart.setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public Object getMaxHeight(State state) {
        return baseComponentPart.getMaxHeight(state);
    }

    @Override
    public ComponentOption<Object> getMaxHeightOption(State state) {
        return baseComponentPart.getMaxHeightOption(state);
    }

    @Override
    public Collection<State> getMaxHeightStates() {
        return baseComponentPart.getMaxHeightStates();
    }

    @Override
    public boolean isRequiredLayoutComponent() {
        return baseComponentPart.isRequiredLayoutComponent();
    }

    @Override
    public ComponentOption<Boolean> getRequiredLayoutComponentOption() {
        return baseComponentPart.getRequiredLayoutComponentOption();
    }

    @Override
    public S setRequiredLayoutComponent(Boolean requiredLayoutComponent) {
        this.baseComponentPart.setRequiredLayoutComponent(requiredLayoutComponent);
        return self();
    }

    @Override
    public CoreComponent getParent() {
        return baseComponentPart.getParent();
    }

    @Override
    public ComponentOption<CoreComponent> getParentOption() {
        return baseComponentPart.getParentOption();
    }

    @Override
    public S setParent(CoreComponent parent) {
        this.baseComponentPart.setParent(parent);
        return self();
    }

    @Override
    public CoreParentComponent getWrapper() {
        return baseComponentPart.getWrapper();
    }

    @Override
    public ComponentOption<CoreParentComponent> getWrapperOption() {
        return baseComponentPart.getWrapperOption();
    }

    @Override
    public S setWrapper(CoreParentComponent wrapper) {
        this.baseComponentPart.setWrapper(wrapper);
        return self();
    }

    @Override
    public Theme getTheme() {
        return baseComponentPart.getTheme();
    }

    @Override
    public ComponentOption<Theme> getThemeOption() {
        return baseComponentPart.getThemeOption();
    }

    @Override
    public S setTheme(Theme theme) {
        this.baseComponentPart.setTheme(theme);
        return self();
    }

    @Override
    public boolean isVisible() {
        return baseComponentPart.isVisible();
    }

    @Override
    public ComponentOption<Boolean> getVisibleOption() {
        return baseComponentPart.getVisibleOption();
    }

    @Override
    public S setVisible(Boolean visible) {
        this.baseComponentPart.setVisible(visible);
        return self();
    }

    @Override
    public S setVisible(Boolean visible, State state) {
        this.baseComponentPart.setVisible(visible, state);
        return self();
    }

    @Override
    public S setVisibleAllStates(Boolean visible) {
        setVisible(ScreenSizeValues.of(visible, visible));
        setVisible(visible);
        return self();
    }

    @Override
    public S setVisible(ScreenSizeValues<Boolean> visible) {
        this.baseComponentPart.setVisible(visible);
        return self();
    }

    @Override
    public boolean isVisible(State state) {
        return baseComponentPart.isVisible(state);
    }

    @Override
    public ComponentOption<Boolean> getVisibleOption(State state) {
        return baseComponentPart.getVisibleOption(state);
    }

    @Override
    public Collection<State> getVisibleStates() {
        return baseComponentPart.getVisibleStates();
    }

    public boolean isVisibleAnyState() {
        return baseComponentPart.isVisibleAnyState();
    }

    @Override
    public boolean isEnabled() {
        return baseComponentPart.isEnabled();
    }

    @Override
    public ComponentOption<Boolean> getEnabledOption() {
        return baseComponentPart.getEnabledOption();
    }

    @Override
    public S setEnabled(Boolean enabled) {
        this.baseComponentPart.setEnabled(enabled);
        return self();
    }

    @Override
    public boolean isFocused() {
        return baseComponentPart.isFocused();
    }

    @Override
    public ComponentOption<Boolean> getFocusedOption() {
        return baseComponentPart.getFocusedOption();
    }

    @Override
    public S setFocused(Boolean focused) {
        this.baseComponentPart.setFocused(focused);
        return self();
    }

    @Override
    public boolean isDebug() {
        return baseComponentPart.isDebug();
    }

    @Override
    public ComponentOption<Boolean> getDebugOption() {
        return baseComponentPart.getDebugOption();
    }

    @Override
    public S setDebug(Boolean debug) {
        this.baseComponentPart.setDebug(debug);
        return self();
    }

    @Override
    public String getDebugId() {
        return baseComponentPart.getDebugId();
    }

    @Override
    public ComponentOption<String> getDebugIdOption() {
        return baseComponentPart.getDebugIdOption();
    }

    @Override
    public S setDebugId(String debugId) {
        this.baseComponentPart.setDebugId(debugId);
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

    public void setRehydrate(boolean rehydrate) {
        baseComponentPart.setRehydrate(rehydrate);
    }

    public boolean isRehydrated() {
        return baseComponentPart.isRehydrated();
    }

    public Collection<State> getStates() {
        return baseComponentPart.getStates();
    }

    public Object getOptionValue(String option) {
        if (baseComponentPart == null)
            return null;

        return baseComponentPart.getOptionValue(option);
    }

    public Object getOptionValue(String option, State state) {
        if (baseComponentPart == null)
            return null;

        return baseComponentPart.getOptionValue(option, state);
    }

    public ComponentOption<? extends Object> getOption(String option) {
        return baseComponentPart.getOption(option);
    }

    public ComponentOption<? extends Object> getOption(String option, State state) {
        return baseComponentPart.getOption(option, state);
    }

    public Map<String, ComponentOption<? extends Object>> getOptions() {
        return baseComponentPart.getOptions();
    }

    public Collection<ComponentOption<? extends Object>> getOptionValues(String option) {
        return baseComponentPart.getOptionValues(option);
    }

    public <T> void setOption(String option, T value) {
        baseComponentPart.setOption(option, value);
    }

    public <T> void setOption(String option, T value, boolean force) {
        baseComponentPart.setOption(option, value, force);
    }

    public <T> void setOption(String option, T value, State state) {
        baseComponentPart.setOption(option, value, state);
    }

    public <T> void setOption(String option, T value, State state, boolean force) {
        baseComponentPart.setOption(option, value, state, force);
    }

    public void clearOption(String option) {
        baseComponentPart.clearOption(option);
    }

    public void clearOption(String option, boolean clearStates) {
        baseComponentPart.clearOption(option, clearStates);
    }

    public void clearOptionStates(String option) {
        baseComponentPart.clearOptionStates(option);
    }

    public void clearOption(String option, State state) {
        baseComponentPart.clearOption(option, state);
    }

    public Collection<State> getOptionStates(String option) {
        return baseComponentPart.getOptionStates(option);
    }

    public WebBackendBaseComponentPartOptions getBaseComponentPart() {
        return baseComponentPart;
    }

    @Override
    public void setComponent(CoreBaseComponent component) {
        baseComponentPart.setComponent(component);
    }

    @Override
    public WebBackendSplitContainer getComponent() {
        return ((WebBackendSplitContainer) (baseComponentPart.getComponent()));
    }

    @Override
    public void merge(CoreComponentOptions other) {
        baseComponentPart.merge(other);
        if (((WebBackendSplitContainerOptions) (other)) instanceof WebBackendSplitContainerOptions) {
            WebBackendSplitContainerOptions otherWebBackendSplitContainerOptions = ((WebBackendSplitContainerOptions) (other));
            CoreContainerOptions otherContainerOptions = otherWebBackendSplitContainerOptions.getContainerOptions();
            if (otherContainerOptions != null)
                setContainerOptions(otherContainerOptions);

            CoreSplitContainerPanelOptions otherStartPanelOptions = otherWebBackendSplitContainerOptions.getStartPanelOptions();
            if (otherStartPanelOptions != null)
                setStartPanelOptions(otherStartPanelOptions);

            CoreSplitContainerDividerOptions otherDividerOptions = otherWebBackendSplitContainerOptions.getDividerOptions();
            if (otherDividerOptions != null)
                setDividerOptions(otherDividerOptions);

            CoreSplitContainerPanelOptions otherEndPanelOptions = otherWebBackendSplitContainerOptions.getEndPanelOptions();
            if (otherEndPanelOptions != null)
                setEndPanelOptions(otherEndPanelOptions);

        }
    }

    public ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getContainerCreator() {
        return containerCreator;
    }

    public S setContainerCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> containerCreator) {
        this.containerCreator = containerCreator;
        return self();
    }

    protected WebBackendContainerOptions createDefaultContainerOptions() {
        WebBackendContainerOptions options = ((WebBackendContainerOptions) (super.createDefaultContainerOptions()));
        return options;
    }

    public ComponentCreator<? extends CoreSplitContainerPanel, ? extends CoreSplitContainerPanelOptions> getStartPanelCreator() {
        return startPanelCreator;
    }

    public S setStartPanelCreator(ComponentCreator<? extends WebBackendSplitContainerPanel, ? extends WebBackendSplitContainerPanelOptions> startPanelCreator) {
        this.startPanelCreator = startPanelCreator;
        return self();
    }

    protected WebBackendSplitContainerPanelOptions createDefaultStartPanelOptions() {
        WebBackendSplitContainerPanelOptions options = ((WebBackendSplitContainerPanelOptions) (super.createDefaultStartPanelOptions()));
        return options;
    }

    public ComponentCreator<? extends CoreSplitContainerDivider, ? extends CoreSplitContainerDividerOptions> getDividerCreator() {
        return dividerCreator;
    }

    public S setDividerCreator(ComponentCreator<? extends WebBackendSplitContainerDivider, ? extends WebBackendSplitContainerDividerOptions> dividerCreator) {
        this.dividerCreator = dividerCreator;
        return self();
    }

    protected WebBackendSplitContainerDividerOptions createDefaultDividerOptions() {
        WebBackendSplitContainerDividerOptions options = ((WebBackendSplitContainerDividerOptions) (super.createDefaultDividerOptions()));
        return options;
    }

    public ComponentCreator<? extends CoreSplitContainerPanel, ? extends CoreSplitContainerPanelOptions> getEndPanelCreator() {
        return endPanelCreator;
    }

    public S setEndPanelCreator(ComponentCreator<? extends WebBackendSplitContainerPanel, ? extends WebBackendSplitContainerPanelOptions> endPanelCreator) {
        this.endPanelCreator = endPanelCreator;
        return self();
    }

    protected WebBackendSplitContainerPanelOptions createDefaultEndPanelOptions() {
        WebBackendSplitContainerPanelOptions options = ((WebBackendSplitContainerPanelOptions) (super.createDefaultEndPanelOptions()));
        return options;
    }
}