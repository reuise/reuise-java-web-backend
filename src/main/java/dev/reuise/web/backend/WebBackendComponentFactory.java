package dev.reuise.web.backend;
import dev.reuise.core.RootComponent;
import dev.reuise.core.accordion.CoreAccordionItemOptions;
import dev.reuise.core.accordion.CoreAccordionOptions;
import dev.reuise.core.applayout.CoreAppLayoutBodyOptions;
import dev.reuise.core.applayout.CoreAppLayoutOptions;
import dev.reuise.core.avatar.CoreAvatarOptions;
import dev.reuise.core.badge.CoreBadgeOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.bottomappbar.CoreBottomAppBarOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.card.CoreCardGridOptions;
import dev.reuise.core.card.CoreCardOptions;
import dev.reuise.core.checkbox.CoreBasicCheckboxOptions;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.chip.CoreChipGroupOptions;
import dev.reuise.core.chip.CoreChipOptions;
import dev.reuise.core.chip.CoreFilterChipOptions;
import dev.reuise.core.currencyselector.CoreCurrencySelectorOptions;
import dev.reuise.core.dialog.CoreDialogOptions;
import dev.reuise.core.dialog.CoreMessageDialogOptions;
import dev.reuise.core.divider.CoreDividerOptions;
import dev.reuise.core.drawer.CoreDrawerOptions;
import dev.reuise.core.dropzone.CoreDropZoneOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.input.CoreBasicInputFieldOptions;
import dev.reuise.core.input.CoreChipFieldOptions;
import dev.reuise.core.input.CoreMultiEmailAddressFieldOptions;
import dev.reuise.core.input.CorePasswordFieldOptions;
import dev.reuise.core.input.CoreSearchFieldOptions;
import dev.reuise.core.input.CoreSegmentedTextFieldOptions;
import dev.reuise.core.input.CoreTextFieldOptions;
import dev.reuise.core.layout.CoreColumnLayoutOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreFieldSetOptions;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.layout.CoreRowLayoutOptions;
import dev.reuise.core.layout.CoreSheetLayoutOptions;
import dev.reuise.core.layout.CoreSurfaceOptions;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.link.CoreNavigationLinkOptions;
import dev.reuise.core.list.CoreBasicListItemOptions;
import dev.reuise.core.list.CoreBasicListOptions;
import dev.reuise.core.list.CoreListItemOptions;
import dev.reuise.core.list.CoreListViewOptions;
import dev.reuise.core.media.CoreAudioPlayerOptions;
import dev.reuise.core.media.CoreMediaPlayerOptions;
import dev.reuise.core.media.CoreTextTrackOptions;
import dev.reuise.core.media.CoreVideoPlayerOptions;
import dev.reuise.core.menu.CoreMenuDividerOptions;
import dev.reuise.core.menu.CoreMenuItemOptions;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
import dev.reuise.core.progressindicator.CoreProgressIndicatorOptions;
import dev.reuise.core.regionselector.CoreRegionSelectorOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerEdgeOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollAreaOptions;
import dev.reuise.core.selectmenu.CoreSelectMenuOptions;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
import dev.reuise.core.slidecontainer.CoreSlideContainerEdgeOptions;
import dev.reuise.core.slidecontainer.CoreSlideContainerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerDividerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions;
import dev.reuise.core.table.CoreCheckboxTableCellOptions;
import dev.reuise.core.table.CoreCheckboxTableColumnOptions;
import dev.reuise.core.table.CoreTableBodyOptions;
import dev.reuise.core.table.CoreTableCellOptions;
import dev.reuise.core.table.CoreTableColumnGroupOptions;
import dev.reuise.core.table.CoreTableColumnOptions;
import dev.reuise.core.table.CoreTableFooterOptions;
import dev.reuise.core.table.CoreTableHeaderCellOptions;
import dev.reuise.core.table.CoreTableHeaderOptions;
import dev.reuise.core.table.CoreTableHeaderRowOptions;
import dev.reuise.core.table.CoreTableOptions;
import dev.reuise.core.table.CoreTableRowOptions;
import dev.reuise.core.tabs.CoreTabBarOptions;
import dev.reuise.core.tabs.CoreTabOptions;
import dev.reuise.core.text.CoreHeadingOptions;
import dev.reuise.core.text.CoreIconLabelOptions;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.text.CoreLabelOptions;
import dev.reuise.core.text.CoreLineBreakOptions;
import dev.reuise.core.text.CoreParagraphOptions;
import dev.reuise.core.text.CoreTextBlockOptions;
import dev.reuise.core.text.CoreTextOptions;
import dev.reuise.core.topappbar.CoreTopAppBarOptions;
import dev.reuise.core.view.CoreSheetViewOptions;
import dev.reuise.core.view.CoreViewOptions;
import dev.reuise.web.backend.accordion.WebBackendAccordion;
import dev.reuise.web.backend.accordion.WebBackendAccordionItem;
import dev.reuise.web.backend.accordion.WebBackendAccordionItemOptions;
import dev.reuise.web.backend.accordion.WebBackendAccordionOptions;
import dev.reuise.web.backend.applayout.WebBackendAppLayout;
import dev.reuise.web.backend.applayout.WebBackendAppLayoutBody;
import dev.reuise.web.backend.applayout.WebBackendAppLayoutBodyOptions;
import dev.reuise.web.backend.applayout.WebBackendAppLayoutOptions;
import dev.reuise.web.backend.avatar.WebBackendAvatar;
import dev.reuise.web.backend.avatar.WebBackendAvatarOptions;
import dev.reuise.web.backend.badge.WebBackendBadge;
import dev.reuise.web.backend.badge.WebBackendBadgeOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.bottomappbar.WebBackendBottomAppBar;
import dev.reuise.web.backend.bottomappbar.WebBackendBottomAppBarOptions;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.button.WebBackendIconButton;
import dev.reuise.web.backend.button.WebBackendIconButtonOptions;
import dev.reuise.web.backend.card.WebBackendCard;
import dev.reuise.web.backend.card.WebBackendCardGrid;
import dev.reuise.web.backend.card.WebBackendCardGridOptions;
import dev.reuise.web.backend.card.WebBackendCardOptions;
import dev.reuise.web.backend.checkbox.WebBackendBasicCheckbox;
import dev.reuise.web.backend.checkbox.WebBackendBasicCheckboxOptions;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.backend.checkbox.WebBackendCheckboxOptions;
import dev.reuise.web.backend.chip.WebBackendChip;
import dev.reuise.web.backend.chip.WebBackendChipGroup;
import dev.reuise.web.backend.chip.WebBackendChipGroupOptions;
import dev.reuise.web.backend.chip.WebBackendChipOptions;
import dev.reuise.web.backend.chip.WebBackendFilterChip;
import dev.reuise.web.backend.chip.WebBackendFilterChipOptions;
import dev.reuise.web.backend.currencyselector.WebBackendCurrencySelector;
import dev.reuise.web.backend.currencyselector.WebBackendCurrencySelectorOptions;
import dev.reuise.web.backend.dialog.WebBackendDialog;
import dev.reuise.web.backend.dialog.WebBackendDialogOptions;
import dev.reuise.web.backend.dialog.WebBackendMessageDialog;
import dev.reuise.web.backend.dialog.WebBackendMessageDialogOptions;
import dev.reuise.web.backend.divider.WebBackendDivider;
import dev.reuise.web.backend.divider.WebBackendDividerOptions;
import dev.reuise.web.backend.document.WebBackendDocument;
import dev.reuise.web.backend.document.WebBackendDocumentBody;
import dev.reuise.web.backend.document.WebBackendDocumentBodyOptions;
import dev.reuise.web.backend.document.WebBackendDocumentOptions;
import dev.reuise.web.backend.drawer.WebBackendDrawer;
import dev.reuise.web.backend.drawer.WebBackendDrawerOptions;
import dev.reuise.web.backend.dropzone.WebBackendDropZone;
import dev.reuise.web.backend.dropzone.WebBackendDropZoneOptions;
import dev.reuise.web.backend.filepicker.WebBackendFilePicker;
import dev.reuise.web.backend.filepicker.WebBackendFilePickerOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgGroup;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgGroupOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgImage;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgImageOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgPath;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgPathOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgRect;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgRectOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgShape;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgShapeOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgText;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgTextOptions;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.icon.WebBackendIconOptions;
import dev.reuise.web.backend.image.WebBackendImage;
import dev.reuise.web.backend.image.WebBackendImageOptions;
import dev.reuise.web.backend.input.WebBackendBasicInputField;
import dev.reuise.web.backend.input.WebBackendBasicInputFieldOptions;
import dev.reuise.web.backend.input.WebBackendChipField;
import dev.reuise.web.backend.input.WebBackendChipFieldOptions;
import dev.reuise.web.backend.input.WebBackendMultiEmailAddressField;
import dev.reuise.web.backend.input.WebBackendMultiEmailAddressFieldOptions;
import dev.reuise.web.backend.input.WebBackendPasswordField;
import dev.reuise.web.backend.input.WebBackendPasswordFieldOptions;
import dev.reuise.web.backend.input.WebBackendSearchField;
import dev.reuise.web.backend.input.WebBackendSearchFieldOptions;
import dev.reuise.web.backend.input.WebBackendSegmentedTextField;
import dev.reuise.web.backend.input.WebBackendSegmentedTextFieldOptions;
import dev.reuise.web.backend.input.WebBackendTextField;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
import dev.reuise.web.backend.layout.WebBackendColumnLayout;
import dev.reuise.web.backend.layout.WebBackendColumnLayoutOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFieldSet;
import dev.reuise.web.backend.layout.WebBackendFieldSetOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.layout.WebBackendRowLayout;
import dev.reuise.web.backend.layout.WebBackendRowLayoutOptions;
import dev.reuise.web.backend.layout.WebBackendSheetLayout;
import dev.reuise.web.backend.layout.WebBackendSheetLayoutOptions;
import dev.reuise.web.backend.layout.WebBackendSurface;
import dev.reuise.web.backend.layout.WebBackendSurfaceOptions;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
import dev.reuise.web.backend.link.WebBackendNavigationLink;
import dev.reuise.web.backend.link.WebBackendNavigationLinkOptions;
import dev.reuise.web.backend.list.WebBackendBasicList;
import dev.reuise.web.backend.list.WebBackendBasicListItem;
import dev.reuise.web.backend.list.WebBackendBasicListItemOptions;
import dev.reuise.web.backend.list.WebBackendBasicListOptions;
import dev.reuise.web.backend.list.WebBackendListItem;
import dev.reuise.web.backend.list.WebBackendListItemOptions;
import dev.reuise.web.backend.list.WebBackendListView;
import dev.reuise.web.backend.list.WebBackendListViewOptions;
import dev.reuise.web.backend.media.WebBackendAudioPlayer;
import dev.reuise.web.backend.media.WebBackendAudioPlayerOptions;
import dev.reuise.web.backend.media.WebBackendMediaPlayer;
import dev.reuise.web.backend.media.WebBackendMediaPlayerOptions;
import dev.reuise.web.backend.media.WebBackendTextTrack;
import dev.reuise.web.backend.media.WebBackendTextTrackOptions;
import dev.reuise.web.backend.media.WebBackendVideoPlayer;
import dev.reuise.web.backend.media.WebBackendVideoPlayerOptions;
import dev.reuise.web.backend.menu.WebBackendMenu;
import dev.reuise.web.backend.menu.WebBackendMenuDivider;
import dev.reuise.web.backend.menu.WebBackendMenuDividerOptions;
import dev.reuise.web.backend.menu.WebBackendMenuItem;
import dev.reuise.web.backend.menu.WebBackendMenuItemOptions;
import dev.reuise.web.backend.menu.WebBackendMenuOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.progressindicator.WebBackendProgressIndicator;
import dev.reuise.web.backend.progressindicator.WebBackendProgressIndicatorOptions;
import dev.reuise.web.backend.regionselector.WebBackendRegionSelector;
import dev.reuise.web.backend.regionselector.WebBackendRegionSelectorOptions;
import dev.reuise.web.backend.scriptcomponent.WebBackendScriptComponent;
import dev.reuise.web.backend.scriptcomponent.WebBackendScriptComponentOptions;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainer;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainerEdge;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainerEdgeOptions;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainerOptions;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainerScrollArea;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainerScrollAreaOptions;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenu;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuOptions;
import dev.reuise.web.backend.skeleton.WebBackendSkeleton;
import dev.reuise.web.backend.skeleton.WebBackendSkeletonOptions;
import dev.reuise.web.backend.slidecontainer.WebBackendSlideContainer;
import dev.reuise.web.backend.slidecontainer.WebBackendSlideContainerEdge;
import dev.reuise.web.backend.slidecontainer.WebBackendSlideContainerEdgeOptions;
import dev.reuise.web.backend.slidecontainer.WebBackendSlideContainerOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainer;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerDivider;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerDividerOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerPanel;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerPanelOptions;
import dev.reuise.web.backend.table.WebBackendCheckboxTableCell;
import dev.reuise.web.backend.table.WebBackendCheckboxTableCellOptions;
import dev.reuise.web.backend.table.WebBackendCheckboxTableColumn;
import dev.reuise.web.backend.table.WebBackendCheckboxTableColumnOptions;
import dev.reuise.web.backend.table.WebBackendTable;
import dev.reuise.web.backend.table.WebBackendTableBody;
import dev.reuise.web.backend.table.WebBackendTableBodyOptions;
import dev.reuise.web.backend.table.WebBackendTableCell;
import dev.reuise.web.backend.table.WebBackendTableCellOptions;
import dev.reuise.web.backend.table.WebBackendTableColumn;
import dev.reuise.web.backend.table.WebBackendTableColumnGroup;
import dev.reuise.web.backend.table.WebBackendTableColumnGroupOptions;
import dev.reuise.web.backend.table.WebBackendTableColumnOptions;
import dev.reuise.web.backend.table.WebBackendTableFooter;
import dev.reuise.web.backend.table.WebBackendTableFooterOptions;
import dev.reuise.web.backend.table.WebBackendTableHeader;
import dev.reuise.web.backend.table.WebBackendTableHeaderCell;
import dev.reuise.web.backend.table.WebBackendTableHeaderCellOptions;
import dev.reuise.web.backend.table.WebBackendTableHeaderOptions;
import dev.reuise.web.backend.table.WebBackendTableHeaderRow;
import dev.reuise.web.backend.table.WebBackendTableHeaderRowOptions;
import dev.reuise.web.backend.table.WebBackendTableOptions;
import dev.reuise.web.backend.table.WebBackendTableRow;
import dev.reuise.web.backend.table.WebBackendTableRowOptions;
import dev.reuise.web.backend.tabs.WebBackendTab;
import dev.reuise.web.backend.tabs.WebBackendTabBar;
import dev.reuise.web.backend.tabs.WebBackendTabBarOptions;
import dev.reuise.web.backend.tabs.WebBackendTabOptions;
import dev.reuise.web.backend.text.WebBackendHeading;
import dev.reuise.web.backend.text.WebBackendHeadingOptions;
import dev.reuise.web.backend.text.WebBackendIconLabel;
import dev.reuise.web.backend.text.WebBackendIconLabelOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.backend.text.WebBackendLabel;
import dev.reuise.web.backend.text.WebBackendLabelOptions;
import dev.reuise.web.backend.text.WebBackendLineBreak;
import dev.reuise.web.backend.text.WebBackendLineBreakOptions;
import dev.reuise.web.backend.text.WebBackendParagraph;
import dev.reuise.web.backend.text.WebBackendParagraphOptions;
import dev.reuise.web.backend.text.WebBackendText;
import dev.reuise.web.backend.text.WebBackendTextBlock;
import dev.reuise.web.backend.text.WebBackendTextBlockOptions;
import dev.reuise.web.backend.text.WebBackendTextOptions;
import dev.reuise.web.backend.topappbar.WebBackendTopAppBar;
import dev.reuise.web.backend.topappbar.WebBackendTopAppBarOptions;
import dev.reuise.web.backend.view.WebBackendRouteLayout;
import dev.reuise.web.backend.view.WebBackendRouteLayoutOptions;
import dev.reuise.web.backend.view.WebBackendSheetRouteLayout;
import dev.reuise.web.backend.view.WebBackendSheetRouteLayoutOptions;
import dev.reuise.web.backend.view.WebBackendSheetView;
import dev.reuise.web.backend.view.WebBackendSheetViewOptions;
import dev.reuise.web.backend.view.WebBackendView;
import dev.reuise.web.backend.view.WebBackendViewOptions;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.document.WebDocumentBodyOptions;
import dev.reuise.web.core.document.WebDocumentOptions;
import dev.reuise.web.core.filepicker.WebFilePickerOptions;
import dev.reuise.web.core.graphics.svg.WebSvgGroupOptions;
import dev.reuise.web.core.graphics.svg.WebSvgImageOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.graphics.svg.WebSvgPathOptions;
import dev.reuise.web.core.graphics.svg.WebSvgRectOptions;
import dev.reuise.web.core.graphics.svg.WebSvgShapeOptions;
import dev.reuise.web.core.graphics.svg.WebSvgTextOptions;
import dev.reuise.web.core.scriptcomponent.WebScriptComponentOptions;
import dev.reuise.web.core.view.WebRouteLayoutOptions;
import dev.reuise.web.core.view.WebSheetRouteLayoutOptions;
public interface WebBackendComponentFactory extends WebComponentFactory {
    WebBackendNavigationLink createNavigationLink(CoreNavigationLinkOptions options);

