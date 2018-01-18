$(function() {
	var url = location.href.split('#')[0];// url不能写死
	$.ajax({
		type : "get",
		url : "/weixin/jsSdk/getData",
		dataType : "json",// 服务器返回的类型
		async : false,
		data : {
			url : url
		},
		success : function(data) {
			data = data.data;
			wx.config({
				debug : true,// //生产环境需要关闭debug模式，相应的信息会弹框提示
				appId : data.appid,// appId通过微信服务号后台查看
				timestamp : data.timestamp,// 生成签名的时间戳
				nonceStr : data.noncestr,// 生成签名的随机字符串
				signature : data.signature,// 签名
				jsApiList : [// 需要调用的JS接口列表
				'checkJsApi',// 判断当前客户端版本是否支持指定JS接口
				'onMenuShareTimeline',// 分享给朋友圈
				'onMenuShareAppMessage',// 分享到好友
				'getLocation', // 地址位置服务
				'openLocation'
				]
			});
		},
		error : function(xhr, status, error) {
			alert(xhr.responseText);
		}
	})
});

wx.error(function(res) {
	// config信息验证失败会执行error函数，如签名过期导致验证失败，具体错误信息可以打开config的debug模式查看，也可以在返回的res参数中查看，对于SPA可以在这里更新签名。
	alert(res.errMsg);
});

wx.ready(function() {
	  // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
});
