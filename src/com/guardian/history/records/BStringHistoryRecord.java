package com.guardian.history.records;

import com.guardian.enums.BHistoryTagEnum;
import com.guardian.json.JSONObj;
import com.guardian.json.JSONSupport;

import javax.baja.history.BStringTrendRecord;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.status.BStatus;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * boolean point record define for history
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
        type = "String",
        defaultValue = "",
        flags = Flags.SUMMARY
)
public final class BStringHistoryRecord
        extends BValueHistoryRecord
{



/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.history.records.BStringHistoryRecord(1248416263)1.0$ @*/
/* Generated Mon Dec 04 10:21:32 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

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
  public static final Property value = newProperty(Flags.SUMMARY, "", null);
  
  /**
   * Get the {@code value} property.
   * @see #value
   */
  public String getValue() { return getString(value); }
  
  /**
   * Set the {@code value} property.
   * @see #value
   */
  public void setValue(String v) { setString(value, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BStringHistoryRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     *
     * @return
     */
    @Override
    public boolean isFixedSize() {
        return false;
    }

    @Override
    protected void doReadTrend(DataInput in) throws IOException {
        this.setTypeTag(BHistoryTagEnum.make(in.readInt()));
        this.setValue(in.readUTF());
    }

    @Override
    protected void doWriteTrend(DataOutput out) throws IOException {
        out.writeInt(this.getTypeTag().getOrdinal());
        out.writeUTF(this.getValue());
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
     * @param status
     * @return
     */
    public BStringHistoryRecord set(BAbsTime timestamp,
                                  BHistoryTagEnum tag,
                                  String value,
                                  BStatus  status)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(tag);
        this.setValue(value);
        this.setStatus(status);
        return this;
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
        jsonObj.put(this.getLexicon().get("api.json.stringHistory.timestamp.mills"), this.getTimestamp().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.stringHistory.value"), this.getValue());
        jsonObj.put(this.getLexicon().get("api.json.stringHistory.statue"), this.getStatus().getBits());
        return jsonObj;
    }
}