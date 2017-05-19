package com.guardian.historyRecord.enums;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * Created by Chris on 2016-12-15.
 */
@NiagaraType
@NiagaraEnum(
        range = {
                @Range("interval"),
                @Range("changeOfValue")
        }
)
public final class BHistoryRecordMethodEnum
    extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.historyRecord.enums.BHistoryRecordMethodEnum(2719457505)1.0$ @*/
/* Generated Thu Dec 15 09:15:18 CST 2016 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for interval. */
  public static final int INTERVAL = 0;
  /** Ordinal value for changeOfValue. */
  public static final int CHANGE_OF_VALUE = 1;
  
  /** BHistoryRecordMethodEnum constant for interval. */
  public static final BHistoryRecordMethodEnum interval = new BHistoryRecordMethodEnum(INTERVAL);
  /** BHistoryRecordMethodEnum constant for changeOfValue. */
  public static final BHistoryRecordMethodEnum changeOfValue = new BHistoryRecordMethodEnum(CHANGE_OF_VALUE);
  
  /** Factory method with ordinal. */
  public static BHistoryRecordMethodEnum make(int ordinal)
  {
    return (BHistoryRecordMethodEnum)interval.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BHistoryRecordMethodEnum make(String tag)
  {
    return (BHistoryRecordMethodEnum)interval.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BHistoryRecordMethodEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BHistoryRecordMethodEnum DEFAULT = interval;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BHistoryRecordMethodEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
