package com.example.myapp;

import static com.codename1.ui.CN.*;
import static com.codename1.ui.FontImage.createMaterial;

import com.codename1.components.SpanLabel;
import com.codename1.system.Lifecycle;
import com.codename1.ui.*;
import com.codename1.ui.layouts.*;
import com.codename1.io.*;
import com.codename1.ui.plaf.*;
import com.codename1.ui.util.Resources;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose
 * of building native mobile applications using Java.
 */
public class MyApp extends Lifecycle {

    @Override
    public void runApp() {
        Form hi = new Form("Tabs", new BorderLayout());

        Tabs t = new Tabs();
        t.setTabPlacement(Component.BOTTOM);
        Style s = UIManager.getInstance().getComponentStyle("Tab");
        FontImage icon1 = FontImage.createMaterial(FontImage.MATERIAL_HOME, s);

        Container container1 = BoxLayout.encloseY(new Label("Label1"), new Label("Label2"), new Label("Label3"));
        t.addTab("Tab1", icon1, container1);
        t.addTab("Tab2", new SpanLabel("Some text directly in the tab"));
        t.addTab("Tab3", new SpanLabel("in the tab"));
        t.addTab("Tab4", new SpanLabel("in the tab"));

        hi.add(BorderLayout.CENTER, t);

        hi.show();

    }

    private void hello() {
        Dialog.show("Hello Codename One", "Welcome to Codename One", "OK", null);
    }

}
