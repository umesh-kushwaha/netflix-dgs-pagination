package com.umesh.pagination.util;

import com.umesh.pagination.generated.types.Video;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ukushwaha
 */
public class VideoHelper {



    public static List<Video> getVideoList(){
        List<Video> videos = new ArrayList<>();
        for(int i = 0; i<500; i++){
            Video video = new Video();
            video.setId(i+1);
            video.setDuration(500);
            video.setTitle("Video title-" + (i+1));
            videos.add(video);
        }
        return videos;
    }
}
