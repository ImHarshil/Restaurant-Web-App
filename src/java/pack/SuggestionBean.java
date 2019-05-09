/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Nikhil
 */
public class SuggestionBean {
    protected int sid;
    protected String sname;
    protected String semailid;
    protected String ssubject;
    protected String smessage;

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return the sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname the sname to set
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * @return the semailid
     */
    public String getSemailid() {
        return semailid;
    }

    /**
     * @param semailid the semailid to set
     */
    public void setSemailid(String semailid) {
        this.semailid = semailid;
    }

    /**
     * @return the ssubject
     */
    public String getSsubject() {
        return ssubject;
    }

    /**
     * @param ssubject the ssubject to set
     */
    public void setSsubject(String ssubject) {
        this.ssubject = ssubject;
    }

    /**
     * @return the smessage
     */
    public String getSmessage() {
        return smessage;
    }

    /**
     * @param smessage the smessage to set
     */
    public void setSmessage(String smessage) {
        this.smessage = smessage;
    }
}
