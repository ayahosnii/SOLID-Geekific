public class Main {
    public static void main(String[] args) {
        // Create instances of VideoManager, Video, and PremiumVideo
        VideoManager videoManager1 = new VideoManager();
        VideoManager videoManager2 = new VideoManager();
        Video video = new Video();
        PremiumVideo premiumVideo = new PremiumVideo();

        // Set values for attributes
        videoManager1.setTime(7200); // 2 hours
        videoManager1.setViews(1000);

        videoManager2.setTime(9000); 
        videoManager2.setViews(3000);

        // Set VideoManager instance for Video and PremiumVideo
        video.setManager(videoManager1);
        premiumVideo.setManager(videoManager2);

        // Call getNumberOfHours() method
        double videoHours = video.getNumberOfHours();
        double premiumVideoHours = premiumVideo.getNumberOfHours();

        // Print the results
        System.out.println("Hours for regular video: " + videoHours);
        System.out.println("Hours for premium video: " + premiumVideoHours);
    }
}
