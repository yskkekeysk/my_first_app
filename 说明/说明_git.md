#

#

# 以下是两种操作方式的具体步骤：

# 🟢 方式一：本地初始化 Git 仓库（仅本地版本控制）

        适合只想在本地记录代码历史，不上传到网络。
        点击 Initialize Repository
        系统会自动在当前文件夹创建 .git 隐藏文件夹（Git 仓库）。
        看到变化
        初始化后，源代码管理面板会显示当前文件的改动（如果有）。
        可以输入提交信息，然后点击 ✔ 提交（Commit）。

# 🟡 方式二：直接发布到 GitHub（推荐新手）

        适合想直接把代码备份到 GitHub 并启用版本控制。
        点击 Publish to GitHub
        如果没有登录 GitHub，会弹出浏览器要求授权登录。
        选择仓库类型
        公开（Public）：代码所有人都能看到。
        私有（Private）：只有自己能看到。
        自动完成
        VS Code 会自动：
        初始化本地 Git 仓库。
        在 GitHub 上创建同名远程仓库。
        推送所有文件到 GitHub。

# 📌 操作后建议

    如果选择方式一，后续想上传 GitHub，可以在终端运行：
    git remote add origin https://github.com/用户名/仓库名.git
    git push -u origin main
    如果选择方式二，后续直接使用 VS Code 的源代码管理面板进行提交（Commit）和推送（Push）即可。

# 🔧 方法一：通过终端命令（推荐）

        打开 VS Code 终端
                Terminal → New Terminal
        查看当前远程地址
                git remote -v
        会显示类似：
                origin  https://github.com/yskkekeysk/xxx.git (fetch)
                origin  https://github.com/yskkekeysk/xxx.git (push)
        删除旧远程地址
                git remote remove origin
        添加新远程地址
                git remote add origin https://github.com/你的用户名/新仓库.git
        推送到新远程仓库
                git push -u origin main

# 🔧 方法二：通过 VS Code 图形界面

        点击左下角分支图标（显示 main 或当前分支名的地方）
        选择 Remote → Add Remote
        输入新的 GitHub 仓库地址
        确认后重新推送

# 你不是在“设置密码”，而是在第一次向GitHub推送代码时，需要“输入访问令牌”。

        核心就两步：
                什么时候需要？
                        当你在终端第一次运行 git push 命令时，会弹出一个窗口让你输入 Username 和 Password。
                现在该怎么做？
                        Username：填你的 GitHub 用户名。
                        Password：不要填登录密码，而是去填你事先在 GitHub 网站上生成的 Personal Access Token。
                获取这个 Token 的路径：
                        登录 GitHub 网站 → 点击右上角头像 → Settings → 左侧最下方 Developer settings → Personal access tokens → Tokens (classic) → 点击 Generate new token。

                一句话总结：下次Git向你要密码时，就把从GitHub网站上复制的那个Token粘贴进去。


       简单来说：
                操作	        公开仓库 (Public Repository)	私有仓库 (Private Repository)
                git pull (拉取)	 不需要 任何认证	         需要 认证 (和 push 一样)
                git push (推送)   需要  认证 (你有推送权限才行)	  需要 认证

                详细说明：
                        对公开仓库（Public）：
                        git pull：任何人都可以读取/拉取代码，就像浏览网页一样，完全不需要密码或令牌。
                        git push：只有仓库所有者或协作者才能推送，所以一定需要认证（输入 Token 或使用 SSH 密钥）。
                对私有仓库（Private）：
                        无论是 pull 还是 push，都涉及到访问你的私人数据，所以每次都要求认证。

                对你来说，这意味着：
                        如果你只是在拉取公开的开源项目代码（比如 git pull origin main），永远不会被要求输入密码。
                        如果你在操作自己的私有仓库，那么首次 pull 时，系统同样会弹出窗口，要求你输入用户名和 Token（和 push 时一样）。

                记住这个核心规律：
                     GitHub 只在你需要 “写” 权限（如 push）或访问 “私有” 资源时，才会要求验证你的身份。

                最佳实践建议：
                        为了避免每次操作私有仓库都输入 Token，请务必按照之前的说明，设置 Git 的凭证存储 (git config --global credential.helper cache 等)。设置好后，在一段时间内或永久都不会再弹窗要求输入了。
