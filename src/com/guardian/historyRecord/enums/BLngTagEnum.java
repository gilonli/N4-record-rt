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
                @Range(value = "primeMeridian", ordinal = 0),
                @Range(value = "east", ordinal = 1),
                @Range(value = "west", ordinal = 2),
        },
        defaultValue = "primeMeridian"
)
public final class BLngTagEnum
    extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.base.lbs.BLngTagEnum(297921299)1.0$ @*/
/* Generated Sat Feb 04 16:12:33 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for primeMeridian. */
  public static final int PRIME_MERIDIAN = 0;
  /** Ordinal value for east. */
  public static final int EAST = 1;
  /** Ordinal value for west. */
  public static final int WEST = 2;
  
  /** BLngTagEnum constant for primeMeridian. */
  public static final BLngTagEnum primeMeridian = new BLngTagEnum(PRIME_MERIDIAN);
  /** BLngTagEnum constant for east. */
  public static final BLngTagEnum east = new BLngTagEnum(EAST);
  /** BLngTagEnum constant for west. */
  public static final BLngTagEnum west = new BLngTagEnum(WEST);
  
  /** Factory method with ordinal. */
  public static BLngTagEnum make(int ordinal)
  {
    return (BLngTagEnum)primeMeridian.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BLngTagEnum make(String tag)
  {
    return (BLngTagEnum)primeMeridian.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BLngTagEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BLngTagEnum DEFAULT = primeMeridian;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BLngTagEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}
