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
		<span>我的调解</span>
	</header>
	<div class="uc_tjTitle">
		<a href="#" class="active">正在调解(<?php echo $tjcount_ing; ?>)</a>
		<a href="<?php echo App_URL;?>/index.php?act=index&op=tiaojie" >历史调解(<?php echo $tjcount_end; ?>)</a>
	</div>
	<ul class="uc_tjList">
	<?php
            foreach ($list as $item){
   ?>
		<li>
			<a href="<?php echo App_URL;?>/index.php?act=index&op=tjdetail&id=<?php echo $item['mediatorEvaluationId']; ?>&reporid=<?php echo $item['rid'];?>">
				<div class="title">
					<span class="name"><?php echo $item['typeName']; ?></span>
					<span class="time"><?php echo $item['happenDate']; ?></span>
				</div>
				<div class="content"><?PHP echo $item['sy'] ? cut_str($item['sy'],0, 21) : "暂无"; ?></div>
				<div class="label">
					<?php if ($item['departmentName'] !=""){?><span class="st"><?PHP echo $item['departmentName']; ?></span><?php }?>
					<?php if ($item['mediaName']!=""){?><span class="user"><?PHP echo $item['mediaName']; ?></span><?php }?>
					
						<?php
						if ($item['state'] == 1){
						    echo '<span class="goIng" style="border-color:red;color:red;">待分配</span>';
						}else{
						    if ($item['receiveState']==1){
						        echo '<span class="goIng" style="border-color:red;color:red;">待确定</span>';
						    }elseif ($item['receiveState']==0){
						        echo '<span class="goIng" style="border-color:red;color:red;">已拒绝</span>';
						    }else{
						        echo '<span class="goIng" style="border-color:red;color:red;">进行中</span>';
						    }
						}
						
						    ?>
					
					
						<?php
						if ($item['judiciaState']==1){
						    echo '<span class="goIng" style="border-color:red;color:red;">司法确认中</span>';
						}elseif ($item['judiciaState']==2){
						    echo '<span class="goIng">完成司法确认</span>';
						}
						    ?>
					
				</div>
			</a>
		</li>
		<?PHP
            }
             ?>	
		
	</ul>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/common.js"></script>
</body>
</html>