    WebBackendNavigationLinkOptions createNavigationLinkOptions();

    WebBackendSvgText createSvgText(WebSvgTextOptions options);

    WebBackendSvgTextOptions createSvgTextOptions();

    WebBackendAppLayout createAppLayout(CoreAppLayoutOptions options);

    WebBackendAppLayoutOptions createAppLayoutOptions();

    WebBackendFilterChip createFilterChip(CoreFilterChipOptions options);

    WebBackendFilterChipOptions createFilterChipOptions();

    WebBackendSvgImage createSvgImage(WebSvgImageOptions options);

    WebBackendSvgImageOptions createSvgImageOptions();

    WebBackendRouteLayout createRouteLayout(WebRouteLayoutOptions options);

    WebBackendRouteLayoutOptions createRouteLayoutOptions();

    WebBackendImage createImage(CoreImageOptions options);

    WebBackendImageOptions createImageOptions();

    WebBackendFilePicker createFilePicker(WebFilePickerOptions options);

    WebBackendFilePickerOptions createFilePickerOptions();

    WebBackendParagraph createParagraph(CoreParagraphOptions options);

    WebBackendParagraphOptions createParagraphOptions();

    WebBackendScriptComponent createScriptComponent(WebScriptComponentOptions options);

    WebBackendScriptComponentOptions createScriptComponentOptions();

