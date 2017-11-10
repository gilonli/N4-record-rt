# BStringHistoryRecord
extends **BStringTrendRecord**  
字符串记录

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| timestamp | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| value | `this.getValue()` | 记录值 | String |
| statue | `this.getStatus().getBits()` | 数据状态 | int |

## lexicon
| key | value |
|:-------|:------|
| api.json.stringHistory.timestamp.mills | timestamp |
| api.json.stringHistory.value | value |
| api.json.stringHistory.statue | statue |

```
api.json.stringHistory.timestamp.mills=timestamp
api.json.stringHistory.value=value
api.json.stringHistory.statue=statue
```