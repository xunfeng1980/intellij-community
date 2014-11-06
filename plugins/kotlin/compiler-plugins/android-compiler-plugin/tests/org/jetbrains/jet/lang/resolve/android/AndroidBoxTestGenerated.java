/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.lang.resolve.android;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.jet.JUnit3RunnerWithInners;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({AndroidBoxTestGenerated.Android.class, AndroidBoxTestGenerated.Invoke.class})
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidBoxTestGenerated extends AbstractAndroidBoxTest {
    @TestMetadata("plugins/android-compiler-plugin/testData/codegen/android")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Android extends AbstractAndroidBoxTest {
        public void testAllFilesPresentInAndroid() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-compiler-plugin/testData/codegen/android"), Pattern.compile("^([^\\.]+)$"), false);
        }

        @TestMetadata("fqNameInAttr")
        public void testFqNameInAttr() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/android/fqNameInAttr/");
            doCompileAgainstAndroidSdkTest(fileName);
        }

        @TestMetadata("fqNameInTag")
        public void testFqNameInTag() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/android/fqNameInTag/");
            doCompileAgainstAndroidSdkTest(fileName);
        }

        @TestMetadata("manyWidgets")
        public void testManyWidgets() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/android/manyWidgets/");
            doCompileAgainstAndroidSdkTest(fileName);
        }

        @TestMetadata("multiFile")
        public void testMultiFile() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/android/multiFile/");
            doCompileAgainstAndroidSdkTest(fileName);
        }

        @TestMetadata("singleFile")
        public void testSingleFile() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/android/singleFile/");
            doCompileAgainstAndroidSdkTest(fileName);
        }
    }

    @TestMetadata("plugins/android-compiler-plugin/testData/codegen/android")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Invoke extends AbstractAndroidBoxTest {
        public void testAllFilesPresentInInvoke() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-compiler-plugin/testData/codegen/android"), Pattern.compile("^([^\\.]+)$"), false);
        }

        @TestMetadata("fqNameInAttr")
        public void testFqNameInAttr() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/android/fqNameInAttr/");
            doFakeInvocationTest(fileName);
        }

        @TestMetadata("fqNameInTag")
        public void testFqNameInTag() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/android/fqNameInTag/");
            doFakeInvocationTest(fileName);
        }

        @TestMetadata("manyWidgets")
        public void testManyWidgets() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/android/manyWidgets/");
            doFakeInvocationTest(fileName);
        }

        @TestMetadata("multiFile")
        public void testMultiFile() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/android/multiFile/");
            doFakeInvocationTest(fileName);
        }

        @TestMetadata("singleFile")
        public void testSingleFile() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/android/singleFile/");
            doFakeInvocationTest(fileName);
        }
    }
}
