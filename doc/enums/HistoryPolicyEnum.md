# BHistoryPolicyEnum
extends **BFrozenEnum**

模拟量在一个时间段内整理为单点历史记录方式

## 取值
| note | tag | value |
|:------:|:------:|------:|
| 平均值 | average | 0 |
| 总和 | sum | 1 |
| 最大值 | max | 2 |
| 最小值 | min | 3 |
| 实时值 | input | 4 |

## 默认值
defaultValue = "input"
