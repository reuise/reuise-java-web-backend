package dev.reuise.web.backend.style;
import dev.reuise.core.Interaction;
import dev.reuise.core.MediaQuery;
import dev.reuise.core.State;
import dev.reuise.web.core.style.StyleOptions;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleSheet;
import java.util.HashMap;
import java.util.Map;
public class WebBackendStyleSheet implements StyleSheet {
    public WebBackendStyleSheet(State state) {
        if (state != null) {
            stateKey = getStateKey();
            if (state instanceof MediaQuery)
                stateQuery = ((MediaQuery) (state)).getQuery();

        }
    }

    private String stateKey = "";

    private Map<String, Style> rules = new HashMap();

    private Map<String, StyleSheet> atRules = new HashMap();

    private String stateQuery = "";

    public Map<String, Style> getRules() {
        return rules;
    }

    public Style getRule(String rule, State state) {
        if (state instanceof Interaction interactionState) {
            return rules.get(interactionState.getSelector(rule));
        }
        return rules.get(rule);
    }

    public Map<String, StyleSheet> getAtRules() {
        return atRules;
    }

    public String getStateQuery() {
        return stateQuery;
    }

    @Override
    public boolean equals(Object other) {
        if ((other instanceof WebBackendStyleSheet) != true)
            return false;

        if (other == this)
            return true;

        return stateQuery.equals(((WebBackendStyleSheet) (other)).getStateQuery());
    }

    @Override
    public int hashCode() {
        return stateQuery.hashCode();
    }

    public WebBackendStyleSheet() {
    }

    @Override
    public Style addRule(String rule, State state) {
        String selector = null;
        if (state instanceof Interaction)
            selector = ((Interaction) (state)).getSelector(rule);
        else
            selector = rule;

        Style style = getRule(rule);
        if (style == null) {
            style = new StyleOptions();
            setRule(selector, style);
        }
        return style;
    }

    @Override
    public Style addRule(String rule) {
        return addRule(rule, null);
    }

    @Override
    public StyleSheet addAtRule(String atRule, State state) {
        String selector = null;
        if (state instanceof Interaction)
            selector = ((Interaction) (state)).getSelector(atRule);
        else
            selector = atRule;

        StyleSheet styleSheet = getAtRule(atRule);
        if (styleSheet == null) {
            styleSheet = new WebBackendStyleSheet();
            setAtRule(selector, styleSheet);
        }
        return styleSheet;
    }

    @Override
    public StyleSheet addAtRule(String atRule) {
        return addAtRule(atRule, null);
    }

    @Override
    public String getStateKey() {
        return stateKey;
    }

    public Style getRule(String rule) {
        if (rule == null)
            return null;

        return rules.get(rule);
    }

    @Override
    public void setRule(String rule, Style style) {
        if (rule == null)
            return;

        if (style == null)
            return;

        rules.put(rule, style);
    }

    public StyleSheet getAtRule(String atRule) {
        if (atRule == null)
            return null;

        return atRules.get(atRule);
    }

    @Override
    public void setAtRule(String atRule, StyleSheet styleSheet) {
        if (atRule == null)
            return;

        if (styleSheet == null)
            return;

        atRules.put(atRule, styleSheet);
    }

    @Override
    public void appendRule(String rule, Style style) {
        if (rule == null)
            return;

        if ((style == null) || (style.hasProperties() == false))
            return;

        Style existingStyle = getRule(rule);
        if (existingStyle != null) {
            existingStyle.append(style);
        } else {
            setRule(rule, style);
        }
    }

    @Override
    public String getCssText() {
        StringBuilder sb = new StringBuilder();
        rules.entrySet().stream().forEach((Map.Entry<String, Style> r) -> sb.append(((r.getKey() + "{") + r.getValue().getCssText()) + "}"));
        atRules.entrySet().stream().forEach((Map.Entry<String, StyleSheet> r) -> sb.append(((("@" + r.getKey()) + "{") + r.getValue().getCssText()) + "}"));
        return sb.toString();
    }
}