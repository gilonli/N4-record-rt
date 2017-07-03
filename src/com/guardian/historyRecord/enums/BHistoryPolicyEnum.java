package com.guardian.historyRecord.enums;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * Created by Guardian on 2017-4-28.
 */
@NiagaraType
@NiagaraEnum(
        range = {
                @Range("average"),    //平均值
                @Range("sum"),  //总和
                @Range("max"),   //最大值
                @Range("min"),   //最小值
                @Range("input"), //实时值
        },
        defaultValue = "input"
)
public final class BHistoryPolicyEnum
    extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.historyRecord.enums.BHistoryPolicyEnum(1521190121)1.0$ @*/
/* Generated Wed May 24 09:24:04 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for average. */
  public static final int AVERAGE = 0;
  /** Ordinal value for sum. */
  public static final int SUM = 1;
  /** Ordinal value for max. */
  public static final int MAX = 2;
  /** Ordinal value for min. */
  public static final int MIN = 3;
  /** Ordinal value for input. */
  public static final int INPUT = 4;
  
  /** BHistoryPolicyEnum constant for average. */
  public static final BHistoryPolicyEnum average = new BHistoryPolicyEnum(AVERAGE);
  /** BHistoryPolicyEnum constant for sum. */
  public static final BHistoryPolicyEnum sum = new BHistoryPolicyEnum(SUM);
  /** BHistoryPolicyEnum constant for max. */
  public static final BHistoryPolicyEnum max = new BHistoryPolicyEnum(MAX);
  /** BHistoryPolicyEnum constant for min. */
  public static final BHistoryPolicyEnum min = new BHistoryPolicyEnum(MIN);
  /** BHistoryPolicyEnum constant for input. */
  public static final BHistoryPolicyEnum input = new BHistoryPolicyEnum(INPUT);
  
  /** Factory method with ordinal. */
  public static BHistoryPolicyEnum make(int ordinal)
  {
    return (BHistoryPolicyEnum)average.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BHistoryPolicyEnum make(String tag)
  {
    return (BHistoryPolicyEnum)average.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BHistoryPolicyEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BHistoryPolicyEnum DEFAULT = input;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BHistoryPolicyEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}
