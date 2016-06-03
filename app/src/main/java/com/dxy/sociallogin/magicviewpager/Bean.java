package com.dxy.sociallogin.magicviewpager;

import java.util.List;

/**
 * Created by dangxueyi on 16/6/1.
 */
public class Bean {

    /**
     * id : 1
     * name : 高中同步*高考
     * _child : [{"id":"3","name":"高考语文","cover_e":"http://static.haoxue.com/tk/images/gz_chinese.png"},{"id":"4","name":"高考物理","cover_e":"http://static.haoxue.com/tk/images/gz_physics.png"},{"id":"5","name":"高考化学","cover_e":"http://static.haoxue.com/tk/images/gz_chemistry.png"},{"id":"6","name":"高考生物","cover_e":"http://static.haoxue.com/tk/images/gz_biology.png"},{"id":"36","name":"高考英语","cover_e":"http://static.haoxue.com/tk/images/gz_english.png"},{"id":"44","name":"高考地理","cover_e":"http://static.haoxue.com/tk/images/gz_geography.png"},{"id":"52","name":"高考历史","cover_e":"http://static.haoxue.com/tk/images/gz_history.png"},{"id":"53","name":"高考政治","cover_e":"http://static.haoxue.com/tk/images/gz_politics.png"}]
     */

    private String id;
    private String name;
    private List<ChildBean> _child;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void set_child(List<ChildBean> _child) {
        this._child = _child;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<ChildBean> get_child() {
        return _child;
    }

    public static class ChildBean {
        /**
         * id : 3
         * name : 高考语文
         * cover_e : http://static.haoxue.com/tk/images/gz_chinese.png
         */

        private String id;
        private String name;
        private String cover_e;

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCover_e(String cover_e) {
            this.cover_e = cover_e;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCover_e() {
            return cover_e;
        }
    }
}
