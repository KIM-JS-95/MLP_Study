package test;

import java.util.Date;

public class MemoDTO {

    private int memono;
    private String wname;
    private String title;
    private String content;
    private String paawd;
    private int viewcnt;


    public int getMemono() {
        return memono;
    }

    public void setMemono(int memono) {
        this.memono = memono;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPaawd() {
        return paawd;
    }

    public void setPaawd(String paawd) {
        this.paawd = paawd;
    }

    public int getViewcnt() {
        return viewcnt;
    }

    public void setViewcnt(int viewcnt) {
        this.viewcnt = viewcnt;
    }


    public MemoDTO() {
    }



    public MemoDTO(int memono, String wname, String title, String content, String paawd, int viewcnt) {
        this.memono = memono;
        this.wname = wname;
        this.title = title;
        this.content = content;
        this.paawd = paawd;
        this.viewcnt = viewcnt;
    }

}