    WebBackendTableRow createTableRow(CoreTableRowOptions options);

    WebBackendTableRowOptions createTableRowOptions();

    WebBackendText createText(CoreTextOptions options);

    WebBackendTextOptions createTextOptions();

    WebBackendRegionSelector createRegionSelector(CoreRegionSelectorOptions options);

    WebBackendRegionSelectorOptions createRegionSelectorOptions();

    WebBackendBaseComponent createBaseComponent(CoreBaseComponentPartOptions options);

    WebBackendBaseComponentOptions createBaseComponentOptions();

    WebBackendAccordion createAccordion(CoreAccordionOptions options);

    WebBackendAccordionOptions createAccordionOptions();

    WebBackendDrawer createDrawer(CoreDrawerOptions options);

    WebBackendDrawerOptions createDrawerOptions();

    WebBackendBasicListItem createBasicListItem(CoreBasicListItemOptions options);

    WebBackendBasicListItemOptions createBasicListItemOptions();

    WebBackendLabel createLabel(CoreLabelOptions options);

    WebBackendLabelOptions createLabelOptions();

    WebBackendFlexContainer createFlexContainer(CoreFlexContainerOptions options);

    WebBackendFlexContainerOptions createFlexContainerOptions();

    WebBackendLink createLink(CoreLinkOptions options);

