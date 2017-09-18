# BLogTypeEnum
extends **BFrozenEnum**

事件日志内容类型

## 取值
| note | tag | value |
|:------:|:------:|------:|
| 登陆 | login | 0 |
| 设定 | modify | 1 |
| 远程JACE上线 | stationOnline | 2 |
| 远程JACE掉线 | stationOffline | 3 |
| 远程JACE报警 | stationAlarm | 4 |
| 远程JACE报警解除 | stationRecover | 5 |
| 设备上线 | deviceOnline | 6 |
| 设备断线 | deviceOffline | 7 |
| 设备启动 | deviceStart | 8 |
| 设备停机 | deviceStop | 9 |
| 设备报警 | deviceAlarm | 10 |
| 设备报警解除 | deviceReset | 11 |
| 控制点报警 | pointAlarm | 12 |
| 控制点报警解除 | pointReset | 13 |

## 默认值
defaultValue = "modify"
