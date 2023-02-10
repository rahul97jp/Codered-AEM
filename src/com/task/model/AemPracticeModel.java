package com.task.model;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import javax.inject.Inject;
import javax.inject.Named;


@Model(adaptables = Resource.class)
public class AemPracticeModel {

    @Inject
    private String imagePath;

    @Inject
    private boolean backgroundImage;

    @Inject
    @Named("navigationItems")
    private List<NavigationItem> navigationItems;

    public String getImagePath() {
        return imagePath;
    }

    public boolean isBackgroundImage() {
        return backgroundImage;
    }

    public List<NavigationItem> getNavigationItems() {
        return navigationItems;
    }

    public static class NavigationItem {
        private String title;
        private String path;

        public NavigationItem(String title, String path) {
            this.title = title;
            this.path = path;
        }

        public String getTitle() {
            return title;
        }

        public String getPath() {
            return path;
        }
    }
}

