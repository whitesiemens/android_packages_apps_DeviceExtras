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

package org.lineageos.settings.device.DeviceExtras;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import org.lineageos.settings.device.DeviceExtras.NDot.NDotHook;

public class SettingsLifecycle implements Application.ActivityLifecycleCallbacks {

    @Override
    public void onActivityCreated(Activity a, Bundle b) {
        NDotHook.hook(a);
    }

    @Override public void onActivityStarted(Activity a) {}
    @Override public void onActivityResumed(Activity a) {}
    @Override public void onActivityPaused(Activity a) {}
    @Override public void onActivityStopped(Activity a) {}
    @Override public void onActivitySaveInstanceState(Activity a, Bundle out) {}
    @Override public void onActivityDestroyed(Activity a) {}
    
}

