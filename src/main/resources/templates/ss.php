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
	<title>诉讼、调解成本评估</title>
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/font/iconfont.css">
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/css/base.css">
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/css/style.css">
</head>
<body class="bgWhite">
	<header>
		<a href="<?php echo App_URL;?>" class="iconfont icon-fanhui"></a>诉调成本评估
	</header>
	<div class="ssTitle">
		<div class="box">
			<span class="active">风险预估<br/>分析及建议</span>
			<span>类案推送<br/>级解析</span>
			<span>诉讼，调解<br/>成本评估</span>
		</div>
	</div>
	<div class="ssBox">
		<div class="ssText">
			<span class="name">诉讼：</span>
			<span class="text">金钱成本：诉讼费用，保全费用、执行费用、律师费等；<br/>时间成本：简易程序3个月、普通程序6个月，若有其他管辖异议、公告可能1年以上；<br/>人力成本：误工费、交通费等；<br/>风险成本：胜诉的不确定性。</span>
		</div>
		<div class="ssText">
			<span class="name st1">调解：</span>
			<span class="text">金钱成本：无调解费用；<br/>时间成本：无时间成本，协议达成即可执行；<br/>人力成本：误工费、交通费；<br/>风险成本：当事人不按调解协议执行，若当事人不执行可以转为诉讼途径。</span>
		</div>
	</div>
	<div class="ssBtn">
		<a href="#" class="js_ssBtn">我要诉讼</a>
		<a href="<?php echo App_URL;?>/index.php?act=index&op=tjtext" class="js_ssBtn st1">我要调解</a>
	</div>
	<div class="ssBtnBox">
		<div class="bg"></div>
		<div class="box">您的立案需求<br/>已经提交给法院</div>
	</div>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/common.js"></script>
</body>
</html>