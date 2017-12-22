<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="format-detection" content="telephone=no, email=no">
	<meta name="msapplication-tap-highlight" content="no">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="screen-orientation" content="portrait">
	<meta name="browsermode" content="application">
	<meta name="x5-orientation" content="portrait">
	<meta name="x5-fullscreen" content="true">
	<meta name="x5-page-mode" content="app">
	<meta name="full-screen" content="yes">
	<meta name="HandheldFriendly" content="true">
	<meta name="MobileOptimized" content="640">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">
	<title>法律小崇</title>
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/font/iconfont.css">
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/css/base.css">
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/css/style.css">
</head>
<body>
	<div id="lodingBox"></div>
	<header>
		<a href="<?php echo App_URL;?>" class="headerBack"></a>
		<span>调解详情</span>
	</header>
	<div class="mainWrap">
		<div class="tjMoreBox">
			<ul class="title">
				<li>
					<span class="name">当事人:</span>
					<span class="text"><?PHP echo $advisoryName; ?></span>
				</li>
				<li>
					<span class="name">当前状态:</span>
					<span class="text">已完成</span>
				</li>
				<li class="colorSt">
					<span class="name">调解员:</span>
					<span class="text"><a href="<?php echo App_URL;?>/index.php?act=index&op=user&id=<?php echo $mediatorId;?>&id3=<?php echo $departmentId;?>"><?PHP echo $mediaName; ?></a></span>
				</li>
				<li>
					<span class="name">手机号码:</span>
					<span class="text"><?PHP echo $telephone ? $telephone : "暂无"; ?></span>
				</li>
				<li>
					<span class="name">分配时间:</span>
					<span class="text"><?php echo $createDate ? $createDate : '暂无';?></span>
				</li>
				<li>
					<span class="name">调解部门:</span>
					<span class="text"><?PHP echo $departmentName ? $departmentName : '暂无'; ?></span>
				</li>
			</ul>
			<ul>
				<li>
					<span class="name">调解事由:</span>
					<?PHP echo $sy ? $sy : '暂无'; ?>
				</li>
				<li>
					<span class="name">调解详情:</span>
					<?PHP echo $mediationDetail ? $mediationDetail : '暂无'; ?>
				</li>
				<li>
					<span class="name">调解结果:</span>
					<?PHP echo $result ? $result : '暂无'; ?>
				</li>
				<li>
					<span class="name">调解评论:</span>
					<?PHP echo $evaluation ? $evaluation : '暂无'; ?>
				</li>
			</ul>
		</div>
		<div class="mainBtn">
			<a href="javascript:window.history.back();" >返回</a>
		</div>
	</div>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/common.js"></script>
</body>
</html>