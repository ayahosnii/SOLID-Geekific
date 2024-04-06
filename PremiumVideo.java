public class PremiumVideo implements IVideoAction {
    private int premiunId;
    private VideoManager manager;

    public void setManager(VideoManager manager) {
        this.manager = manager;
    }

    @Override
    public double getNumberOfHours() {
        return manager.getNumberOfHours();
    }
}
