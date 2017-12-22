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
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/css/base.css">
	<link rel="stylesheet" href="<?php echo App_URL;?>/public/css/style.css">
</head>
<body class="bgWhite">
	<div id="lodingBox"></div>
	<header>
		<a href="<?php echo App_URL;?>" class="headerBack"></a>
		<span>调解员分配</span>
	</header>
	<div class="tjyBg">
		<img src="<?php echo App_URL;?>/public/images/tjyBg.jpg">
		<span><img src="<?php echo App_URL;?>/index.php?act=index&op=headimg&id=<?php echo $mediatorId;?>"></span>
	</div>
	<div class="tjyBox">
		<div class="name"><?php echo $mediaName; ?></div>
		<div class="st"><?php echo $departmentName; ?>　调解专员</div>
		<div class="tel"><a href="tel:<?php echo $telephone; ?>"><span></span><?php echo $telephone; ?></a></div>
		<div class="text"><?php echo $personalElucidation; ?></div>
		<div class="mainBtn st2">
			<a href="javascript:;" id="reselect">更换调解员</a>
			<a href="javascript:;" id="ok" data-mediatorId="<?php echo $mediatorId; ?>" data-mediaName=<?php echo $mediaName; ?>>确认调解员</a>
		</div>
	</div>
	<footer>
		<span></span>调解有法可依,协议依法保障
	</footer>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/common.js"></script>
	<script>
           $(function(){              
                   $("#reselect").click(function(){
                       var data_value = $(this).attr('data-value');                       
                       $.post('<?php echo App_URL;?>/index.php?act=index&op=ajaxaddmediator',{departmentId:<?php echo $departmentId; ?>,typeid:<?php echo $typeid; ?>},function(data){
						   //alert(data.msg);
                           if (data.err == 1){
                        	   alert('当前无可分配的调解员');
                           }else{
                        	  // alert('推荐成功！');
                               window.location.href="<?php echo App_URL;?>/index.php?act=index&op=selectuser&id="+data.mediatorId+'&id2='+data.typeId+'&id3='+data.departmentId;
                           }
                           
                       },'json');
                   });
				   
				   $("#ok").click(function(){
					   var mediatorId = $(this).attr('data-mediatorId');
					   var mediaName = $(this).attr('data-mediaName');
					   $.post('<?php echo App_URL;?>/index.php?act=index&op=ajaxaddreport',{mediatorId:mediatorId,mediaName:mediaName,departmentId:<?php echo $departmentId; ?>,typeid:<?php echo $typeid; ?>},function(data){
                           if (data.err == 1){
                        	   alert(data.msg);
                           }else{
                        	   //alert('推荐成功！');
                               window.location.href="<?php echo App_URL;?>/index.php?act=index&op=user&id="+data.mediatorId+'&id2='+data.typeId+'&id3='+data.departmentId;
                           }
                           
                       },'json');
				   });
            });
        </script>
</body>
</html>