/**
 * TimeFormatter 时间字符串格式化工具，针对中国时区
 */
package com.guardian;

import javax.baja.nre.util.TextUtil;
import javax.baja.sys.BAbsTime;
import javax.baja.sys.BRelTime;

/**
 * @author Chris Lee
 *
 */
public final class TimeFormatter {

    /**
     * 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
     * @param str
     * @return YYYY-MM-ddTHH:mm:ss.999+8:00
     */
    public static final String toNiagaraStdString(String str) throws Exception {
        if (str == null || str.equals("")) {
            throw new Exception("TimeFormatter can not convert string of Length 0");
        }
        String dateString = "";
        String timeString = "";
        if (str.indexOf("T") >= 0) {
            if (str.length() == 19) {
                return str;
            }
            dateString = str.substring(0, str.indexOf("T"));
            timeString = str.substring(str.indexOf("T") + 1);
        } else if (str.indexOf(" ") >= 0) {
            if (str.indexOf(" ") == str.lastIndexOf(" ")) {
                dateString = str.substring(0, str.indexOf(" "));
                timeString = str.substring(str.indexOf(" ") + 1);
            } else {
      
            }
            if (dateString.indexOf(":") >= 0 && timeString.indexOf(":") < 0) {
                String temp = dateString;
                dateString = timeString;
                timeString = temp;
            }
        }
        if (dateString.indexOf("/") >= 0) {
            dateString = TextUtil.replace(dateString, "/", "-");
        }
        return dateString + "T" + timeString + ".999+8:00";
    }
  
    /**
     * 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
     * @param t
     * @return YYYY-MM-ddTHH:mm:ss.999+8:00
     */
    public static final String toNiagaraStdString(BAbsTime t) {
        return t.toString();
    }
  
    /**
     * 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
     * @param year
     * @param month
     * @param date
     * @param hour
     * @param minute
     * @param seconds
     * @return YYYY-MM-ddTHH:mm:ss.999+8:00
     */
    public static final String toNiagaraStdString(int year, int month, int date, int hour, int minute, int seconds) {
        return formatValueLength(year, 4) + "-" + getMonthValue(month) + "-" + formatValueLength(date, 2) + "T" + formatValueLength(hour, 2) + ":" + formatValueLength(minute, 2) + ":" + formatValueLength(seconds, 2) + ".999+8:00";
    }
  
    /**
     * 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
     * @param date
     * @param clock
     * @return YYYY-MM-ddTHH:mm:ss.999+8:00
     * @throws Exception
     */
    public static final String toNiagaraStdString(String date, String clock) throws Exception {
        if (date == null || date.equals("")) {
            throw new Exception("TimeFormatter can not convert string where date Length is 0");
        }
        if (clock == null || clock.equals("")) {
            throw new Exception("TimeFormatter can not convert string where clock Length is 0");
        }
        return date + "T" + clock + ".999-8:00";
    }

    /**
     * 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
     * @param year
     * @param month
     * @param date
     * @param hour
     * @param minute
     * @param seconds
     * @return YYYY-MM-ddTHH:mm:ss.999+8:00
     */
    public static final String toNiagaraStdString(String year, String month, String date, String hour, String minute, String seconds) {
        return formatValueLength(year, 4) + "-" + getMonthValue(month) + "-" + formatValueLength(date, 2) + "T" + formatValueLength(hour, 2) + ":" + formatValueLength(minute, 2) + ":" + formatValueLength(seconds, 2) + ".999+8:00";
    }

    /**
     * Make a String for int with the given length, lead by "0"
     * @param v the value needs format
     * @param l the total length needed
     * @return formatted string
     */
    private static final String formatValueLength(int v, int l) {
        String result = String.valueOf(v);
        for (;;) {
            if (result.length() >= l) {
                break;
            }
            result = "0" + result;
        }
        return result;
    }
  
