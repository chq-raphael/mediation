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
	<title>调解结果评价</title>
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/font/iconfont.css">
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/css/base.css">
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/css/style.css">
</head>
<body class="bgWhite">
	<header>
		<a href="<?php echo App_URL;?>" class="iconfont icon-fanhui"></a>调解详情
	</header>
	<div class="tjpageBox">
		<div class="tjPageLabel">
			<div class="list">
				<span class="name">当事人：</span><?PHP echo $advisoryName; ?>
			</div>
			<div class="list">
				<span class="name">当前状态：</span>
                                    <?PHP
                                    if ($mediateState == -1){
                                        echo '调解失败';
                                    }elseif ($mediateState == 0){
                                        echo '调解中';
                                    }else{
                                        echo '调解成功';
                                    }
                                ?>
			</div>
			<div class="list">
				<span class="name">调解员：</span><?PHP echo $mediaName; ?>
			</div>
			<div class="list">
				<span class="name">调解部门：</span><?PHP echo $departmentName; ?>
			</div>
			<div class="list st1 st2">
				<span class="name">事由：</span>
				<span class="text"><?PHP echo $reason; ?></span>
			</div>
			<div class="list st1">
				<span class="name">调解详情：</span>
				<span class="text"><?PHP echo $mediationDetail; ?></span>
			</div>
			<div class="list st1">
				<span class="name">调解结果：</span>
				<span class="text"><?PHP echo $Result; ?></span>
			</div>
			<div class="list st1">
				<span class="name">评价：</span>
				<span class="text"><?PHP echo $evaluation; ?></span>
			</div>
		</div>
	</div>
	<div class="tjtextBtn"><a href="javascript:history.back();">返　　回</a></div>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/common.js"></script>
</body>
</html>