    WebBackendLinkOptions createLinkOptions();

    WebBackendMultiEmailAddressField createMultiEmailAddressField(CoreMultiEmailAddressFieldOptions options);

    WebBackendMultiEmailAddressFieldOptions createMultiEmailAddressFieldOptions();

    WebBackendTableCell createTableCell(CoreTableCellOptions options);

    WebBackendTableCellOptions createTableCellOptions();

    WebBackendButton createButton(CoreButtonOptions options);

    WebBackendButtonOptions createButtonOptions();

    WebBackendTableHeaderCell createTableHeaderCell(CoreTableHeaderCellOptions options);

    WebBackendTableHeaderCellOptions createTableHeaderCellOptions();

    WebBackendIconLabel createIconLabel(CoreIconLabelOptions options);

    WebBackendIconLabelOptions createIconLabelOptions();

    WebBackendColumnLayout createColumnLayout(CoreColumnLayoutOptions options);

    WebBackendColumnLayoutOptions createColumnLayoutOptions();

    WebBackendSlideContainer createSlideContainer(CoreSlideContainerOptions options);

    WebBackendSlideContainerOptions createSlideContainerOptions();

    WebBackendMenuDivider createMenuDivider(CoreMenuDividerOptions options);

    WebBackendMenuDividerOptions createMenuDividerOptions();

