package net.ciklum.study.webfifteens;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 6/5/13
 * Time: 1:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class FixedBannerPrepare implements BannerPrepare {
    public List getPreparedBanners(int quantity, List banners) {
        List<Banner> preparedBanners = new LinkedList<Banner>();
        for (int i = 0; i <  quantity; i++) {
            preparedBanners.add((Banner) banners.get(i));
        }
        return preparedBanners;
    }
}
