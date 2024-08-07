![](https://socialify.git.ci/Travellerrr/mirai-otto-hzys/image?description=1&font=Raleway&forks=1&issues=1&language=1&name=1&owner=1&pattern=Circuit%20Board&pulls=1&stargazers=1&theme=Auto)


# ♿Mirai Console的电棍活字印刷插件♿

## 指令
|            指令             |                    **权限节点**                    |        功能        |
|:-------------------------:|:----------------------------------------------:|:----------------:|
|          `/活字印刷`          | `cn.travellerr.otto-hzys:command.hzys`  |      活字印刷      |

---

## 配置

音频处理配置在 `./config/cn.travellerr.otto-hzys/config.yml` 中

```yaml
# ffmpeg目录路径
ffmpegPath: ''
```

不填默认使用Mirai Silk Converter进行音频转换，否则使用填入的ffmpeg进行转换

<br>

主配置在 `data/cn.travellerr.otto-hzys/ysddTable.json` 下

>
>  ``` json
> {
>	"mi yu shuo de dao li": "miyu",
>	"a mi yu shuo de dao li": "miyu",
>	"da jia hao a": "djha",
>	"wo shi shuo de dao li": "wssddl",
>	"jin tian lai dian da jia xiang kan de dong xi": "jtlaidian",
>	"jin tian lai dian er da jia xiang kan de dong xi": "jtlaidian",
>	"shuo de dao li": "sddl",
>	"bo bi shi wo die": "bobi",
>	"a ma bo bi shi wo die": "bobi",
>	"wo cao bing": "wcb",
>	"wo cao ^ bing": "wcb",
>	"xuan gou": "xg",
>	"a mi nuo si": "amns",
>	"a ^ er cha shu mei la": "ecs",
>	"a er cha shu mei la": "ecs",
>	"ao li an fei ^ ei ai lou ai lou ^ ai ng": "alaf",
>	"ao li an fei ei ai lou ai lou ^ ai ng": "alaf",
>	"ao li an fei": "alaf",
>	"bie zhui la": "bzl",
>	"bie zhui le": "bzl",
>	"bu ke yi": "bky",
>	"bu shi ni ma e xin ren ni you ge du": "bsnmexrnygd",
>	"bu shi ni e xin ren ni ye you ge du": "bsnmexrnygd",
>	"bu shi ni ta ma e xin ren ye you ge du": "bsnmexrnygd",
>	"bu shi ni ma e xin ren ni ye you ge du": "bsnmexrnygd",
>	"cao ni ma ^ ni zhei zhong di fen gou zai zhe tai gang ni": "cnmnzzdfgzztgn",
>	"cao ni ma ni zhei zhong di fen gou zai zhe tai gang ni": "cnmnzzdfgzztgn",
>	"chi ning meng kai da a": "cnmkd",
>	"chi ning meng kai da": "cnmkd",
>	"cao ni ma kai da a": "cnmkd",
>	"cao ni ma kai da": "cnmkd",
>	"chao ni ma kai da a": "cnmkd",
>	"chao ni ma kai da": "cnmkd",
>	"chong ci": "cc",
>	"dao li": "dl",
>	"ha ha ha ha": "hhhh",
>	"du du du": "ddd",
>	"dui you ne ^ jiu yi xia a": "dynjyxa",
>	"dui you ne ^ jiu yi xia ": "dynjyxa",
>	"dui you ne jiu yi xia a": "dynjyxa",
>	"dui you ne jiu yi xia": "dynjyxa",
>	"e^ ni zen me si le ^": "enzmsl",
>	"ei ni zen me si le ^": "enzmsl",
>	"e^ ni zen me si le": "enzmsl",
>	"ei ni zen me si le": "enzmsl",
>	"ji lao zi si ^": "glzs",
>	"gei lao zi si ^": "glzs",
>	"ji lao zi si": "glzs",
>	"gei lao zi si": "glzs",
>	"ha bi xia": "hbx",
>	"hao e xin a ^": "hexa",
>	"hao e xin a": "hexa",
>	"ji bai": "jb",
>	"kai da a ^": "kda",
>	"kai da a": "kda",
>	"ma shei han jian ^": "mshj",
>	"ma shei han jian": "mshj",
>	"mei shou guo zhei me da wei qu ^ cong xiao dao da ^": "msgzmdwqcxdd",
>	"mei shou guo zhei me da wei qu cong xiao dao da ^": "msgzmdwqcxdd",
>	"mei shou guo zhei me da wei qu ^ cong xiao dao da": "msgzmdwqcxdd",
>	"mei shou guo zhei me da wei qu cong xiao dao da": "msgzmdwqcxdd",
>	"mei shou guo zhe me da wei qu ^ cong xiao dao da ^": "msgzmdwqcxdd",
>	"mei shou guo zhe me da wei qu cong xiao dao da ^": "msgzmdwqcxdd",
>	"mei shou guo zhe me da wei qu ^ cong xiao dao da": "msgzmdwqcxdd",
>	"mei shou guo zhe me da wei qu cong xiao dao da": "msgzmdwqcxdd",
>	"nei wo que de zhei ge ying yang ^ shei ji wo bu a ^": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang zhei kuai ^ shei ji wo bu a ^": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang zhei kuai shei ji wo bu a ^": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang zhei kuai ^ shei ji wo bu a": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang zhei kuai shei ji wo bu a": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang shei ji wo bu a": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang ^ shei gei wo bu a ^": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang zhei kuai ^ shei gei wo bu a ^": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang zhei kuai shei gei wo bu a ^": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang zhei kuai ^ shei gei wo bu a": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang zhei kuai shei gei wo bu a": "nwqdzgyyzksgwba",
>	"nei wo que de zhei ge ying yang shei gei wo bu a": "nwqdzgyyzksgwba",
>	"ni bu xu shuo ta ^": "nbxst",
>	"ni bu xu shuo ta": "nbxst",
>	"ni xi huan wo ^": "nxhw",
>	"ni xi huan wo": "nxhw",
>	"ou nei de shou ^ hao han ^": "ondshh",
>	"ou nei de shou ^ hao han": "ondshh",
>	"ou nei de shou hao han ^": "ondshh",
>	"ou nei de shou hao han": "ondshh",
>	"sa bi": "sb",
>	"sha bi": "sb",
>	"ta shi wo die ^": "tswd",
>	"ta shi wo die": "tswd",
>	"wei shen me ya": "wsmy",
>	"wo cao ni ma ^": "wcnm",
>	"wo cao ni ma": "wcnm",
>	"wo chao ni ma ^": "wcnm",
>	"wo chao ni ma": "wcnm",
>	"wo xi huan ni ^": "wxhn",
>	"wo xi huan ni": "wxhn",
>	"wo cao si ni de ma": "wcsndm",
>	"wo chao si ni de ma": "wcsndm",
>	"wo chong shi ni de meng": "wcsndm",
>	"yi de ge la mi": "ydglm",
>	"yuan zi dan": "yzd",
>	"zhu bi ba ^ zhei zen me zhei me cai a": "zbbzzmzmca",
>	"zhu bi ba zhei zen me zhei me cai a": "zbbzzmzmca",
>	"zhu bi ba zhe zen me zhei me cai a": "zbbzzmzmca",
>	"zhu bi ba zhei zen me zhe me cai a": "zbbzzmzmca",
>	"zhu bi ba zhe zen me zhe me cai a": "zbbzzmzmca",
>	"wa ao ^": "wa",
>	"wa ao": "wa",
>	"wo cao ^": "wc",
>	"wo cao": "wc",
>	"ha li lu da xuan feng ^": "hlldxf",
>	"ha li lu da xuan feng": "hlldxf"
> }
> ```
>

**键** 为触发文字的**拼音**
**值** 为出发后替换的**音频文件名称(不带后缀)**

原声大碟的音频请全部放置于`data/cn.travellerr.otto-hzys/ysddSource` 内，其余拼接音频请放置于`data/cn.travellerr.otto-hzys/source` 内

---

## 食用方法

下载Release中的插件与 `resource.zip`，将插件放入`plugins`文件夹后，将`resource.zip`解压在路径`./data/cn.travellerr.otto-hzys` 下，构造如下

```cmd
data/
└─ cn.travellerr.otto-hzys/
   │
   ├─ ysddTable.json
   │
   ├─ ysddSources/
   │  └─ 原声大碟文件.wav
   │
   └─ sources/
      └─ 音频文件.wav
```

**_请配置ffmpeg路径或搭配[Mirai Silk Converter](https://github.com/project-mirai/mirai-silk-converter)使用！_**

---

本插件灵感与部分资源均来源于[Github上的开源项目HUOZI](https://github.com/sakaneko117/HUOZI)
