# BLogTrendRecord
extends **BHistoryRecord**  
日志记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| time | BAbsTime | BAbsTime..now() | 日志时间 |
| logText | String | "-" | 日志内容 |
