package com.guardian.historyRecord.enums;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * Created by Guardian on 2017-2-4.
 */
@NiagaraType
@NiagaraEnum(
        range = {
                @Range(value = "equator", ordinal = 0),
                @Range(value = "north", ordinal = 1),
                @Range(value = "south", ordinal = 2),
        },
        defaultValue = "equator"
)
public final class BLatTagEnum
    extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.base.lbs.BLatTagEnum(508994352)1.0$ @*/
/* Generated Sat Feb 04 16:12:33 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for equator. */
  public static final int EQUATOR = 0;
  /** Ordinal value for north. */
  public static final int NORTH = 1;
  /** Ordinal value for south. */
  public static final int SOUTH = 2;
  
  /** BLatTagEnum constant for equator. */
  public static final BLatTagEnum equator = new BLatTagEnum(EQUATOR);
  /** BLatTagEnum constant for north. */
  public static final BLatTagEnum north = new BLatTagEnum(NORTH);
  /** BLatTagEnum constant for south. */
  public static final BLatTagEnum south = new BLatTagEnum(SOUTH);
  
  /** Factory method with ordinal. */
  public static BLatTagEnum make(int ordinal)
  {
    return (BLatTagEnum)equator.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BLatTagEnum make(String tag)
  {
    return (BLatTagEnum)equator.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BLatTagEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BLatTagEnum DEFAULT = equator;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BLatTagEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}