    WebBackendSegmentedTextField createSegmentedTextField(CoreSegmentedTextFieldOptions options);

    WebBackendSegmentedTextFieldOptions createSegmentedTextFieldOptions();

    WebBackendInlineText createInlineText(CoreInlineTextOptions options);

    WebBackendInlineTextOptions createInlineTextOptions();

    WebBackendSheetView createSheetView(CoreSheetViewOptions options);

    WebBackendSheetViewOptions createSheetViewOptions();

    WebBackendListView createListView(CoreListViewOptions options);

    WebBackendListViewOptions createListViewOptions();

    WebBackendMessageDialog createMessageDialog(CoreMessageDialogOptions options);

    WebBackendMessageDialogOptions createMessageDialogOptions();

    WebBackendAvatar createAvatar(CoreAvatarOptions options);

    WebBackendAvatarOptions createAvatarOptions();

    WebBackendSplitContainerPanel createSplitContainerPanel(CoreSplitContainerPanelOptions options);

    WebBackendSplitContainerPanelOptions createSplitContainerPanelOptions();

    WebBackendTableHeaderRow createTableHeaderRow(CoreTableHeaderRowOptions options);

    WebBackendTableHeaderRowOptions createTableHeaderRowOptions();

    WebBackendDocumentBody createDocumentBody(WebDocumentBodyOptions options);

