# BEnumHistoryRecord
extends **BEnumTrendRecord**  
枚举值记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| typeTag | [BHistoryTagEnum](../enums/HistoryTagEnum.md) | [BHistoryTagEnum](../enums/HistoryTagEnum.md).DEFAULT | 记录数据的统计时间类型 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| t | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| v | `this.getValue()` | 记录值 | String |
| s | `this.getStatus().getBits()` | 数据状态 | int |

## lexicon
| key | value |
|:-------|:------|
| api.json.enumHistory.timestamp.mills | t |
| api.json.enumHistory.value | v |
| api.json.enumHistory.statue | s |

```
api.json.enumHistory.timestamp.mills=t
api.json.enumHistory.value=v
api.json.enumHistory.statue=s
```