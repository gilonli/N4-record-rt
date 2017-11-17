package com.guardian.history.records;

import com.guardian.enums.BHistoryTagEnum;
import com.guardian.json.JSONObj;
import com.guardian.json.JSONSupport;

import javax.baja.history.BTrendRecord;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.status.BStatus;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * run count record define for device
 * @author Chris Lee
 */
@NiagaraType
@NiagaraProperty(
        name = "typeTag",
        type = "BHistoryTagEnum",
        defaultValue = "BHistoryTagEnum.DEFAULT"
)
@NiagaraProperty(
        name = "value",
        type = "boolean",
        defaultValue = "false"
)
@NiagaraProperty(
        name = "startCount",
        type = "int",
        defaultValue = "0"
)
@NiagaraProperty(
        name = "startFrom",
        type = "BAbsTime",
        defaultValue = "BAbsTime.DEFAULT"
)
@NiagaraProperty(
        name = "EndAt",
        type = "BAbsTime",
        defaultValue = "BAbsTime.DEFAULT"
)
@NiagaraProperty(
        name = "keptTime",
        type = "BRelTime",
        defaultValue = "BRelTime.DEFAULT"
)
public final class BRunCountHistoryRecord
        extends BTrendRecord
        implements JSONSupport
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $BRunCountHistoryRecord(1494458415)1.0$ @*/
/* Generated Thu Nov 09 09:51:37 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "typeTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code typeTag} property.
   * @see #getTypeTag
   * @see #setTypeTag
   */
  public static final Property typeTag = newProperty(0, BHistoryTagEnum.DEFAULT, null);
  
  /**
   * Get the {@code typeTag} property.
   * @see #typeTag
   */
  public BHistoryTagEnum getTypeTag() { return (BHistoryTagEnum)get(typeTag); }
  
  /**
   * Set the {@code typeTag} property.
   * @see #typeTag
   */
  public void setTypeTag(BHistoryTagEnum v) { set(typeTag, v, null); }

////////////////////////////////////////////////////////////////
// Property "value"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code value} property.
   * @see #getValue
   * @see #setValue
   */
  public static final Property value = newProperty(0, false, null);
  
  /**
   * Get the {@code value} property.
   * @see #value
   */
  public boolean getValue() { return getBoolean(value); }
  
  /**
   * Set the {@code value} property.
   * @see #value
   */
  public void setValue(boolean v) { setBoolean(value, v, null); }

////////////////////////////////////////////////////////////////
// Property "startCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code startCount} property.
   * @see #getStartCount
   * @see #setStartCount
   */
  public static final Property startCount = newProperty(0, 0, null);
  
  /**
   * Get the {@code startCount} property.
   * @see #startCount
   */
  public int getStartCount() { return getInt(startCount); }
  
  /**
   * Set the {@code startCount} property.
   * @see #startCount
   */
  public void setStartCount(int v) { setInt(startCount, v, null); }

////////////////////////////////////////////////////////////////
// Property "startFrom"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code startFrom} property.
   * @see #getStartFrom
   * @see #setStartFrom
   */
  public static final Property startFrom = newProperty(0, BAbsTime.DEFAULT, null);
  
  /**
   * Get the {@code startFrom} property.
   * @see #startFrom
   */
  public BAbsTime getStartFrom() { return (BAbsTime)get(startFrom); }
  
  /**
   * Set the {@code startFrom} property.
   * @see #startFrom
   */
  public void setStartFrom(BAbsTime v) { set(startFrom, v, null); }

////////////////////////////////////////////////////////////////
// Property "EndAt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code EndAt} property.
   * @see #getEndAt
   * @see #setEndAt
   */
  public static final Property EndAt = newProperty(0, BAbsTime.DEFAULT, null);
  
  /**
   * Get the {@code EndAt} property.
   * @see #EndAt
   */
  public BAbsTime getEndAt() { return (BAbsTime)get(EndAt); }
  
  /**
   * Set the {@code EndAt} property.
   * @see #EndAt
   */
  public void setEndAt(BAbsTime v) { set(EndAt, v, null); }

