![](https://socialify.git.ci/Travellerrr/mirai-otto-hzys/image?description=1&font=Raleway&forks=1&issues=1&language=1&name=1&owner=1&pattern=Circuit%20Board&pulls=1&stargazers=1&theme=Auto)


# ♿Mirai Console的电棍活字印刷插件♿
## 指令
|            指令             |        功能        |  作用域   |
|:-------------------------:|:----------------:|:------:|
|          `/活字印刷`          |      活字印刷      | **所有** |

## 权限节点

指令系统权限节点如下

| **指令** |                    **权限节点**                    |
|:------:|:----------------------------------------------:|
| `活字印刷` |     `cn.travellerr.otto-hzys:command.hzys`      |

## 配置

唯一配置在 `data/cn.travellerr.otto-hzys/ysddTable.json` 下

``` json
{
	"mi yu shuo de dao li": "miyu",
	"a mi yu shuo de dao li": "miyu",
	"da jia hao a": "djha",
	"wo shi shuo de dao li": "wssddl",
	"jin tian lai dian da jia xiang kan de dong xi": "jtlaidian",
	"jin tian lai dian er da jia xiang kan de dong xi": "jtlaidian",
	"shuo de dao li": "sddl",
	"bo bi shi wo die": "bobi",
	"a ma bo bi shi wo die": "bobi"
}
```

**key** 为触发文字的**拼音**
**value** 为出发后替换的**音频文件名称(不带后缀)**

原声大碟的音频请全部放置于`data/cn.travellerr.otto-hzys/ysddSource` 内

---

~~我好闲啊写这个~~
