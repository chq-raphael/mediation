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
		<span>我的调解</span>
	</header>
	
	<div class="tjpageBox">
		<div class="tjpageText">
	        调解结果：<?php echo $jg;?>
		</div>
		<textarea class="tjpageTextarea" style="color:#333333;" id="content"  placeholder="输入评论内容......" <?php if ($ispj){echo "disabled";} ?>><?php echo $evaluation; ?></textarea>
		<div class="tjpagePj">
			调解员满意度：<span id="xingDafen" data-num="<?php echo $star; ?>" data-status="<?php if ($ispj){echo 0;}else{echo 1;} ?>">
				<!-- data-status=1可打分，非1时禁止打飞 -->
				<i class="iconfont icon-xing-dafen"></i>
				<i class="iconfont icon-xing-dafen"></i>
				<i class="iconfont icon-xing-dafen"></i>
				<i class="iconfont icon-xing-dafen"></i>
				<i class="iconfont icon-xing-dafen"></i>
			</span>
		</div>
		<select id="isjs">
			<option value="0">接受调解结果</option>
			<option value="2">接受调解结果，申请司法</option>
			<option value="1">不接受，继续调解</option>
		</select>
		
		
		<?php if (!$ispj){ ?>
	
	<div class="mainBtn">		
			<a href="javascript:;" id="dafenBtn">提交</a>
		</div>
        <?php
    }
        ?>
		<div class="mainBtn">
			<a href="<?php echo App_URL;?>/index.php?act=index&op=tiaojieing" >返回</a>
		</div>

		
		<!-- 点击评论，判断没做，分数在commonjs里，给id="defenBtn"绑定了事件的， -->
	</div>
	
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/common.js"></script>
        <script>
        $(function(){              
                   $("#dafenBtn").click(function(){
                       var star = $("#xingDafen").attr('data-num');
                       var content = $("#content").val();
                       var isjs = $("#isjs").val();
                       var id = '<?php echo $mediatorEvaluationId; ?>';
                       $.post('<?php echo App_URL;?>/index.php?act=index&op=ajaxpingjia',{star:star,content:content,id:id,isjs:isjs},function(data){
                           
                           $("#content").attr('disabled', true);
                           $("#dafenBtn").hide();
                           //window.location.reload();
                           //
                           if (isjs==1){                        	   
                        	   window.location.href="<?php echo App_URL;?>/index.php?act=index&op=jump&reportId="+data;
                           }else{
                        	   alert("评论成功");
                           }
                       });
                   });
            });   
        </script>
</body>
</html>

