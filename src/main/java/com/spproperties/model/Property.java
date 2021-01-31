package com.spproperties.model;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table //(name = "spproperties.PROPERTY")
public class Property {
    @Id
    @Column /*(name = "PID")*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pId;

    @Column /*(name = "ENTRY_DT")*/
    private String entryDt;

    @Column /*(name = "MOD_DT")*/
    private String modDt;

    @Column /*(name = "POST")*/
    private Integer pCost;

    @Column /*(name = "ADVANCE")*/
    private Integer advance;

    @Column /*(name = "COMMISSION")*/
    private Integer commission;

   @Column  /*(name = "TIME_ALLOTTED")*/
    private String TimeAllotted;

    @Column /*(name = "NAME")*/
    private String pName;

    @Column /*(name = "TOTAL_COST")*/
    private Integer TotalCost;

    @Column /*(name = "PROPERTY_SIZE")*/
    private String propSize;


    @Column /*(name = "DEPOSIT_AMOUNT")*/
    private Integer depositamount;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getEntryDt() {
        return entryDt;
    }

    public void setEntryDt(String entryDt) {
        this.entryDt = entryDt;
    }

    public String getModDt() {
        return modDt;
    }

    public void setModDt(String modDt) {
        this.modDt = modDt;
    }

    public Integer getpCost() {
        return pCost;
    }

    public void setpCost(Integer pCost) {
        this.pCost = pCost;
    }

    public Integer getAdvance() {
        return advance;
    }

    public void setAdvance(Integer advance) {
        this.advance = advance;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    public String getTimeAllotted() {
        return TimeAllotted;
    }

    public void setTimeAllotted(String timeAllotted) {
        TimeAllotted = timeAllotted;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(Integer totalCost) {
        TotalCost = totalCost;
    }

    public String getPropSize() {
        return propSize;
    }

    public void setPropSize(String propSize) {
        this.propSize = propSize;
    }

    public Integer getDepositamount() {
        return depositamount;
    }

    public void setDepositamount(Integer depositamount) {
        this.depositamount = depositamount;
    }

    @Override
    public String toString() {
        return "Property{" +
                "pId=" + pId +
                ", entryDt='" + entryDt + '\'' +
                ", modDt='" + modDt + '\'' +
                ", pCost=" + pCost +
                ", advance=" + advance +
                ", commission=" + commission +
                ", TimeAllotted='" + TimeAllotted + '\'' +
                ", pName='" + pName + '\'' +
                ", TotalCost=" + TotalCost +
                ", propSize='" + propSize + '\'' +
                ", depositamount=" + depositamount +
                '}';
    }
}