/*
 * Copyright 2018 Vertispan LLC
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
package org.gwtproject.uibinder.example.tutorial.impl;

import javax.inject.Inject;

//import org.gwtproject.uibinder.client.UiBinder;
//import org.gwtproject.uibinder.client.UiField;
//import org.gwtproject.uibinder.client.UiTemplate;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
//import com.google.gwt.uibinder.client.UiTemplate;

import org.gwtproject.uibinder.example.tutorial.Sample1View;

import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 */
public class Sample1ViewImpl implements Sample1View {

  //@UiTemplate
  interface MyUiBinder extends UiBinder<Widget, Sample1ViewImpl> {
  }

  private MyUiBinder uiBinder = GWT.create(MyUiBinder.class);//new Sample1ViewImpl_MyUiBinderImpl();

  private Widget widget;

  @Inject
  public Sample1ViewImpl() {
  }

  @Override
  public Widget asWidget() {
    if (widget == null) {
      widget = /*new WidgetWrapper(*/uiBinder.createAndBindUi(this)/*)*/;
    }

    Timer t = new Timer() {
        @Override
        public void run() {
            setName("Name SET");
        }
    };

    t.schedule(1001);
    return widget;
  }


    @UiField
    Element nameSpan;
     //SpanElement nameSpan;

    public void setName(String name) { nameSpan.setInnerText(name); }

//    static class WidgetWrapper extends Widget {
//        WidgetWrapper(Element e) {
//            setElement(e);
//        }
//    }


}
