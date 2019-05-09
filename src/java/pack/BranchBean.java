/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nikhil
 */
public class BranchBean {
    protected int bid;
    protected String bname;
    protected String bemailid;
    protected String bphoneno;
    protected String baddress;
    protected String bdescription;

    public BranchBean getBranch(String bname){
        try {
            ResultSet rs = DatabaseManager.executeQuery("select * from branchmaster where bname ='"+bname+"'");
            rs.first();
            bid=rs.getInt("bid");
            this.bname=rs.getString("bname");
            bemailid=rs.getString("bemailid");
            bphoneno=rs.getString("bphoneno");
            baddress=rs.getString("baddress");
            bdescription=rs.getString("bdescription");
            return this;
        } catch (SQLException ex) {
            Logger.getLogger(BranchBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    /**
     * @return the bid
     */
    public int getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(int bid) {
        this.bid = bid;
    }

    /**
     * @return the bname
     */
    public String getBname() {
        return bname;
    }

    /**
     * @param bname the bname to set
     */
    public void setBname(String bname) {
        this.bname = bname;
    }

    /**
     * @return the bemailid
     */
    public String getBemailid() {
        return bemailid;
    }

    /**
     * @param bemailid the bemailid to set
     */
    public void setBemailid(String bemailid) {
        this.bemailid = bemailid;
    }

    /**
     * @return the bphoneno
     */
    public String getBphoneno() {
        return bphoneno;
    }

    /**
     * @param bphoneno the bphoneno to set
     */
    public void setBphoneno(String bphoneno) {
        this.bphoneno = bphoneno;
    }

    /**
     * @return the baddress
     */
    public String getBaddress() {
        return baddress;
    }

    /**
     * @param baddress the baddress to set
     */
    public void setBaddress(String baddress) {
        this.baddress = baddress;
    }

    /**
     * @return the bdescription
     */
    public String getBdescription() {
        return bdescription;
    }

    /**
     * @param bdescription the bdescription to set
     */
    public void setBdescription(String bdescription) {
        this.bdescription = bdescription;
    }
}
