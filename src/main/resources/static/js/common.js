$(function(){
	apply();
	$(window).resize(function(){
		apply();
	});

	$("#tjTextBtn").click(function(){
		$("#tjTextBox").fadeIn(200);
	})


	var xingDafen = $("#xingDafen"),i;
	if(xingDafen.data("num")>0){//读取分数
		dafen(xingDafen.data("num"));
	}
	if(xingDafen.data("status")==1){//是否可点击
		xingDafen.find("i").each(function(a){
			$(this).click(function(){
				xingDafen.attr("data-num",a+1)
				dafen(a+1);
			})
		})
	}
	function dafen(s){
		xingDafen.find("i").removeClass("active");
		for(i=0;i<s;i++){
			xingDafen.find("i").eq(i).addClass("active");
		}
	}
	

	$("#userSex").click(function(){
		if($(this).text() == "男"){
			$(this).text("女").next("input").val("1");
		}else{
			$(this).text("男").next("input").val("0");
		}
	});

});

function apply() {
	$("body").css({"font-size":$("body").width()/20});
	setTimeout(function(){
		$("#lodingBox").fadeOut(100);
	},200)
}