////////////////////////////////////////////////////////////////
// Property "keptTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code keptTime} property.
   * @see #getKeptTime
   * @see #setKeptTime
   */
  public static final Property keptTime = newProperty(0, BRelTime.DEFAULT, null);
  
  /**
   * Get the {@code keptTime} property.
   * @see #keptTime
   */
  public BRelTime getKeptTime() { return (BRelTime)get(keptTime); }
  
  /**
   * Set the {@code keptTime} property.
   * @see #keptTime
   */
  public void setKeptTime(BRelTime v) { set(keptTime, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BRunCountHistoryRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     *
     * @return
     */
    @Override
    public boolean isFixedSize() {
        return true;
    }

    /**
     *
     * @param dataInput
     * @throws IOException
     */
    @Override
    protected void doReadTrend(DataInput dataInput) throws IOException {
        this.setTypeTag(BHistoryTagEnum.make(dataInput.readInt()));
        this.setValue(dataInput.readBoolean());
        this.setStartCount(dataInput.readInt());
        this.setStartFrom(BAbsTime.make(dataInput.readLong()));
        this.setEndAt(BAbsTime.make(dataInput.readLong()));
        this.setKeptTime(BRelTime.make(dataInput.readLong()));
    }

    /**
     *
     * @param dataOutput
     * @throws IOException
     */
    @Override
    protected void doWriteTrend(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.getTypeTag().getOrdinal());
        dataOutput.writeBoolean(this.getValue());
        dataOutput.writeInt(this.getStartCount());
        dataOutput.writeLong(this.getStartFrom().getMillis());
        dataOutput.writeLong(this.getEndAt().getMillis());
        dataOutput.writeLong(this.getKeptTime().getMillis());
    }

    /**
     *
     * @return
     */
    @Override
    public Property getValueProperty() {
        return value;
    }

    /**
     *
     * @param timestamp
     * @param tag
     * @param value
     * @param count
     * @param startFrom
     * @return
     */
    public BRunCountHistoryRecord set(BAbsTime timestamp,
                                      BHistoryTagEnum   tag,
                                      boolean   value,
                                      int   count,
                                      BAbsTime   startFrom,
                                      BStatus  status)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(tag);
        this.setValue(value);
        this.setStartCount(count);
        this.setStartFrom(startFrom);
        this.setEndAt(BAbsTime.now());
        this.setKeptTime(this.getStartFrom().delta(BAbsTime.now()));
        this.setStatus(status);
        return this;
    }

    /**
     *
     * @return
     */
    public String getValueString() {
        if(this.getValue()) {
            return this.getLexicon().get("api.json.value.runCount.value.true");
        } else {
            return this.getLexicon().get("api.json.value.runCount.value.false");
        }
    }

    /**
     *
     * @param tag
     * @return
     */
    public boolean fitTag(BHistoryTagEnum tag) {
        return this.getTypeTag().equals(tag);
    }

    @Override
    public String toJSONString() {
        return this.getJSONObj().toString();
    }

    @Override
    public JSONObj getJSONObj() {
        JSONObj jsonObj = new JSONObj();
        return this.appendJSONObj(jsonObj);
    }

    @Override
    public JSONObj appendJSONObj(JSONObj jsonObj) {
        jsonObj.put(this.getLexicon().get("api.json.runCount.timestamp"), this.getTimestamp());
        jsonObj.put(this.getLexicon().get("api.json.runCount.tag"), this.getTypeTag());
        jsonObj.put(this.getLexicon().get("api.json.runCount.value"), this.getValueString());
        jsonObj.put(this.getLexicon().get("api.json.runCount.startCount"), this.getStartCount());
        jsonObj.put(this.getLexicon().get("api.json.runCount.startFrom.mills"), this.getStartFrom().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.runCount.endAt.mills"), this.getEndAt().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.runCount.keptTime.mills"), this.getKeptTime().getMillis());
        return jsonObj;
    }

}