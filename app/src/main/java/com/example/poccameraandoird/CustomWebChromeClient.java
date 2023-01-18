package com.example.poccameraandoird;

import android.app.Activity;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;

public class CustomWebChromeClient extends WebChromeClient {
    private Activity activity;

    public CustomWebChromeClient(Activity parentActivity) {
        super();
        activity = parentActivity;
    }

    @Override
    public void onPermissionRequest(final PermissionRequest request) {
        activity.runOnUiThread(() -> request.grant(request.getResources()));
    }
}
