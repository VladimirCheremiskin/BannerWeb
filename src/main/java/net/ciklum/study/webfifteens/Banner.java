package net.ciklum.study.webfifteens;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 6/5/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Banner {
    private Integer id;
    private String bannerContent;

    @Override
    public String toString() {
        return "Banner{" +
                "bannerContent='" + bannerContent + '\'' +
                '}';
    }

    public Banner(Integer id, String bannerContent) {
        this.id = id;
        this.bannerContent = bannerContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerContent() {
        return bannerContent;
    }

    public void setBannerContent(String bannerContent) {
        this.bannerContent = bannerContent;
    }
}
