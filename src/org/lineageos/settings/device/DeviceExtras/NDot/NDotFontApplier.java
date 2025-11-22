/*
     Copyright (C) 2025 whitesiemens

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at
          http://www.apache.org/licenses/LICENSE-2.0
     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
*/

package org.lineageos.settings.device.DeviceExtras.NDot;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import java.util.List;

public class NDotFontApplier {

    public static void apply(Activity a) {
        if (!NDotFontState.enabled(a)) return;

        int id = a.getResources().getIdentifier(
                "entity_header_title",
                "id",
                a.getPackageName()
        );

        if (id != 0) {
            TextView title = a.findViewById(id);
            if (title != null) {
                Typeface tf = ResourcesCompat.getFont(a, R.font.ndot);
                title.setTypeface(tf);
            }
        }
    }

    public static void refreshAll() {
        
    }
}
