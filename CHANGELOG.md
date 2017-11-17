# Change Log

## record-rt v1.3 - Released on Nov 17, 2017
* 为满足包名全小写规则，将com.guardian.historyRecord改为[com.guardian.history.record](src/com/guardian/history/records)，将com.guardian.historyRecord.enums改为[com.guardian.enums](src/com/guardian/enums)

## record-rt v1.2 - Released on Nov 13, 2017
* 增加**报警点类型**枚举[BAlarmLevelTypeEnum](./doc/enums/AlarmLevelTypeEnum.md)
* [EnumHistoryRecord](./doc/records/EnumHistory.md)，[StringHistoryRecord](./doc/records/StringHistory.md)增加tag字段和set()方法
* 缩减JSON的key长度
* 修正[BAlarmLogRecord](./doc/records/AlarmLogRecord.md)和[BAlarmOpenRecord](./doc/records/AlarmOpenRecord.md)的stationDisplayName属性的拼写，并增加字符串常量作为AlarmData的key

## record-rt v1.1 - Released on Nov 9, 2017
* 增加**报警完整日志记录**类型[BAlarmLogRecord](./doc/records/AlarmLogRecord.md)和**报警发生日志记录**类型[BAlarmOpenRecord](./doc/records/AlarmOpenRecord.md)
* Enums增加以下方法
    * `static String getDisplayText(TYPE enumValue)` 
    * `String getDisplayText()`
* Enums覆盖BFrozenEnums的以下方法
    * `String getDisplayTag(Context context)`
    * `String toString(Context context)`
* 继承JSONObject和JSONArray的类[JSONObj](src/com/guardian/json/JSONObj.java)和[JSONList](src/com/guardian/json/JSONList.java)，覆盖了原`toString()`方法，处理了生成字符串时unicode编码"$u"开头的问题
* 调整[EnergyIntervalRecord](./doc/records/EnergyInterval.md)，增加[FeeIntervalRecord](./doc/records/FeeInterval.md)，[EnumHistoryRecord](./doc/records/EnumHistory.md)，[StringHistoryRecord](./doc/records/StringHistory.md)
* 历史记录定义中实现了[JSONSupport](src/com/guardian/json/JSONSupport.java)接口
* module.lexicon默认为中文，在lexicon文件夹下提供英文lexicon文件[record.lexicon](src/lexicons/record.lexicon)
* 版本号升级和文档更新