# BStationSummaryRecord
extends **BTrendRecord**  
站点状态记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| typeTag | [BHistoryTagEnum](../enums/HistoryTagEnum.md) | [BHistoryTagEnum](../enums/HistoryTagEnum.md).DEFAULT | 记录数据的统计时间类型 |
| deviceCount | long | 0l | 设备总数量 |
| deviceOnlineCount | long | 0l | 周期内在线设备数量 |
| deviceRunCount | long | 0l | 周期内运行设备数量 |
| deviceRunMinutesInHour | long | 0l | 周期内设备运行总分钟数 |
| deviceAlarmingCount | long | 0l | 周期内报警设备数量 |
