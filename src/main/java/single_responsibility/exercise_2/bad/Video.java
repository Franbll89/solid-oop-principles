package single_responsibility.exercise_2.bad;

import single_responsibility.exercise_2.bad.Format.VideoFormat;

public class Video {

    private int fps;
    private VideoFormat videoFormat;
    private int videoDuration;

    public Video(int fps, VideoFormat videoFormat, int videoDuration) {
        this.fps = fps;
        this.videoFormat = videoFormat;
        this.videoDuration = videoDuration;
    }

    public int getFps() {
        return fps;
    }

    public VideoFormat getVideoFormat() {
        return videoFormat;
    }

    public int getVideoDuration() {
        return videoDuration;
    }
}
