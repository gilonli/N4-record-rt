# BBooleanHistoryRecord
extends **BTrendRecord**  
布尔值记录
存储时对应时间类型提前整理，以便加速查询

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| typeTag | [BHistoryTagEnum](../enums/HistoryTagEnum.md) | [BHistoryTagEnum](../enums/HistoryTagEnum.md).DEFAULT | 记录数据的统计时间类型 |
| value | boolean | false | 布尔值 |
