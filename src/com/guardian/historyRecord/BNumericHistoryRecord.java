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
            @NiagaraProperty(name = "value", type = "double", defaultValue = "0.0d"),
    }
)
public class BNumericHistoryRecord
    extends BTrendRecord
{



/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.historyRecord.BNumericHistoryRecord(968057440)1.0$ @*/
/* Generated Thu May 18 17:10:10 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

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
  public static final Property value = newProperty(0, 0.0d, null);
  
  /**
   * Get the {@code value} property.
   * @see #value
   */
  public double getValue() { return getDouble(value); }
  
  /**
   * Set the {@code value} property.
   * @see #value
   */
  public void setValue(double v) { setDouble(value, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BNumericHistoryRecord.class);

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
        this.setValue(dataInput.readDouble());
    }

    /**
     *
     * @param dataOutput
     * @throws IOException
     */
    @Override
    protected void doWriteTrend(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.getTypeTag().getOrdinal());
        dataOutput.writeDouble(this.getValue());
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
     * @return
     */
    public BNumericHistoryRecord set(BAbsTime timestamp,
                                     BHistoryTagEnum tag,
                                     double   value,
                                     BStatus  status)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(tag);
        this.setValue(value);
        this.setStatus(status);
        return this;
    }

}