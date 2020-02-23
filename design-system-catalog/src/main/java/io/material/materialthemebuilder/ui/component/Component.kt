/*
 * Copyright 2019 The Android Open Source Project
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

package io.material.materialthemebuilder.ui.component

import io.material.materialthemebuilder.ui.component.Component.BOTTOM_APP_BAR
import io.material.materialthemebuilder.ui.component.Component.BOTTOM_NAVIGATION
import io.material.materialthemebuilder.ui.component.Component.BOTTOM_SHEET
import io.material.materialthemebuilder.ui.component.Component.BUTTON
import io.material.materialthemebuilder.ui.component.Component.CARD
import io.material.materialthemebuilder.ui.component.Component.CHECKBOX
import io.material.materialthemebuilder.ui.component.Component.CHIP
import io.material.materialthemebuilder.ui.component.Component.DIALOG
import io.material.materialthemebuilder.ui.component.Component.DRAWER
import io.material.materialthemebuilder.ui.component.Component.FAB
import io.material.materialthemebuilder.ui.component.Component.RADIO_BUTTON
import io.material.materialthemebuilder.ui.component.Component.SNACKBAR
import io.material.materialthemebuilder.ui.component.Component.SWITCH
import io.material.materialthemebuilder.ui.component.Component.TABS
import io.material.materialthemebuilder.ui.component.Component.TEXT_FIELD
import io.material.materialthemebuilder.ui.component.Component.TOP_APP_BAR

/**
 * Enumeration of all components to be displayed by [ComponentAdapter].
 *
 * All components in this enum will be shown by [ComponentAdapter]. The order of the components
 * here will be the order they are displayed in by [ComponentAdapter].
 */
enum class Component {
  BUTTON,
  CARD,
  TEXT_FIELD,
  CHIP,
  BOTTOM_NAVIGATION,
  SWITCH,
  RADIO_BUTTON,
  CHECKBOX,
  BOTTOM_APP_BAR,
  TABS,
  SNACKBAR,
  DIALOG,
  BOTTOM_SHEET,
  FAB,
  DRAWER,
  TOP_APP_BAR,
}

val ComponentsToShow = listOf(
    BUTTON,
    CARD,
    TEXT_FIELD,
    CHIP,
    BOTTOM_NAVIGATION,
    SWITCH,
    RADIO_BUTTON,
    CHECKBOX,
    BOTTOM_APP_BAR,
    TABS,
    SNACKBAR,
    DIALOG,
    BOTTOM_SHEET,
    FAB,
    DRAWER,
    TOP_APP_BAR
)