    WebBackendDocumentBodyOptions createDocumentBodyOptions();

    WebBackendMediaPlayer createMediaPlayer(CoreMediaPlayerOptions options);

    WebBackendMediaPlayerOptions createMediaPlayerOptions();

    WebBackendTable createTable(CoreTableOptions options);

    WebBackendTableOptions createTableOptions();

    WebBackendAudioPlayer createAudioPlayer(CoreAudioPlayerOptions options);

    WebBackendAudioPlayerOptions createAudioPlayerOptions();

    WebBackendSvgGroup createSvgGroup(WebSvgGroupOptions options);

    WebBackendSvgGroupOptions createSvgGroupOptions();

    WebBackendCheckbox createCheckbox(CoreCheckboxOptions options);

    WebBackendCheckboxOptions createCheckboxOptions();

    WebBackendMenuItem createMenuItem(CoreMenuItemOptions options);

    WebBackendMenuItemOptions createMenuItemOptions();

    WebBackendTopAppBar createTopAppBar(CoreTopAppBarOptions options);

    WebBackendTopAppBarOptions createTopAppBarOptions();

    WebBackendBadge createBadge(CoreBadgeOptions options);

    WebBackendBadgeOptions createBadgeOptions();

    WebBackendFieldSet createFieldSet(CoreFieldSetOptions options);

    WebBackendFieldSetOptions createFieldSetOptions();

    WebBackendSvgShape createSvgShape(WebSvgShapeOptions options);

    WebBackendSvgShapeOptions createSvgShapeOptions();

    WebBackendTextField createTextField(CoreTextFieldOptions options);

    WebBackendTextFieldOptions createTextFieldOptions();

