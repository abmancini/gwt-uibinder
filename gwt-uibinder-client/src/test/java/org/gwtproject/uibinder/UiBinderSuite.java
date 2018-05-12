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
package org.gwtproject.uibinder;

import org.gwtproject.uibinder.client.UiBinderUtilTest;

import com.google.gwt.junit.tools.GWTTestSuite;
import org.gwtproject.uibinder.client.UiBinderUtilTest;
import org.gwtproject.uibinder.test.client.InnerWidgetTest;
import org.gwtproject.uibinder.test.client.ParameterizedWidgetsTest;
//import com.google.gwt.uibinder.client.client.SafeUriIntegrationTest;
//import com.google.gwt.uibinder.client.client.UiBinderTest;
//import com.google.gwt.uibinder.client.client.UiChildTest;
//import com.google.gwt.uibinder.client.client.UiHandlerTest;
//import com.google.gwt.uibinder.client.client.gss.UiBinderWithGssTest;

import junit.framework.Test;

/**
 * Test suite for UiBinder GWTTestCases.
 */
public class UiBinderSuite {
  public static Test suite() {
    GWTTestSuite suite = new GWTTestSuite(
        "Integration tests for UiBinder");

    suite.addTestSuite(InnerWidgetTest.class);
    suite.addTestSuite(ParameterizedWidgetsTest.class);
    //suite.addTestSuite(SafeUriIntegrationTest.class);
    //suite.addTestSuite(UiBinderTest.class);
    suite.addTestSuite(UiBinderUtilTest.class);
    //suite.addTestSuite(UiChildTest.class);
    //suite.addTestSuite(UiHandlerTest.class);
    //suite.addTestSuite(UiBinderWithGssTest.class);

    return suite;
  }

  private UiBinderSuite() {
  }
}