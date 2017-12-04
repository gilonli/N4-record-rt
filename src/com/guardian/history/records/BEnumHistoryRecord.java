package com.guardian.history.records;

import com.guardian.enums.BHistoryTagEnum;
import com.guardian.json.JSONObj;
import com.guardian.json.JSONSupport;

import javax.baja.history.BEnumTrendRecord;
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
        type = "BDynamicEnum",
        defaultValue = "BDynamicEnum.DEFAULT"
)
public final class BEnumHistoryRecord
        extends BValueHistoryRecord
{


/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.history.records.BEnumHistoryRecord(3357423177)1.0$ @*/
/* Generated Mon Dec 04 10:22:04 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

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
  public static final Property value = newProperty(0, BDynamicEnum.DEFAULT, null);
  
  /**
   * Get the {@code value} property.
   * @see #value
   */
  public BDynamicEnum getValue() { return (BDynamicEnum)get(value); }
  
  /**
   * Set the {@code value} property.
   * @see #value
   */
  public void setValue(BDynamicEnum v) { set(value, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BEnumHistoryRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     *
     * @return
     */
    @Override
    public boolean isFixedSize() {
        return true;
    }

    @Override
    protected void doReadTrend(DataInput in) throws IOException {
        this.setTypeTag(BHistoryTagEnum.make(in.readInt()));
        this.setValue(BDynamicEnum.make(in.readInt()));
    }

    @Override
    protected void doWriteTrend(DataOutput out) throws IOException {
        out.writeInt(this.getTypeTag().getOrdinal());
        out.writeInt(this.getValue().getOrdinal());
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
    public BEnumHistoryRecord set(BAbsTime timestamp,
                                     BHistoryTagEnum tag,
                                     BDynamicEnum value,
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
        jsonObj.put(this.getLexicon().get("api.json.enumHistory.timestamp.mills"), this.getTimestamp().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.enumHistory.value"), this.getValue());
        jsonObj.put(this.getLexicon().get("api.json.enumHistory.statue"), this.getStatus().getBits());
        return jsonObj;
    }

}