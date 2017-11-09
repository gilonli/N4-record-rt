package com.guardian.json;

import com.tridium.json.JSONObject;

import javax.baja.naming.SlotPath;

/**
 * override JSONObject's to String method to deal with niagara unicode storage
 * @author Chris Lee
 */
public class JSONObj
    extends JSONObject
{
    /**
     * Override to deal with unicode "$u" to "\\u"
     * @return
     */
    @Override
    public String toString() {
        return SlotPath.unescape(super.toString());
    }
}
