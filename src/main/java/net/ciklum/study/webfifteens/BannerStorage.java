package net.ciklum.study.webfifteens;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 6/5/13
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class BannerStorage {
    private List<Banner> bannerList = new LinkedList<Banner>();


    public BannerStorage() {
        bannerList.add(new Banner(1,"First"));
        bannerList.add(new Banner(2,"Second"));
        bannerList.add(new Banner(3,"Third"));
        bannerList.add(new Banner(4,"Fourth"));
        bannerList.add(new Banner(5,"Fifth"));
        bannerList.add(new Banner(6,"The Six"));
        bannerList.add(new Banner(7,"Seventh"));
        bannerList.add(new Banner(8,"Eights"));
    }

    public List<Banner> getBannerList() {
        return bannerList;
    }
}