    WebBackendVideoPlayer createVideoPlayer(CoreVideoPlayerOptions options);

    WebBackendVideoPlayerOptions createVideoPlayerOptions();

    WebBackendTableFooter createTableFooter(CoreTableFooterOptions options);

    WebBackendTableFooterOptions createTableFooterOptions();

    WebBackendTextTrack createTextTrack(CoreTextTrackOptions options);

    WebBackendTextTrackOptions createTextTrackOptions();

    WebBackendSheetLayout createSheetLayout(CoreSheetLayoutOptions options);

    WebBackendSheetLayoutOptions createSheetLayoutOptions();

    WebBackendSkeleton createSkeleton(CoreSkeletonOptions options);

    WebBackendSkeletonOptions createSkeletonOptions();

    WebBackendHeading createHeading(CoreHeadingOptions options);

    WebBackendHeadingOptions createHeadingOptions();

    WebBackendSplitContainerDivider createSplitContainerDivider(CoreSplitContainerDividerOptions options);

    WebBackendSplitContainerDividerOptions createSplitContainerDividerOptions();

    WebBackendMenu createMenu(CoreMenuOptions options);

    WebBackendMenuOptions createMenuOptions();

    WebBackendLineBreak createLineBreak(CoreLineBreakOptions options);

    WebBackendLineBreakOptions createLineBreakOptions();

    WebBackendContainer createContainer(CoreContainerOptions options);

    WebBackendContainerOptions createContainerOptions();

    WebBackendChipGroup createChipGroup(CoreChipGroupOptions options);

    WebBackendChipGroupOptions createChipGroupOptions();

    WebBackendSheetRouteLayout createSheetRouteLayout(WebSheetRouteLayoutOptions options);

    WebBackendSheetRouteLayoutOptions createSheetRouteLayoutOptions();

    WebBackendTabBar createTabBar(CoreTabBarOptions options);

    WebBackendTabBarOptions createTabBarOptions();

    WebBackendTableColumn createTableColumn(CoreTableColumnOptions options);

    WebBackendTableColumnOptions createTableColumnOptions();

    WebBackendCurrencySelector createCurrencySelector(CoreCurrencySelectorOptions options);

    WebBackendCurrencySelectorOptions createCurrencySelectorOptions();

    WebBackendDialog createDialog(CoreDialogOptions options);

    WebBackendDialogOptions createDialogOptions();

    WebBackendPasswordField createPasswordField(CorePasswordFieldOptions options);

    WebBackendPasswordFieldOptions createPasswordFieldOptions();

    WebBackendSearchField createSearchField(CoreSearchFieldOptions options);

    WebBackendSearchFieldOptions createSearchFieldOptions();

    WebBackendCardGrid createCardGrid(CoreCardGridOptions options);

    WebBackendCardGridOptions createCardGridOptions();

    WebBackendScrollableContainer createScrollableContainer(CoreScrollableContainerOptions options);

    WebBackendScrollableContainerOptions createScrollableContainerOptions();

    WebBackendScrollableContainerScrollArea createScrollableContainerScrollArea(CoreScrollableContainerScrollAreaOptions options);

    WebBackendScrollableContainerScrollAreaOptions createScrollableContainerScrollAreaOptions();

    WebBackendBottomAppBar createBottomAppBar(CoreBottomAppBarOptions options);

    WebBackendBottomAppBarOptions createBottomAppBarOptions();

    WebBackendSelectMenu createSelectMenu(CoreSelectMenuOptions options);

    WebBackendSelectMenuOptions createSelectMenuOptions();

    WebBackendCard createCard(CoreCardOptions options);

    WebBackendCardOptions createCardOptions();

    WebBackendView createView(CoreViewOptions options);

    WebBackendViewOptions createViewOptions();

    WebBackendSplitContainer createSplitContainer(CoreSplitContainerOptions options);

    WebBackendSplitContainerOptions createSplitContainerOptions();

    WebBackendSlideContainerEdge createSlideContainerEdge(CoreSlideContainerEdgeOptions options);

    WebBackendSlideContainerEdgeOptions createSlideContainerEdgeOptions();

    WebBackendDropZone createDropZone(CoreDropZoneOptions options);

