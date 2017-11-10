# BBooleanHistoryRecord
extends **BTrendRecord**  
布尔值记录
存储时对应时间类型提前整理，以便加速查询

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| typeTag | [BHistoryTagEnum](../enums/HistoryTagEnum.md) | [BHistoryTagEnum](../enums/HistoryTagEnum.md).DEFAULT | 记录数据的统计时间类型 |
| value | boolean | false | 布尔值 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| timestamp | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| value | `this.getValue()` | 记录值 | boolean |
| statue | `this.getStatus().getBits()` | 数据状态 | int |

## lexicon
| key | value |
|:-------|:------|
| api.json.booleanHistory.timestamp.mills | timestamp |
| api.json.booleanHistory.value | value |
| api.json.booleanHistory.statue | statue |

```
api.json.booleanHistory.timestamp.mills=timestamp
api.json.booleanHistory.value=value
api.json.booleanHistory.statue=statue
```