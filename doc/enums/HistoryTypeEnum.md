# BHistoryTypeEnum
extends **BFrozenEnum**

历史纪录分类，用于查询时指定类型

## 取值
| note | tag | value |
|:------:|:------:|------:|
| 概况（统计数据） | summary | 0 |
| 运行状态（开停机） | runState | 1 |
| 报警状态 | alarmState | 2 |
| 日志 | log | 3 |
| 能耗 | energy | 4 |
| 测量数值（测量值） | meterRead | 5 |
| 数据变化（设定值） | cov | 6 |


## 默认值
defaultValue = "summary"
