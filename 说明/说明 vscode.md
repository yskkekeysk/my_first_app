# 2. Visual Studio 问题

        Windows 开发需要完整的 Visual Studio 安装：
        打开 Visual Studio Installer
        点击 修改 (Modify)
        确保以下工作负载已安装：
        ✅ 使用 C++ 的桌面开发 (Desktop development with C++)
        ✅ 通用 Windows 平台开发 (Universal Windows Platform development)
        点击 修改 完成安装

# 创建第一个 Flutter 项目测试

        # 创建新项目
        flutter create my_first_app
        # 进入项目
        cd my_first_app
        # 运行项目（确保连接了Android设备或模拟器）
        flutter run
        # 4. 如果要在 Chrome 中运行
            flutter run -d chrome

    # 5. 安装 VS Code 扩展（推荐）
        如果使用 VS Code：
        安装 Flutter 扩展
        安装 Dart 扩展
        按 F5 可以直接运行调试

    # 6. 配置 Android Studio / IntelliJ IDEA
        安装 Flutter 插件
        安装 Dart 插件
        配置 Flutter SDK 路径：$env:USERPROFILE\dev\flutter

    # 验证安装完成
        运行以下命令确认一切正常：
        powershell
        # 检查所有环境
        flutter doctor -v
        # 创建并运行示例项目
        flutter create --sample=widgets.LandingPage my_demo_app
        cd my_demo_app
        flutter run
    # 如果还有问题
            如果 flutter doctor 显示仍有问题，请运行：
            powershell
            # 获取详细错误信息
            flutter doctor -v
            # 尝试修复
            flutter doctor --android-licenses
    # 常用命令备忘
            powershell
            # 升级 Flutter
            flutter upgrade
            # 获取包依赖
            flutter pub get
            # 构建 APK
            flutter build apk
            # 运行测试
            flutter test
            # 清理项目
            flutter clean
    # 重启计算机
        完成所有配置后，建议重启计算机，以确保所有环境变量生效。
        重启后，在任何地方打开 PowerShell，都可以直接使用 flutter 命令了！
    # 总结： 您现在已经成功安装了 Flutter，接下来就是根据 flutter doctor 的提示配置其他开发环境（Android Studio、VS Code 等），然后就可以开始 Flutter 开发了。
