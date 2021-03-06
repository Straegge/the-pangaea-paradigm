package com.the_pangaea_paradigm.ui.components.landingpage;

import com.the_pangaea_paradigm.ui.ProjectPage;
import com.the_pangaea_paradigm.ui.components.global.StyledComponent;
import com.the_pangaea_paradigm.ui.components.global.TPPRouterLink;
import com.the_pangaea_paradigm.utilities.Colors;
import com.the_pangaea_paradigm.utilities.GlobalConstants;
import com.vaadin.flow.component.HtmlComponent;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * The hero banner of the landing page.
 * (https://en.wikipedia.org/wiki/Hero_image)
 */
public final class Hero extends VerticalLayout implements StyledComponent {

    public Hero() {
        style();

        addLogo();
        addBannerText();
        addDelimiter();
        addSubtitle();
        addLinkToProjectPage();
    }

    private void addLogo() {
        HtmlComponent logo = new Image(GlobalConstants.LOGO, "TPP Logo");
        logo.getStyle().set("height", "200px");
        add(logo);
    }

    private void addBannerText() {
        HtmlComponent bannerText = new H1(
                "Find like-minded people. Organize yourselves. Change the world."
        );
        styleHeroText(bannerText);
        add(bannerText);
    }

    private void addDelimiter() {
        HtmlComponent delimiter = new Hr();
        delimiter.setWidth("100px");
        delimiter.setHeight("3px");
        delimiter.getStyle()
                .set("margin", "0 auto 0.3em auto")
                .set("background", "white");
        add(delimiter);
    }

    private void addSubtitle() {
        HtmlComponent subtitle = new H3(
                "Create action-oriented initiatives with people around the world."
        );
        styleHeroText(subtitle);
        add(subtitle);
    }

    private void addLinkToProjectPage() {
        TPPRouterLink linkToProjectPage = new TPPRouterLink("Browse Projects", ProjectPage.class);
        linkToProjectPage.getElement().getStyle()
                .set("margin-top", "50px");
        add(linkToProjectPage);
    }

    private void styleHeroText(HtmlComponent component) {
        component.setWidth("50%");
        component.getStyle()
                .set("margin", "0.9em 0em 0.8em 0em")
                .set("text-align", "center")
                .set("color", "white");
    }

    @Override
    public void style() {
        setWidthFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle()
                .set("height", "auto")
                .set("padding", "120px 0px")
                .set("background-color", Colors.TPP_BLUE_COLOR.toString());
    }
}