    /**
     * Make a String for int with the given length, lead by "0"
     * @param v the string needs format
     * @param l the total length needed
     * @return formatted string
     */
    private static final String formatValueLength(String v, int l) {
        String result = v;
        for (;;) {
            if (result.length() >= l) {
                break;
            }
            result = "0" + result;
        }
        return result;
    }

    /**
     * month is 0~11, format as 00~11
     * @param m month index (0~11)
     * @return two digital string
     */
    private static final String getMonthValue(int m) {
        return formatValueLength(m,2);
    }

    /**
     * month is in String mode, format as 01~12
     * @param m month string, can be Jan/Feb/..., January/February/..., or index
     * @return two digital string
     */
    private static final String getMonthValue(String m) {
        String t = m.toLowerCase();
        if (t.equals("0") || t.equals("00") || t.equals("jan") || t.equals("january")) {
            return "01";
        }
        if (t.equals("1") || t.equals("01") || t.equals("feb") || t.equals("febuary")) {
            return "02";
        }
        if (t.equals("2") || t.equals("02") || t.equals("mar") || t.equals("march")) {
            return "03";
        }
        if (t.equals("3") || t.equals("03") || t.equals("apr") || t.equals("april")) {
            return "04";
        }
        if (t.equals("4") || t.equals("04") || t.equals("may")) {
            return "05";
        }
        if (t.equals("5") || t.equals("05") || t.equals("jun") || t.equals("june")) {
            return "06";
        }
        if (t.equals("6") || t.equals("06") || t.equals("jul") || t.equals("july")) {
            return "07";
        }
        if (t.equals("7") || t.equals("07") || t.equals("aug") || t.equals("august")) {
            return "08";
        }
        if (t.equals("8") || t.equals("08") || t.equals("sep") || t.equals("september") || t.equals("sept")) {
            return "09";
        }
        if (t.equals("9") || t.equals("09") || t.equals("oct") || t.equals("october") || t.equals("octo")) {
            return "10";
        }
        if (t.equals("10") || t.equals("nov") || t.equals("november") || t.equals("nove")) {
            return "11";
        }
        if (t.equals("11") || t.equals("dec") || t.equals("december") || t.equals("dece")) {
            return "12";
        }
        return "00";
    }

    /**
     * 将BAbsTime格式化为 YYYY-MM-dd HH:mm:ss
     * @param t
     * @return YYYY-MM-dd HH:mm:ss
     */
    public static final String makeAbsTimeString(BAbsTime t) {
        StringBuffer s = new StringBuffer();
        s.append(formatValueLength(t.getYear(), 4));
        s.append("-");
        s.append(formatValueLength(t.getMonth().getMonthOfYear(), 2));
        s.append("-");
        s.append(formatValueLength(t.getDay(), 2));
        s.append(" ");
        s.append(formatValueLength(t.getHour(), 2));
        s.append(":");
        s.append(formatValueLength(t.getMinute(), 2));
        s.append(":");
        s.append(formatValueLength(t.getSecond(), 2));
        return s.toString();
    }
  
    /**
     * 将BAbsTime的日期格式化为 YYYY-MM-dd
     * @param t
     * @return YYYY-MM-dd
     */
    public static final String makeAbsDateString(BAbsTime t) {
        StringBuffer s = new StringBuffer();
        s.append(formatValueLength(t.getYear(), 4));
        s.append("-");
        s.append(formatValueLength(t.getMonth().getMonthOfYear(), 2));
        s.append("-");
        s.append(formatValueLength(t.getDay(), 2));
        return s.toString();
    }
  
    /**
     * 将BRelTime格式化为 d:HH:mm:ss
     * @param t
     * @return d:HH:mm:ss
     */
    public static final String makeRelTimeString(BRelTime t) {
        StringBuffer s = new StringBuffer();
        s.append(t.getDays());
        s.append(":");
        s.append(formatValueLength(t.getHours(), 2));
        s.append(":");
        s.append(formatValueLength(t.getMinutes(), 2));
        s.append(":");
        s.append(formatValueLength(t.getSeconds(), 2));
        return s.toString();
    }
}