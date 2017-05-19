package com.guardian.historyRecord;

import com.guardian.historyRecord.enums.BHistoryTagEnum;

import javax.baja.history.BTrendRecord;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraSlots;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.status.BStatus;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by Chris on 2016-12-12.
 */

@NiagaraType
@NiagaraSlots(
    properties = {
            @NiagaraProperty(name = "typeTag", type = "BHistoryTagEnum", defaultValue = "BHistoryTagEnum.DEFAULT"),
            @NiagaraProperty(name = "value", type = "boolean", defaultValue = "false"),
            @NiagaraProperty(name = "alarmCount", type = "int", defaultValue = "0"),
            @NiagaraProperty(name = "startFrom", type = "BAbsTime", defaultValue = "BAbsTime.DEFAULT"),
            @NiagaraProperty(name = "EndAt", type = "BAbsTime", defaultValue = "BAbsTime.DEFAULT"),
            @NiagaraProperty(name = "keptTime", type = "BRelTime", defaultValue = "BRelTime.DEFAULT"),
    }
)
public class BAlarmCountHistoryRecord
    extends BTrendRecord
{

/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.historyRecord.BAlarmCountHistoryRecord(1242351642)1.0$ @*/
/* Generated Thu May 18 17:16:52 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

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
// Property "alarmCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code alarmCount} property.
   * @see #getAlarmCount
   * @see #setAlarmCount
   */
  public static final Property alarmCount = newProperty(0, 0, null);
  
  /**
   * Get the {@code alarmCount} property.
   * @see #alarmCount
   */
  public int getAlarmCount() { return getInt(alarmCount); }
  
  /**
   * Set the {@code alarmCount} property.
   * @see #alarmCount
   */
  public void setAlarmCount(int v) { setInt(alarmCount, v, null); }

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
  public static final Type TYPE = Sys.loadType(BAlarmCountHistoryRecord.class);

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
        this.setAlarmCount(dataInput.readInt());
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
        dataOutput.writeInt(this.getAlarmCount());
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
    public BAlarmCountHistoryRecord set(BAbsTime timestamp,
                                        BHistoryTagEnum   tag,
                                        boolean   value,
                                        int   count,
                                        BAbsTime   startFrom,
                                        BStatus  status)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(tag);
        this.setValue(value);
        this.setAlarmCount(count);
        this.setStartFrom(startFrom);
        this.setEndAt(BAbsTime.now());
        this.setKeptTime(this.getStartFrom().delta(BAbsTime.now()));
        this.setStatus(status);
        return this;
    }

}