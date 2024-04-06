public class Video{
    private VideoManager manager;

    public void setManager(VideoManager manager) {
        this.manager = manager;
    }

    public double getNumberOfHours() {
        return manager.getNumberOfHours();
    }

    public void playRandomAd()
    {
        manager.playRandomAd();
    }
   
}