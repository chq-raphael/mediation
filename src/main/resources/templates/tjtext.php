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
		<span>我要调解</span>
	</header>
	<div class="mainWrap">
		<div class="tj_textBox">
			<div class="title">调解告知书</div>
			<div class="text">
				<span class="colorSt">根据《中华人民共和国人民调解法》规定</span>，现将人民调解的性质、法律效果和调解原则，以及在调解中各方当事人享有的权利和应当承担的义务、司法确认制度　根据《中华人民共和国人民调解法》规定，现将人民调解的性质、法律效果和调解原则，以及在调解中各方当事人享有的权利和应当承担的义务、司法确认制度　根据《中华人民共和国人民调解法》规定，现将人民调解的性质、法律效果和调解原则，以及在调解中各方当事人享有的权利和应当承担的义务、司法确认制度　根据《中华人民共和国人民调解法》规定，现将人民调解的性质....
			</div>
		</div>
		<div class="mainBtn">
			<a href="javascript:;" id="tjTextBtn">同意调解</a>
		</div>
	</div>
	<div class="tj_Box" id="tjTextBox">
		<div class="box">
			<div class="title">必要信息确认</div>
			<ul class="list">
				<li>
                    <span class="name">姓　　名</span>
                    <input type="text" class="input" name="nickname" id="nickname" value="<?php echo $nickname;?>">
				</li>
				<li>
                    <span class="name">姓　　别</span>
                    <label><input type="radio" name="sex" value="男" <?php if ($sex=='男'){echo "checked";}?>><font style="font-size:14px;"> 男</font></label>
                    <label><input type="radio" name="sex" value="女" <?php if ($sex=='女'){echo "checked";}?>><font style="font-size:14px;"> 女</font></label>
				</li>
				<li>
                    <span class="name">手机号码</span>
                    <input type="text" class="input" maxlength="11" id="mobile" placeholder="输入你的手机号码" value="<?php echo $phone; ?>">
				</li>
				<li>
                    <span class="name" style="float:left;">地　　区</span>                    
                    <span class="input" id="sel_city"><?php echo $city;?></span>                   
				</li>
				<li>
                    <span class="name">详细地址</span>
                    <input type="text" class="input" id="address"  placeholder="请输入详细街道地址" value="<?php echo $address;?>">
				</li>
				<li>
					<div class="mainBtn" id="submit">
						<a href="javascript:;">已确定，我要调解</a>
					</div>
				</li>
			</ul>
			
			
		</div>
	</div>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/common.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/picker.min.js"></script>
	<script type="text/javascript" src="<?php echo App_URL;?>/public/js/city.js"></script>
	<script>
           $(function(){              
                $("#submit").click(function(){               	
					var nickname=$("#nickname").val();
					var sex=$("input[name='sex']:checked").val();
                    var mobile = $("#mobile").val();
                    var city = $("#sel_city").html();
                    
                    var address = $("#address").val();
                    if (nickname == ''){
						alert('请输入姓名');
						return false;
                    }
                    if (sex == ''){
						alert('请输入性别');
						return false;
                    }                    
                    if (mobile == ''){
                        alert('请输入手机号');
                        return false;
                    }                    
                    var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/; 
        		    if(!myreg.test(mobile)) 
        		    { 
        		           alert('请输入有效的手机号码！'); 		           
        		           return false; 
        		    } 
                    
                   
                    $.post('<?php echo App_URL;?>/index.php?act=index&op=ajaxtext',{nickname:nickname,sex:sex,city:city,address:address,mobile:mobile},function(data){
						if (data.err == 1){
							alert("手机号已经被使用！");
							//alert(data.sql);
							//alert(data.post);
							return false;
						}else{
							$("#submit").unbind( "click" );
	                        window.location.href='<?php echo App_URL;?>/index.php?act=index&op=style';
						}
                    	
                    },'json');
                });       
                
            });



            var nameEl = document.getElementById('sel_city');

        	var first = []; /* 省，直辖市 */
        	var second = []; /* 市 */
        	var third = []; /* 镇 */

        	var selectedIndex = [0, 0, 0]; /* 默认选中的地区 */

        	var checked = [0, 0, 0]; /* 已选选项 */

        	function creatList(obj, list){
        	  obj.forEach(function(item, index, arr){
        	  var temp = new Object();
        	  temp.text = item.name;
        	  temp.value = index;
        	  list.push(temp);
        	  })
        	}

        	creatList(city, first);

        	if (city[selectedIndex[0]].hasOwnProperty('sub')) {
        	  creatList(city[selectedIndex[0]].sub, second);
        	} else {
        	  second = [{text: '', value: 0}];
        	}

        	if (city[selectedIndex[0]].sub[selectedIndex[1]].hasOwnProperty('sub')) {
        	  creatList(city[selectedIndex[0]].sub[selectedIndex[1]].sub, third);
        	} else {
        	  third = [{text: '', value: 0}];
        	}

        	var picker = new Picker({
        	    data: [first, second, third],
        	  selectedIndex: selectedIndex,
        	    title: '地址选择'
        	});

        	picker.on('picker.select', function (selectedVal, selectedIndex) {
        	  var text1 = first[selectedIndex[0]].text;
        	  var text2 = second[selectedIndex[1]].text;
        	  var text3 = third[selectedIndex[2]] ? third[selectedIndex[2]].text : '';

        	    nameEl.innerText = text1 + ' ' + text2 + ' ' + text3;
        	});

        	picker.on('picker.change', function (index, selectedIndex) {
        	  if (index === 0){
        	    firstChange();
        	  } else if (index === 1) {
        	    secondChange();
        	  }

        	  function firstChange() {
        	    second = [];
        	    third = [];
        	    checked[0] = selectedIndex;
        	    var firstCity = city[selectedIndex];
        	    if (firstCity.hasOwnProperty('sub')) {
        	      creatList(firstCity.sub, second);

        	      var secondCity = city[selectedIndex].sub[0]
        	      if (secondCity.hasOwnProperty('sub')) {
        	        creatList(secondCity.sub, third);
        	      } else {
        	        third = [{text: '', value: 0}];
        	        checked[2] = 0;
        	      }
        	    } else {
        	      second = [{text: '', value: 0}];
        	      third = [{text: '', value: 0}];
        	      checked[1] = 0;
        	      checked[2] = 0;
        	    }

        	    picker.refillColumn(1, second);
        	    picker.refillColumn(2, third);
        	    picker.scrollColumn(1, 0)
        	    picker.scrollColumn(2, 0)
        	  }

        	  function secondChange() {
        	    third = [];
        	    checked[1] = selectedIndex;
        	    var first_index = checked[0];
        	    if (city[first_index].sub[selectedIndex].hasOwnProperty('sub')) {
        	      var secondCity = city[first_index].sub[selectedIndex];
        	      creatList(secondCity.sub, third);
        	      picker.refillColumn(2, third);
        	      picker.scrollColumn(2, 0)
        	    } else {
        	      third = [{text: '', value: 0}];
        	      checked[2] = 0;
        	      picker.refillColumn(2, third);
        	      picker.scrollColumn(2, 0)
        	    }
        	  }

        	});

        	picker.on('picker.valuechange', function (selectedVal, selectedIndex) {
        	  console.log(selectedVal);
        	  console.log(selectedIndex);
        	});

        	nameEl.addEventListener('click', function () {
        	    picker.show();
        	});
            </script>
</body>
</html>