package com.acadgild.com.session6_assignnment4;


import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment  {


    VideoView videoView;
    MediaController mediaController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_video, container, false);
        return v;

    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {


        super.onActivityCreated(savedInstanceState);

        videoView =(VideoView)getActivity().findViewById(R.id.videoView1);
        
        mediaController= new MediaController(getActivity());
        mediaController.setAnchorView(videoView);

        //specify the location of media file
        videoView.setMediaController(mediaController);
        Uri uri=Uri.parse("android.resource://" + "com.acadgild.com.session6_assignnment4" + "/" + R.raw.videofile);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.canPause();
        videoView.canSeekForward();
        videoView.canSeekBackward();
        if(!videoView.isPlaying()) {
            videoView.stopPlayback();
        }
        else
        {
            videoView.start();
        }




    }





}
