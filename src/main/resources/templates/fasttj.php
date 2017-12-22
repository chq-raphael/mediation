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
<body>
	<div id="lodingBox"></div>
	<header>
		<a href="<?php echo App_URL;?>" class="headerBack"></a>
		<span>一键调解</span>
	</header>
	
	<div class="tjpageBox">
		<textarea class="tjpageTextarea mt0" id="sy" placeholder="输入调解事由......" style="color:#333333;"></textarea>
		<select id="class">
		<?php 
		foreach ($classlist as $item){
		?>
			<option value="<?php echo $item['classId'];?>"><?php echo $item['className'];?></option>
		<?php }?>			
		</select>
		<div class="mainBtn">
			<a href="javascript:;" id="submit">提交,进入调解</a>
		</div>
	</div>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/common.js"></script>
	<script>
        $(function(){              
                   $("#submit").click(function(){
                       var sy = $("#sy").val();
                       var classid = $("#class").val();                      
                       
                       $.post('<?php echo App_URL;?>/index.php?act=index&op=ajaxfast',{sy:sy,classid:classid},function(data){
                                                     
                          window.location.href="<?php echo App_URL;?>/index.php?act=index&op=jump&reportId="+data;
                           
                       });
                   });
            });   
        </script>
</body>
</html>