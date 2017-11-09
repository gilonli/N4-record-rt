# BRunCountHistoryRecord
extends **BTrendRecord**  
运行状态统计记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| typeTag | [BHistoryTagEnum](../enums/HistoryTagEnum.md) | [BHistoryTagEnum](../enums/HistoryTagEnum.md).DEFAULT | 记录数据的统计时间类型 |
| value | boolean | false | 记录的运行状态(记录运行还是停止状态) |
| startCount | int | 0 | 启动次数 |
| startFrom | BAbsTime | BAbsTime.DEFAULT | 本条记录起始时间 |
| EndAt | BAbsTime | BAbsTime.DEFAULT | 本条记录截至时间 |
| keptTime | BRelTime | BRelTime.DEFAULT | 本记录时间段内处于记录状态的时间 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| timestamp | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| tag | `this.getTypeTag()` | 记录数据的统计时间类型 | minute/hour/day/week/month/year/cov |
| value | `this.getValueString()` | 记录的运行状态(记录运行还是停止状态) | `this.getLexicon.get("api.json.value.runCount.value.*")` |
| count | `this.getStartCount()` | 启动次数 | long |
| startFrom | `this.getStartFrom().getMillis()` | 记录内容起始时间戳(毫秒) | long |
| endAt | `this.getEndAt().getMillis()` | 记录内容截止时间戳(毫秒) | long |
| keptTime | `this.getKeptTime().getMillis()` | 本记录时间段内处于记录状态的时间(毫秒) | long |

## lexicon
| key | value |
|:-------|:------|
| api.json.runCount.timestamp.mills | timestamp |
| api.json.runCount.tag | tag |
| api.json.runCount.value | value |
| api.json.runCount.startCount | count |
| api.json.runCount.startFrom.mills | startFrom |
| api.json.runCount.endAt.mills | endAt |
| api.json.runCount.keptTime.mills | keptTime |
| api.json.value.runCount.value.true | run |
| api.json.value.runCount.value.false | stop |

````
api.json.value.runCount.value.true=run
api.json.value.runCount.value.false=stop

json.api.runCount.timestamp=timestamp
json.api.runCount.tag=tag
json.api.runCount.value=value
json.api.runCount.startCount=count
json.api.runCount.startFrom.mills=startFrom
json.api.runCount.endAt.mills=endAt
json.api.runCount.keptTime.mills=keptTime
```