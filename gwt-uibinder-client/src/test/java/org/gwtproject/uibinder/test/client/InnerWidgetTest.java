/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.uibinder.test.client;

import org.gwtproject.uibinder.client.UiTemplate;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;

/**
 * Test that UiBinder picks the correct template file for inner classes.
 */
public class InnerWidgetTest extends GWTTestCase {

  static class InnerWidget extends Composite {
    @UiTemplate("org.gwtproject.uibinder.test.client.InnerWidgetTest_InnerWidget.ui.xml")
    interface Binder extends UiBinder<Label, InnerWidget> {
    }


    static final Binder binder = new InnerWidgetTest_InnerWidget_BinderImpl();

    @UiField Label greeting;
  
    InnerWidget() {
      initWidget(binder.createAndBindUi(this));
    }
  }

  @Override
  public String getModuleName() {
    return "org.gwtproject.uibinder.test.UiBinderSuite";
  }

  public void testHappy() {
    InnerWidget widget = new InnerWidget();
    assertNotNull(widget.greeting);
  }
}