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
		<span>调解部门选择</span>
	</header>
	<ul class="tjTimeList" id="bmlist">
	<?PHP
	if (count($type_list)){
		foreach ($type_list as $i=>$item){
	?>
		<li data-value="<?php echo $item['departmentId']; ?>"><a href="javascript:;"><span><?php echo $item['departmentName']; ?></span></a></li>
		<?PHP
		}
	}
	?>
		
	</ul>
	<footer>
		<span></span>调解有法可依,协议依法保障
	</footer>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/common.js"></script>
	<script>
           $(function(){              
					
                   $("#bmlist li").click(function(){
                       var data_value = $(this).attr('data-value');                       
                       $.post('<?php echo App_URL;?>/index.php?act=index&op=ajaxaddmediator',{departmentId:data_value,typeid:<?php echo $typeid; ?>},function(data){
						   //alert(data.msg);
                           if (data.err == 1){
                        	   alert('当前无可分配的调解员');
                           }else{
                        	  // alert('推荐成功！');
                               window.location.href="<?php echo App_URL;?>/index.php?act=index&op=selectuser&id="+data.mediatorId+'&id2='+data.typeId+'&id3='+data.departmentId;
                           }
                           
                       },'json');
                   });
            });
        </script>
</body>
</html>