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

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| endAt | `this.getEndAt().getMillis()` | 记录截止时间(毫秒) | long |
| meterRead | `this.getMeterRead()` | 表读数 | double |
| cost | `this.getCost()` | 记录周期内消耗 | double |

## lexicon
| key | value |
|:-------|:------|
| api.json.energy.endAt.mills | endAt |
| api.json.energy.meterRead | meterRead |
| api.json.energy.cost | cost |

```
api.json.energy.endAt.mills=endAt
api.json.energy.meterRead=meterRead
api.json.energy.cost=cost
```