    WebBackendDropZoneOptions createDropZoneOptions();

    WebBackendChip createChip(CoreChipOptions options);

    WebBackendChipOptions createChipOptions();

    WebBackendAccordionItem createAccordionItem(CoreAccordionItemOptions options);

    WebBackendAccordionItemOptions createAccordionItemOptions();

    WebBackendAppLayoutBody createAppLayoutBody(CoreAppLayoutBodyOptions options);

    WebBackendAppLayoutBodyOptions createAppLayoutBodyOptions();

    WebBackendIcon createIcon(CoreIconOptions options);

    WebBackendIconOptions createIconOptions();

    WebBackendBasicInputField createBasicInputField(CoreBasicInputFieldOptions options);

    WebBackendBasicInputFieldOptions createBasicInputFieldOptions();

    WebBackendSvgPath createSvgPath(WebSvgPathOptions options);

    WebBackendSvgPathOptions createSvgPathOptions();

    WebBackendTableHeader createTableHeader(CoreTableHeaderOptions options);

    WebBackendTableHeaderOptions createTableHeaderOptions();

    WebBackendTableBody createTableBody(CoreTableBodyOptions options);

    WebBackendTableBodyOptions createTableBodyOptions();

    WebBackendTableColumnGroup createTableColumnGroup(CoreTableColumnGroupOptions options);

    WebBackendTableColumnGroupOptions createTableColumnGroupOptions();

    WebBackendSurface createSurface(CoreSurfaceOptions options);

    WebBackendSurfaceOptions createSurfaceOptions();

    WebBackendSvgRect createSvgRect(WebSvgRectOptions options);

    WebBackendSvgRectOptions createSvgRectOptions();

    WebBackendTextBlock createTextBlock(CoreTextBlockOptions options);

    WebBackendTextBlockOptions createTextBlockOptions();

    WebBackendCheckboxTableCell createCheckboxTableCell(CoreCheckboxTableCellOptions options);

    WebBackendCheckboxTableCellOptions createCheckboxTableCellOptions();

    WebBackendDivider createDivider(CoreDividerOptions options);

    WebBackendDividerOptions createDividerOptions();

    WebBackendCheckboxTableColumn createCheckboxTableColumn(CoreCheckboxTableColumnOptions options);

    WebBackendCheckboxTableColumnOptions createCheckboxTableColumnOptions();

    WebBackendProgressIndicator createProgressIndicator(CoreProgressIndicatorOptions options);

    WebBackendProgressIndicatorOptions createProgressIndicatorOptions();

    WebBackendScrollableContainerEdge createScrollableContainerEdge(CoreScrollableContainerEdgeOptions options);

    WebBackendScrollableContainerEdgeOptions createScrollableContainerEdgeOptions();

    WebBackendSvg createSvg(WebSvgOptions options);

    WebBackendSvgOptions createSvgOptions();

    WebBackendRowLayout createRowLayout(CoreRowLayoutOptions options);

    WebBackendRowLayoutOptions createRowLayoutOptions();

    WebBackendIconButton createIconButton(CoreIconButtonOptions options);

    WebBackendIconButtonOptions createIconButtonOptions();

    WebBackendDocument createDocument(WebDocumentOptions options);

    WebBackendDocumentOptions createDocumentOptions();

    WebBackendParentComponent createParentComponent(CoreParentComponentPartOptions options);

    WebBackendParentComponentOptions createParentComponentOptions();

    WebBackendTab createTab(CoreTabOptions options);

    WebBackendTabOptions createTabOptions();

    WebBackendListItem createListItem(CoreListItemOptions options);

    WebBackendListItemOptions createListItemOptions();

    WebBackendBasicList createBasicList(CoreBasicListOptions options);

    WebBackendBasicListOptions createBasicListOptions();

    WebBackendBasicCheckbox createBasicCheckbox(CoreBasicCheckboxOptions options);

    WebBackendBasicCheckboxOptions createBasicCheckboxOptions();

    WebBackendChipField createChipField(CoreChipFieldOptions options);

    WebBackendChipFieldOptions createChipFieldOptions();

    void setRootComponent(RootComponent rootComponent);

    RootComponent getRootComponent();
}
