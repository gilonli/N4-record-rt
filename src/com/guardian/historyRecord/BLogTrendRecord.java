/**
 * 
 */
package com.guardian.historyRecord;

import javax.baja.history.BHistoryRecord;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraSlots;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @author Chris Lee
 * 
 * "timeStamp":STRING,  --yyyy-MM-dd hh:mm:ss
 * "logText":STRING
 */
@NiagaraType
@NiagaraSlots(
        properties = {
                @NiagaraProperty(name = "time", type = "BAbsTime", defaultValue = "BAbsTime.now()"),
                @NiagaraProperty(name = "logText", type = "String", defaultValue = "-"),
        }
)
public class BLogTrendRecord
    extends BHistoryRecord
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.historyRecord.BLogTrendRecord(1168575237)1.0$ @*/
/* Generated Thu May 18 17:03:24 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "time"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code time} property.
   * @see #getTime
   * @see #setTime
   */
  public static final Property time = newProperty(0, BAbsTime.now(), null);
  
  /**
   * Get the {@code time} property.
   * @see #time
   */
  public BAbsTime getTime() { return (BAbsTime)get(time); }
  
  /**
   * Set the {@code time} property.
   * @see #time
   */
  public void setTime(BAbsTime v) { set(time, v, null); }

////////////////////////////////////////////////////////////////
// Property "logText"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code logText} property.
   * @see #getLogText
   * @see #setLogText
   */
  public static final Property logText = newProperty(0, "-", null);
  
  /**
   * Get the {@code logText} property.
   * @see #logText
   */
  public String getLogText() { return getString(logText); }
  
  /**
   * Set the {@code logText} property.
   * @see #logText
   */
  public void setLogText(String v) { setString(logText, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BLogTrendRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     * Tests whether this record type has a fixed size. BAlarmTrendRecord have a variable size.
     * @see BHistoryRecord#isFixedSize()
     */
    public boolean isFixedSize() { return false; }


    /**
     * Read the type specific fields from the specified input.
     * @see javax.baja.history.BTrendRecord#doReadTrend(DataInput)
     */
    public void doRead(DataInput in) throws IOException {
        this.setTime(BAbsTime.make(in.readLong()));
        this.setLogText(in.readUTF());
    }

    /**
     * Write the type specific fields to the specified output.
     * @see javax.baja.history.BTrendRecord#doWriteTrend(DataOutput)
     */
    public void doWrite(DataOutput out) throws IOException {
        out.writeLong(this.getTime().getMillis());
        out.writeUTF(this.getLogText());
    }

    /**
     * @see javax.baja.history.BTrendRecord#getValueProperty()
     */
    public Property getValueProperty() {
        return null;
    }

    /**
     * Set the values in this record.
     * @return Returns this instance with the new values set.
     */
    public BLogTrendRecord set(BAbsTime timestamp,
                               String text) {
        this.setTime(timestamp);
        this.setLogText(text);
        return this;
    }

    /**
     * make a readable string of this record
     * @see BHistoryRecord#toString(Context)
     */
    public String toString(Context ctx) {
        StringBuffer s = new StringBuffer(64);
        s.append(super.toString(ctx));
        s.append(" timeStamp=");
        s.append(this.getTime());
        s.append(" logText=");
        s.append(this.getLogText());
        return s.toString();
    }

}