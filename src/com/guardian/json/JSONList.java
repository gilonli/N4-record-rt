package com.guardian.json;

import com.tridium.json.JSONArray;

import javax.baja.naming.SlotPath;

/**
 * override JSONArray's to String method to deal with niagara unicode storage
 * @author Chris Lee
 */
public class JSONList
    extends JSONArray
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
