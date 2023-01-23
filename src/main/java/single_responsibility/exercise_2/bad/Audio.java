package single_responsibility.exercise_2.bad;

import single_responsibility.exercise_2.bad.Format.AudioFormat;

public class Audio {

    private AudioFormat audioFormat;
    private int audioDuration;

    public Audio(AudioFormat audioFormat, int audioDuration) {
        this.audioFormat = audioFormat;
        this.audioDuration = audioDuration;
    }

    public AudioFormat getAudioFormat() {
        return audioFormat;
    }

    public int getAudioDuration() {
        return audioDuration;
    }
}
