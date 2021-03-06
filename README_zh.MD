# File-Sync-J

[English](https://github.com/codflow/file-sync-j/blob/master/README.MD) | 中文

File-Sync-J 是以文件为粒度的同步工具，由Java编写。它作为中间人用不同的同步模式将两个文件系统节点进行同步（一个是目标节点，一个是源节点）。支持传统文件协议（SFTP，FTP,SMB等），还支持流行的文件服务，比如对象存储。作者的愿景是编写一个能支持大部分主流的文件传输系统的同步程序及其背靠的易于接入的框架


## 开始入门

在装有Java环境下执行程序

```
    java -jar file-sync-j-0.0.1-alpha.jar
```

### 添加节点
   ![step1](https://raw.githubusercontent.com/codflow/file-sync-j/master/doc/images/main_ui_0.png)

    1.按下主界面的"Add Endpoint"按钮添加节点。
    
    2.选择节点类型（目前支持本地文件系统和SFTP,更多支持持续添加中）。

    3.点击Test按钮测试节点信息，测试成功在Type旁会显示绿圈以示通过。

  ![step4](https://raw.githubusercontent.com/codflow/file-sync-j/master/doc/images/endpoint_sftp_0.png)

    4.点击 "Add" 添加节点.

### 同步节点

  ![step1](https://raw.githubusercontent.com/codflow/file-sync-j/master/doc/images/main_ui_1.png)

  
    1.选择一个源节点和一个目标节点（不能是同一个节点）。

    2.点击同步.

## 模式

当前支持两种备份模式

SYNC: 保持目标节点与源节点一致

INC: 从源节点获取新更新的文件但是不删除源端删除的文件
