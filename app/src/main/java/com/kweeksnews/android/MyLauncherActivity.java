// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.kweeksnews.android;

import android.content.Intent;

import com.google.androidbrowserhelper.trusted.LauncherActivity;
import com.google.androidbrowserhelper.trusted.TwaLauncher;

public class MyLauncherActivity extends LauncherActivity {

    @Override
    protected TwaLauncher.FallbackStrategy getFallbackStrategy() {
        return (context, twaIntentBuilder, mProviderPackage, completionCallback) -> {
            Intent intent = new Intent(context, WebViewFallbackActivity.class);
            intent.putExtra(WebViewFallbackActivity.KEY_LAUNCH_URI, twaIntentBuilder.getUri());
            startActivity(intent);
            completionCallback.run();
        };
    }
}
