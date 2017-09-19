# BEnergyIntervalRecord
extends **BTrendRecord**  
能耗定时记录
不限定类型，可以是电费、气费、水费等各种类型

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| typeTag | [BHistoryTagEnum](../enums/HistoryTagEnum.md) | [BHistoryTagEnum](../enums/HistoryTagEnum.md).DEFAULT | 记录数据的统计时间类型 |
| EndAt | BAbsTime | BAbsTime.DEFAULT | 记录截止时间 |
| meterRead | double | 0.0d | 表读数 |
| cost | double | 0.0d | 记录周期内消耗 |
| fee | double | 0.0d | 记录周期内平均价格 |
| bill | double | 0.0d | 记录周期内的费用 |
