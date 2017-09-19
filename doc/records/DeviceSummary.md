# BDeviceSummaryRecord
extends **BTrendRecord**  
设备状态记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| typeTag | [BHistoryTagEnum](../enums/HistoryTagEnum.md) | [BHistoryTagEnum](../enums/HistoryTagEnum.md).DEFAULT | 记录数据的统计时间类型 |
| deviceLogTag | [BLogTypeEnum](../enums/LogTypeEnum.md) | [BLogTypeEnum](../enums/LogTypeEnum.md).DEFAULT | 事件类型 |
| startTime | BAbsTime | BAbsTime.DEFAULT | 时间起始时间 |
| endTime | BAbsTime | BAbsTime.DEFAULT | 事件截止时间 |
| holdTime | BRelTime | BRelTime.DEFAULT | 事件持续时间 |
| note | String | "-" | 备注信息 |
