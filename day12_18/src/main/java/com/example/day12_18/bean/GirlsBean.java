package com.example.day12_18.bean;

import java.io.Serializable;
import java.util.List;

public class GirlsBean {
    /**
     * data : [{"_id":"5e5944fe2bae9a858b571142","author":"鸢媛","category":"Girl","createdAt":"2020-03-16 08:00:00","desc":"翻着我们的照片，想念若隐若现，去年的秋天，我们笑得很甜。 \u200b\u200b\u200b\u200b","images":["http://gank.io/images/e56da642238a43c4971f12d4e3395f30"],"likeCounts":9,"publishedAt":"2020-03-16 08:00:00","stars":1,"title":"第26期","type":"Girl","url":"http://gank.io/images/e56da642238a43c4971f12d4e3395f30","views":3309},{"_id":"5e5533b9efd6f28e2554f496","author":"鸢媛","category":"Girl","createdAt":"2020-03-15 08:00:00","desc":"若重要，总会想办法；不重要，总会找理由。 \u200b\u200b\u200b\u200b","images":["http://gank.io/images/04d6b8ee9e964c04877da65b43952e89"],"likeCounts":1,"publishedAt":"2020-03-15 08:00:00","stars":1,"title":"第25期","type":"Girl","url":"http://gank.io/images/04d6b8ee9e964c04877da65b43952e89","views":1565},{"_id":"5e5533b2efd6f28e2554f494","author":"鸢媛","category":"Girl","createdAt":"2020-03-14 08:00:00","desc":"不要停止奔跑，不要回顾来路，来路无可眷恋，值得期待的只有前方。 \u200b\u200b\u200b\u200b","images":["http://gank.io/images/50e3dd62dd9e4b0db957b3c5e296d6b1"],"likeCounts":5,"publishedAt":"2020-03-14 08:00:00","stars":1,"title":"第24期","type":"Girl","url":"http://gank.io/images/50e3dd62dd9e4b0db957b3c5e296d6b1","views":2356},{"_id":"5e5533abefd6f28e2554f492","author":"鸢媛","category":"Girl","createdAt":"2020-03-13 08:00:00","desc":"当你要开口说话时，你所说的话，必须比沉默更有价值。 \u200b \u200b\u200b\u200b\u200b","images":["http://gank.io/images/21c417e3a84842bfa585dee686f6b992"],"likeCounts":0,"publishedAt":"2020-03-13 08:00:00","stars":1,"title":"第23期","type":"Girl","url":"http://gank.io/images/21c417e3a84842bfa585dee686f6b992","views":1282},{"_id":"5e5533a5efd6f28e2554f490","author":"鸢媛","category":"Girl","createdAt":"2020-03-12 08:00:00","desc":"人生来孤独，却渴望拥抱相似的灵魂。\u200b\u200b\u200b\u200b❤️","images":["http://gank.io/images/f8c5ce6fd1b94686a68a7d74f552cf65"],"likeCounts":0,"publishedAt":"2020-03-12 08:00:00","stars":1,"title":"第22期","type":"Girl","url":"http://gank.io/images/f8c5ce6fd1b94686a68a7d74f552cf65","views":526},{"_id":"5e55339cefd6f28e2554f48e","author":"鸢媛","category":"Girl","createdAt":"2020-03-11 08:00:00","desc":"时光太瘦，指缝太宽，不经意的一瞥，已隔经年。","images":["http://gank.io/images/94c30acee68340278dfc58e948109ab9"],"likeCounts":0,"publishedAt":"2020-03-11 08:00:00","stars":1,"title":"第21期","type":"Girl","url":"http://gank.io/images/94c30acee68340278dfc58e948109ab9","views":400},{"_id":"5e53d842773c439beff19bf6","author":"鸢媛","category":"Girl","createdAt":"2020-03-10 08:00:00","desc":"故人笑比庭中树，一日秋风一日疏。","images":["http://gank.io/images/59019eedff4540cd88c96cb96937465f"],"likeCounts":0,"publishedAt":"2020-03-10 08:00:00","stars":1,"title":"第20期","type":"Girl","url":"http://gank.io/images/30f70718ee274bb399a1069f9eb79ead","views":513},{"_id":"5e52aa858ad0cb82d1976168","author":"鸢媛","category":"Girl","createdAt":"2020-03-09 08:00:00","desc":"与我相遇，是此生最美的风景。 我的一生借你一程， 这一程便是余生。 你我之间无人背叛，朝夕相安。 \u200b \u200b\u200b\u200b\u200b","images":["http://gank.io/images/4d2825dcb5d04d149e6a3620833449c4"],"likeCounts":0,"publishedAt":"2020-03-09 08:00:00","stars":1,"title":"第19期","type":"Girl","url":"http://gank.io/images/4d2825dcb5d04d149e6a3620833449c4","views":399},{"_id":"5e52aa7f8ad0cb82d1976166","author":"鸢媛","category":"Girl","createdAt":"2020-03-08 08:00:00","desc":"人生不过是午后到黄昏的距离，茶凉言尽，月上柳梢。 \u200b\u200b\u200b\u200b","images":["http://gank.io/images/d449165e9f434a60afafa47bd4167d57"],"likeCounts":0,"publishedAt":"2020-03-08 08:00:00","stars":1,"title":"第18期","type":"Girl","url":"http://gank.io/images/d449165e9f434a60afafa47bd4167d57","views":447},{"_id":"5e52aa7a8ad0cb82d1976164","author":"鸢媛","category":"Girl","createdAt":"2020-03-07 08:00:00","desc":"年岁沉， 提笔忆旧痕， 却道是， 无风无雨无故人。 \u200b\u200b","images":["http://gank.io/images/848c46c369174224aab4a80cab2b3261"],"likeCounts":0,"publishedAt":"2020-03-07 08:00:00","stars":1,"title":"第17期","type":"Girl","url":"http://gank.io/images/848c46c369174224aab4a80cab2b3261","views":464}]
     * page : 8
     * page_count : 10
     * status : 100
     * total_counts : 96
     */

    private int page;
    private int page_count;
    private int status;
    private int total_counts;
    private List<DataBean> data;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTotal_counts() {
        return total_counts;
    }

    public void setTotal_counts(int total_counts) {
        this.total_counts = total_counts;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * _id : 5e5944fe2bae9a858b571142
         * author : 鸢媛
         * category : Girl
         * createdAt : 2020-03-16 08:00:00
         * desc : 翻着我们的照片，想念若隐若现，去年的秋天，我们笑得很甜。 ​​​​
         * images : ["http://gank.io/images/e56da642238a43c4971f12d4e3395f30"]
         * likeCounts : 9
         * publishedAt : 2020-03-16 08:00:00
         * stars : 1
         * title : 第26期
         * type : Girl
         * url : http://gank.io/images/e56da642238a43c4971f12d4e3395f30
         * views : 3309
         */

        private String _id;
        private String author;
        private String category;
        private String createdAt;
        private String desc;
        private int likeCounts;
        private String publishedAt;
        private int stars;
        private String title;
        private String type;
        private String url;
        private int views;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getLikeCounts() {
            return likeCounts;
        }

        public void setLikeCounts(int likeCounts) {
            this.likeCounts = likeCounts;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public int getStars() {
            return stars;
        }

        public void setStars(int stars) {
            this.stars = stars;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getViews() {
            return views;
        }

        public void setViews(int views) {
            this.views = views;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}
