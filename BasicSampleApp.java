package com.example.brightcoveplayer;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import com.brightcove.player.view.BrightcoveVideoView;

public class BasicSampleApp extends AppCompatActivity {

    private BrightcoveVideoView brightcoveVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brightcoveVideoView = findViewById(R.id.brightcove_video_view);

        brightcoveVideoView.add(new Video.Builder()
            .url("https://fastly.live.brightcove.com/6376826200112/eu-central-1/6415809151001/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJob3N0IjoieWlod3RhLmVncmVzcy5haGc3NmwiLCJhY2NvdW50X2lkIjoiNjQxNTgwOTE1MTAwMSIsImVobiI6ImZhc3RseS5saXZlLmJyaWdodGNvdmUuY29tIiwiaXNzIjoiYmxpdmUtcGxheWJhY2stc291cmNlLWFwaSIsInN1YiI6InBhdGhtYXB0b2tlbiIsImF1ZCI6WyI2NDE1ODA5MTUxMDAxIl0sImp0aSI6IjYzNzY4MjYyMDAxMTIifQ.EBaDAQiDkyoRKYIjLROyrZzKFPcftOUxk4ftmhtVsEk/playlist-hls-dvr.m3u8") // ← use the playback URL here
            .build());
        brightcoveVideoView.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        brightcoveVideoView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        brightcoveVideoView.resume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        brightcoveVideoView.destroy();
    }
}