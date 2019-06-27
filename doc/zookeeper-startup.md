# Zookeeper启动说明
- 从 http://mirror.bit.edu.cn/apache/zookeeper/zookeeper-3.5.5/ 下载`apache-zookeeper-3.5.5-bin.tar.gz`，解压后进入`conf/`文件夹，将`zoo_sample.cfg`复制为`zoo.cfg`.
- 启动脚本为`bin/zkServer.sh`，进入`bin/`目录：
	- `./zkServer.sh start` 后台启动 (使用`stop`参数关闭之)
	- `./zkServer.sh start-foreground` 前台启动

![](images/zookeeper.png)