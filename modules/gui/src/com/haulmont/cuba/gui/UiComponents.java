/*
 * Copyright (c) 2008-2018 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.haulmont.cuba.gui;

import com.google.common.reflect.TypeToken;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.gui.components.Component;

/**
 * todo unit tests!
 *
 * Factory to create UI components in client independent manner.
 *
 * <br> An instance of the factory can be injected into screen controllers or obtained through {@link AppBeans}.
 */
public interface UiComponents {

    String NAME = "cuba_UiComponents";

    /**
     * Create a component instance by its name.
     *
     * @param name component name. It is usually defined in NAME constant inside the component interface,
     *             e.g. {@link com.haulmont.cuba.gui.components.Label#NAME}.
     *             It is also usually equal to component's XML name.
     * @return component instance for the current client type (web or desktop)
     */
    <T extends Component> T create(String name);

    /**
     * Create a component instance by its type.
     *
     * @param type component type
     * @return component instance for the current client type (web or desktop)
     */
    <T extends Component> T create(Class<T> type);

    /**
     * Create a component instance by its type.
     *
     * @param type component type token
     * @return component instance for the current client type (web or desktop)
     *
     * @see com.haulmont.cuba.gui.components.Label#TYPE_DEFAULT
     * @see com.haulmont.cuba.gui.components.TextField#TYPE_DEFAULT
     */
    <T extends Component> T create(TypeToken<T> type);
}