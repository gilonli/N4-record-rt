# BGpsPositionHistoryRecord
extends **BTrendRecord**  
GPS轨迹记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| typeTag | [BHistoryTagEnum](../enums/HistoryTagEnum.md) | [BHistoryTagEnum](../enums/HistoryTagEnum.md).DEFAULT | 记录数据的统计时间类型 |
| longitude | String | "nan" | 经度值 |
| longitudeTag | [BLngTagEnum](../enums/LngTagEnum.md) | [BLngTagEnum](../enums/LngTagEnum.md).east | 经度方向 |
| latitude | String | "nan" | 纬度值 |
| latitudeTag | [BLatTagEnum](../enums/LatTagEnum.md) | [BLatTagEnum](../enums/LatTagEnum.md).north | 纬度方向 |
| height | String | "nan" | 海拔高度（字符串，可含单位） |
| speed | String | "nan" | 运动速度（字符串，可含单位） |
| directAngel | double | 0.0d | 方向角 |
| directTag | [BDirectEnum](../enums/DirectEnum.md) | [BDirectEnum](../enums/DirectEnum.md).still | 运动方向 |
| updateTime | BAbsTime | BAbsTime.DEFAULT | 位置更新时间 |
| satelliteCount | String | "nan" | 卫星状态 |
