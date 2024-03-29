package com.jentis.example;

import android.app.Application;

import com.jentis.tracking.sdk.JentisTrackService;
import com.jentis.tracking.sdk.JentisTrackConfig;

public class JentisApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JentisTrackService.getInstance().initTracking(this, new JentisTrackConfig(getString(R.string.jentis_track_domain), getString(R.string.jentis_track_id), getString(R.string.jentis_environment)));
    }
}
