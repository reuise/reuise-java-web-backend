package dev.reuise.web.backend.basecomponent;
import dev.reuise.core.ComponentUtils;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.style.WebBackendStyleSheet;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.basecomponent.DefaultWebBaseComponentPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheet;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public abstract class DefaultWebBackendBaseComponent<S extends DefaultWebBackendBaseComponent<S, O>, O extends WebBackendBaseComponentOptions> extends DefaultWebBaseComponentPart<S, O> implements WebBackendComponentType<S, O> , WebBackendBaseComponent {
    @Override
    public WebBackendBaseComponent getComponent() {
        return ((WebBackendBaseComponent) (super.getComponent()));
    }

    @Override
    public String getUniqueId() {
        if (this.uniqueId == null)
            this.uniqueId = "reuise-B" + ComponentUtils.generateRandomString();

        return this.uniqueId;
    }

    @Override
    public String getUniqueStyleClass() {
        if (this.uniqueStyleClass == null)
            this.uniqueStyleClass = "reuise-style_B" + ComponentUtils.generateRandomString();

        return this.uniqueStyleClass;
    }

    protected void writeStartTag(PrintWriter writer, HtmlWriterOptions.HtmlWriterStartTagOptions opts) {
        if (opts.isWriteStyleSheets())
            writeStyleSheets(writer);

        writer.write("<" + opts.getTagName());
        // Id
        if (this.id != null) {
            writer.write((" id=\"" + escape(this.id)) + "\"");
        }
        // Classes
        List<String> allStyleClasses = getAllStyleClasses();
        if ((allStyleClasses != null) && (!allStyleClasses.isEmpty())) {
            writer.write(" class=\"");
            writer.write(String.join(" ", allStyleClasses));
            writer.write("\"");
        }
        // Inline style
        if (this.inlineStyle != null) {
            String cssText = this.inlineStyle.getCssText();
            if ((cssText != null) && (!cssText.isEmpty())) {
                writer.write(" style=\"");
                writer.write(cssText);
                writer.write("\"");
            }
        }
        // Attributes
        if (this.attributes != null) {
            this.attributes.entrySet().forEach(a -> {
                writer.write(" " + a.getKey());
                Object value = a.getValue();
                if (value != null) {
                    writer.write("=\"");
                    writer.write(escape(value.toString()));
                    writer.write("\"");
                }
            });
        }
        /* //Data
        if(data != null) {
        data.entrySet().forEach(d -> {
        writer.write(" data-"+d.getKey()+"=\"");
        String value = d.getValue();
        writer.write(value == null ? "null" : value);
        writer.write("\"");
        });
        }
         */
        // Tooltip
        if (this.tooltip != null) {
            writer.write((" title=\"" + escape(this.tooltip)) + "\"");
        }
        if (opts.isClose())
            writer.write(">");

    }

    private String escape(String str) {
        return str != null ? str.replace("\"", "\\\\\"") : null;
    }

    private List<String> getAllStyleClasses() {
        List<String> allStyleClasses = null;
        if ((this.baseStyleClass != null) && (!this.baseStyleClass.isEmpty())) {
            if (allStyleClasses == null)
                allStyleClasses = new ArrayList<>();

            allStyleClasses.add(this.baseStyleClass);
        }
        if ((this.uniqueStyleClass != null) && (!this.uniqueStyleClass.isEmpty())) {
            if (allStyleClasses == null)
                allStyleClasses = new ArrayList<>();

            allStyleClasses.add(this.uniqueStyleClass);
        }
        if ((this.styleClasses != null) && (!this.styleClasses.isEmpty())) {
            if (allStyleClasses == null)
                allStyleClasses = new ArrayList<>();

            allStyleClasses.addAll(this.styleClasses);
        }
        return allStyleClasses;
    }

    private void writeStyleSheets(PrintWriter writer) {
        if (this.styles == null)
            return;

        Collection<StyleSheet> styleSheets = this.styles.getStyleSheets();
        if (styleSheets == null)
            return;

        styleSheets.stream().forEach(s -> {
            String stateKey = s.getStateKey();
            String stateQuery = s.getStateQuery();
            String cssText = s.getCssText();
            if ((cssText != null) && (!cssText.isEmpty())) {
                writer.write("<style");
                writer.write((" id=\"" + (getStyleSheetId() + ((stateKey != null) && (!stateKey.isEmpty()) ? "_" + stateKey : ""))) + "\"");
                if ((stateQuery != null) && (!stateQuery.isEmpty()))
                    writer.write((" media=\"" + stateQuery) + "\"");

                writer.write(">");
                writer.write(s.getCssText());
                writer.write("</style>");
            }
        });
    }

    @Override
    public S setAttribute(String attribute, String value) {
        if (this.attributes == null)
            this.attributes = new LinkedHashMap<>();

        this.attributes.put(attribute.toLowerCase(), value);
        return self();
    }

    @Override
    public S removeAttribute(String attribute) {
        if (this.attributes == null)
            return self();

        this.attributes.remove(attribute);
        return self();
    }

    @Override
    public boolean hasAttribute(String attribute) {
        if (this.attributes == null)
            return false;

        return this.attributes.containsKey(attribute);
    }

    @Override
    public String getAttribute(String attribute) {
        if (this.attributes == null)
            return null;

        return this.attributes.get(attribute);
    }

    /* @Override
    public S setData(String data, String value) {
    if(this.data == null) this.data = new LinkedHashMap<>();
    this.data.put(data.toLowerCase(), value);
    return self();
    }

    @Override
    public boolean hasData(String data) {
    if(this.data == null) return false;
    return this.data.containsKey(data);
    }

    @Override
    public String getData(String data) {
    if(this.data == null) return null;
    return this.data.get(data);
    }
     */
    @Override
    public void log(Object obj) {
        System.out.println(obj);
    }

    @Override
    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        if (this.styleClasses == null)
            this.styleClasses = new ArrayList<>();

        if (add)
            this.styleClasses.add(styleClass);
        else
            this.styleClasses.remove(styleClass);

        return self();
    }

    protected String id;

    protected String tooltip;

    protected String baseStyleClass;

    protected Map<String, String> attributes;

    protected List<String> styleClasses;

    protected Style inlineStyle;

    protected List<String> storeInElementOptions;

    protected DefaultWebBackendBaseComponent(O options) {
        super(options);
    }

    // Implementation
    // Implementation
    // Implementation
    public boolean onPreInitialize(O options) {
        this.styles.setStyleSheetFactory(WebBackendStyleSheet::new);
        return super.onPreInitialize(options);
    }

    // Implementation
    // Implementation
    // Implementation
    public void onInitialize(O options) {
        super.onInitialize(options);
        // Option values
        if (this.storeInElementOptions != null) {
            for (String opt : this.storeInElementOptions) {
                Object value = options.getOptionValue(opt);
                if (value != null)
                    /* value == null ? "null" : */
                    setData(opt, value.toString());

            }
        }
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
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }

    @Override
    public WebBackendComponentFactory getComponentFactory() {
        return ((WebBackendComponentFactory) (super.getComponentFactory()));
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public S setId(String id) {
        this.id = id;
        return self();
    }

    @Override
    public String getTooltip() {
        return tooltip;
    }

    @Override
    public S setTooltip(String tooltip) {
        this.tooltip = tooltip;
        return self();
    }

    @Override
    public String getBaseStyleClass() {
        return baseStyleClass;
    }

    @Override
    public S setBaseStyleClass(String baseStyleClass) {
        this.baseStyleClass = baseStyleClass;
        return self();
    }

    @Override
    public Map<String, String> getAttributes() {
        return attributes;
    }

    @Override
    public S setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return self();
    }

    @Override
    public List<String> getStyleClasses() {
        return styleClasses;
    }

    @Override
    public S setStyleClasses(List<String> styleClasses) {
        // Create copy of
        this.styleClasses = new ArrayList<String>(styleClasses);
        return self();
    }

    @Override
    public S addStyleClass(String styleClass) {
        if (this.styleClasses == null) {
            setStyleClasses(new ArrayList<String>());
        }
        this.styleClasses.add(styleClass);
        return self();
    }

    @Override
    public S setStyleClass(String styleClass) {
        setStyleClasses(new ArrayList<String>(Arrays.asList(styleClass)));
        return self();
    }

    @Override
    public S setStyleClasses(String... styleClasses) {
        setStyleClasses(new ArrayList<String>(Arrays.asList(styleClasses)));
        return self();
    }

    // Implementation
    @Override
    public S removeStyleClass(String styleClass) {
        if (this.styleClasses == null)
            this.styleClasses = new ArrayList<>();

        this.styleClasses.remove(styleClass);
        return self();
    }

    // Implementation
    @Override
    public boolean hasStyleClass(String styleClass) {
        return (this.styleClasses != null) && this.styleClasses.contains(styleClass);
    }

    @Override
    public S setStyleAllStates(Style style) {
        setStyle(ScreenSizeValues.of(style, style));
        setStyle(style);
        return self();
    }

    @Override
    public Style getInlineStyle() {
        return inlineStyle;
    }

    @Override
    public S setInlineStyle(Style inlineStyle) {
        this.inlineStyle = inlineStyle;
        return self();
    }

    @Override
    public List<String> getStoreInElementOptions() {
        return storeInElementOptions;
    }

    @Override
    public S setStoreInElementOptions(List<String> storeInElementOptions) {
        // Create copy of
        this.storeInElementOptions = new ArrayList<String>(storeInElementOptions);
        return self();
    }

    @Override
    public S addStoreInElementOptions(String storeInElementOptions) {
        if (this.storeInElementOptions == null) {
            setStoreInElementOptions(new ArrayList<String>());
        }
        this.storeInElementOptions.add(storeInElementOptions);
        return self();
    }

    @Override
    public S setStoreInElementOptions(String storeInElementOptions) {
        setStoreInElementOptions(new ArrayList<String>(Arrays.asList(storeInElementOptions)));
        return self();
    }

    @Override
    public S removeStoreInElementOptions(String storeInElementOptions) {
        this.storeInElementOptions.remove(storeInElementOptions);
        return self();
    }

    @Override
    public boolean hasStoreInElementOptions(String storeInElementOptions) {
        return this.storeInElementOptions.contains(storeInElementOptions);
    }

    @Override
    public S setMarginAllStates(Object margin) {
        setMargin(ScreenSizeValues.of(margin, margin));
        setMargin(margin);
        return self();
    }

    @Override
    public S setMarginTopAllStates(Object marginTop) {
        setMarginTop(ScreenSizeValues.of(marginTop, marginTop));
        setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginRightAllStates(Object marginRight) {
        setMarginRight(ScreenSizeValues.of(marginRight, marginRight));
        setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginBottomAllStates(Object marginBottom) {
        setMarginBottom(ScreenSizeValues.of(marginBottom, marginBottom));
        setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginLeftAllStates(Object marginLeft) {
        setMarginLeft(ScreenSizeValues.of(marginLeft, marginLeft));
        setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setWidthAllStates(Object width) {
        setWidth(ScreenSizeValues.of(width, width));
        setWidth(width);
        return self();
    }

    @Override
    public S setMinWidthAllStates(Object minWidth) {
        setMinWidth(ScreenSizeValues.of(minWidth, minWidth));
        setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMaxWidthAllStates(Object maxWidth) {
        setMaxWidth(ScreenSizeValues.of(maxWidth, maxWidth));
        setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setHeightAllStates(Object height) {
        setHeight(ScreenSizeValues.of(height, height));
        setHeight(height);
        return self();
    }

    @Override
    public S setMinHeightAllStates(Object minHeight) {
        setMinHeight(ScreenSizeValues.of(minHeight, minHeight));
        setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMaxHeightAllStates(Object maxHeight) {
        setMaxHeight(ScreenSizeValues.of(maxHeight, maxHeight));
        setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public S setVisibleAllStates(Boolean visible) {
        setVisible(ScreenSizeValues.of(visible, visible));
        setVisible(visible);
        return self();
    }

    // Implementation
    public void writeTo(PrintWriter writer) {
        writeStartTag(writer);
        writeEndTag(writer);
    }

    // Implementation
    public void writeStartTag(PrintWriter writer) {
        writeStartTag(writer, true);
    }

    // Implementation
    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        writeStartTag(writer, new HtmlWriterOptions.HtmlWriterStartTagOptions().setTagName(tagName).setClose(close));
    }

    // Implementation
    public void writeStartTag(PrintWriter writer, boolean close) {
        writeStartTag(writer, this.tagName, close);
    }

    // Implementation
    public void writeEndTag(PrintWriter writer) {
        writeEndTag(writer, this.tagName);
    }

    // Implementation
    public void writeEndTag(PrintWriter writer, String tagName) {
        writer.write(String.format("</%s>", tagName));
    }
}