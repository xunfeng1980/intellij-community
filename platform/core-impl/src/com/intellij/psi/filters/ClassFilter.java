/*
 * Copyright 2000-2014 JetBrains s.r.o.
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

package com.intellij.psi.filters;

import com.intellij.psi.PsiElement;
import com.intellij.util.ReflectionUtil;
import org.jetbrains.annotations.NonNls;

public class ClassFilter implements ElementFilter{
  private final Class myFilter;
  private final boolean myAcceptableFlag;

  public ClassFilter(Class filter) {
    this(filter, true);
  }

  public ClassFilter(Class filter, boolean acceptableFlag){
    myFilter = filter;
    myAcceptableFlag = acceptableFlag;
  }

  @Override
  public boolean isClassAcceptable(Class hintClass){
    return myAcceptableFlag ? filterMatches(hintClass) : !filterMatches(hintClass);
  }

  private boolean filterMatches(final Class hintClass) {
    return ReflectionUtil.isAssignable(myFilter, hintClass);
  }

  @Override
  public boolean isAcceptable(Object element, PsiElement context){
    if(element == null){
      return false;
    }
    return myAcceptableFlag ? filterMatches(element.getClass()) : !filterMatches(element.getClass());
  }

  @NonNls
  public String toString(){
    return "class(" + myFilter.getName() + ")";
  }
}

