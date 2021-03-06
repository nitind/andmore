/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.andmore.internal.editors.values.descriptors;

import org.eclipse.andmore.internal.editors.descriptors.TextValueDescriptor;
import org.eclipse.andmore.internal.editors.uimodel.UiAttributeNode;
import org.eclipse.andmore.internal.editors.uimodel.UiElementNode;
import org.eclipse.andmore.internal.editors.uimodel.UiResourceAttributeNode;
import org.eclipse.andmore.internal.editors.values.uimodel.UiColorValueNode;

/**
 * Describes a Color XML element value displayed by an {@link UiColorValueNode}.
 */
public final class ColorValueDescriptor extends TextValueDescriptor {

    public ColorValueDescriptor(String uiName, String tooltip) {
        super(uiName, tooltip);
    }

    /**
     * @return A new {@link UiResourceAttributeNode} linked to this theme descriptor.
     */
    @Override
    public UiAttributeNode createUiNode(UiElementNode uiParent) {
        return new UiColorValueNode(this, uiParent);
    }
}
