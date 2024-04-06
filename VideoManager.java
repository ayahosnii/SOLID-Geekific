public class VideoManager implements IVideoAction, IAdsActions {
    private String title;
    private int time;
    private int likes;
    private int views;

    public void setTime(int time) {
        this.time = time;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public double getNumberOfHours() {
        return (time / 3600) * views;
    }

    @Override
    public void playRandomAd() {
        // play an add
    }
}