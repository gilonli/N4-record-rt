package com.guardian.historyRecord.enums;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * Created by Chris on 2016-12-12.
 */
@NiagaraType
@NiagaraEnum(
        range = {
                @Range("minute"),
                @Range("hour"),
                @Range("day"),
                @Range("week"),
                @Range("month"),
                @Range("year"),
                @Range("cov"),
        },
        defaultValue = "minute"
)
public final class BHistoryTagEnum
    extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.historyRecord.enums.BHistoryTagEnum(745274054)1.0$ @*/
/* Generated Thu Dec 15 08:30:01 CST 2016 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for minute. */
  public static final int MINUTE = 0;
  /** Ordinal value for hour. */
  public static final int HOUR = 1;
  /** Ordinal value for day. */
  public static final int DAY = 2;
  /** Ordinal value for week. */
  public static final int WEEK = 3;
  /** Ordinal value for month. */
  public static final int MONTH = 4;
  /** Ordinal value for year. */
  public static final int YEAR = 5;
  /** Ordinal value for cov. */
  public static final int COV = 6;
  
  /** BHistoryTagEnum constant for minute. */
  public static final BHistoryTagEnum minute = new BHistoryTagEnum(MINUTE);
  /** BHistoryTagEnum constant for hour. */
  public static final BHistoryTagEnum hour = new BHistoryTagEnum(HOUR);
  /** BHistoryTagEnum constant for day. */
  public static final BHistoryTagEnum day = new BHistoryTagEnum(DAY);
  /** BHistoryTagEnum constant for week. */
  public static final BHistoryTagEnum week = new BHistoryTagEnum(WEEK);
  /** BHistoryTagEnum constant for month. */
  public static final BHistoryTagEnum month = new BHistoryTagEnum(MONTH);
  /** BHistoryTagEnum constant for year. */
  public static final BHistoryTagEnum year = new BHistoryTagEnum(YEAR);
  /** BHistoryTagEnum constant for cov. */
  public static final BHistoryTagEnum cov = new BHistoryTagEnum(COV);
  
  /** Factory method with ordinal. */
  public static BHistoryTagEnum make(int ordinal)
  {
    return (BHistoryTagEnum)minute.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BHistoryTagEnum make(String tag)
  {
    return (BHistoryTagEnum)minute.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BHistoryTagEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BHistoryTagEnum DEFAULT = minute;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BHistoryTagEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
