# record-rt

自定义的history record，用于同步。
含history record使用的enum
***
## ENUMS

| 名称 | 说明 |
|:-------------:|:----------------:|
| [DirectEnum](./doc/enums/DirectEnum.md) | 方向，包含静止时无方向 |
| [HistoryPolicyEnum](./doc/enums/HistoryPolicyEnum.md) | 模拟量在一个时间段内整理为单点历史记录方式 |
| [HistoryRecordMethodEnum](./doc/enums/HistoryRecordMethodEnum.md) | 模拟量历史记录方式，用于时序连续记录 |
| [HistoryTagEnum](./doc/enums/HistoryTagEnum.md) | 历史纪录时间间隔类型 |
| [HistoryTypeEnum](./doc/enums/HistoryTypeEnum.md) | 历史纪录分类，用于查询时指定类型 |
| [LatTagEnum](./doc/enums/LatTagEnum.md) | 纬度标签 |
| [LngTagEnum](./doc/enums/LngTagEnum.md) | 经度标签 |
| [LogTypeEnum](./doc/enums/LogTypeEnum.md) | 事件日志内容类型 |

***
## RECORDS

| 名称 | 说明 |
|:-------------:|:----------------:|
| [AlarmCountHistoryRecord](./doc/records/AlarmCountHistory.md) | 报警统计记录 |
| [BooleanHistoryRecord](./doc/records/BooleanHistory.md) | 布尔值记录 |
| [DeviceSumamryRecord](./doc/records/DeviceSumamry.md) | 设备状态记录 |
| [EnergyIntervalRecord](./doc/records/EnergyInterval.md) | 能耗定时记录 |
| [GpsPositionHistoryRecord](./doc/records/GpsPositionHistory.md) | GPS轨迹记录 |
| [LogTrendRecord](./doc/records/LogTrend.md) | 日志记录 |
| [NumericHistoryRecord](./doc/records/NumericHistory.md) | 模拟量记录 |
| [RunCountHistoryRecord](./doc/records/RunCountHistory.md) | 运行状态统计记录 |
| [StationSummaryRecord](./doc/records/StationSummary.md) | 站点状态记录 |
