# BAlarmCountHistoryRecord
extends **BTrendRecord**  
报警统计记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| typeTag | [BHistoryTagEnum](../enums/HistoryTagEnum.md) | [BHistoryTagEnum](../enums/HistoryTagEnum.md).DEFAULT | 记录数据的统计时间类型 |
| value | boolean | false | 记录的报警状态（记录报警还是正常状态） |
| alarmCount | int | 0 | 报警次数 |
| startFrom | BAbsTime | BAbsTime.DEFAULT | 本条记录起始时间 |
| EndAt | BAbsTime | BAbsTime.DEFAULT | 本条记录截至时间 |
| keptTime | BRelTime | BRelTime.DEFAULT | 本记录时间段内处于记录状态的时间 |
