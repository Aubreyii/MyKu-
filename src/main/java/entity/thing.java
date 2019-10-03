package entity;


import java.util.Date;

public class thing {
    private Integer id;//事件编号
//    private String me;//主人
    private String wo;
    private String others;//被记录人
    private String gob;//事件好坏
    private Date rtime;//创建时间
    private String dotime;//代办时间
    private String place;//发生地点
    private String content;//详细内容
    private Integer ach; //事件完成状态



    @Override
    public String toString() {
        return "thing{" +
                "id=" + id +
                ", wo='" + wo + '\'' +
                ", others='" + others + '\'' +
                ", gob='" + gob + '\'' +
                ", rtime=" + rtime +
                ", dotime='" + dotime + '\'' +
                ", place='" + place + '\'' +
                ", content='" + content + '\'' +
                ", ach=" + ach +
                '}';
    }

    public thing(Integer id, String wo, String others, String gob, String dotime, String place, String content) {
        this.id = id;
        this.wo = wo;
        this.others = others;
        this.gob = gob;
        this.dotime = dotime;
        this.place = place;
        this.content = content;
    }

    public thing(String wo, String others, String gob, Date rtime, String dotime, String place, String content) {
        this.wo = wo;
        this.others = others;
        this.gob = gob;
        this.rtime = rtime;
        this.dotime = dotime;
        this.place = place;
        this.content = content;
    }

    public Integer getAch() {
        return ach;
    }

    public void setAch(Integer ach) {
        this.ach = ach;
    }

    public String getWo() {
        return wo;
    }

    public void setWo(String wo) {
        this.wo = wo;
    }

    public thing(){

    }
    public thing(Integer id) {
        this.id = id;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public String getDotime() {
        return dotime;
    }

    public void setDotime(String dotime) {
        this.dotime = dotime;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
//
//    public String getMe() {
//        return me;
//    }
//
//    public void setMe(String me) {
//        this.me = me;
//    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getGob() {
        return gob;
    }

    public void setGob(String gob) {
        this.gob = gob;
    }



    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}