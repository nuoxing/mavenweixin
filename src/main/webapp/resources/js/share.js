//注册监听分享功能的回调
function shareToFriend(){
	$("#id1").text("分享1");
	 var link = window.location.href;
     var protocol = window.location.protocol;
     var host = window.location.host;
	wx.onMenuShareAppMessage({
	    title: '这个一个测试页面', // 分享标题
	    desc: '这是一个测试', // 分享描述
	    link: link, // 分享链接，该链接域名必须与当前企业的可信域名一致
	    imgUrl: 'https://www.baidu.com/img/bd_logo1.png', // 分享图标
	   // type: '1', // 分享类型,music、video或link，不填默认为link
	   // dataUrl: '1', // 如果type是music或video，则要提供数据链接，默认为空
	    success: function (res) {
	    	 alert("回调分享了");
	    },
	    cancel: function (res) {
	    	 alert("取消了");
	    },
	    fail: function (res) {
            alert(JSON.stringify(res));
        }
	});
}