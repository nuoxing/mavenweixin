function getAddress() {
	$("#id1").text("执行啦==============");

	wx.getLocation({
		type : 'gcj02', // 默认为wgs84的gps坐标，如果要返回直接给openLocation用的火星坐标，可传入'gcj02'
		success : function(res) {
			var latitude = res.latitude; // 纬度，浮点数，范围为90 ~ -90
			var longitude = res.longitude; // 经度，浮点数，范围为180 ~ -180。
			var speed = res.speed; // 速度，以米/每秒计
			var accuracy = res.accuracy; // 位置精度
			$("#id1").text(latitude + "  " + longitude);
			getDom(latitude, longitude);
			//showDom(latitude,longitude);
		},
		cancel : function(res) {
			$("#id1").text(res.errMsg);
		},
		fail : function(res) {
			$("#id1").text(res.errMsg);
		}

	});
}

function getDom(latitude, longitude) {

	$("#id1").text("访问高德api");
	var url = "http://restapi.amap.com/v3/geocode/regeo?output=JSON&location="
			+ longitude + "," + latitude
			+ "&key=617cb553c0fdbd7304e0417042005493&radius=100&extensions=all";
	$.ajax({
		type : "get",
		url : url,
		dataType : "jsonp",// 服务器返回的类型
		async : false,
		success : function(data) {
			$("#id1").text(data.regeocode.formatted_address);
		},
		error : function(xhr, status, error) {
			$("#id1").text("status=" + status);
		}
	});
}

//打开微信内置地图
function showDom(latitude,longitude){
	wx.openLocation({
	    latitude: latitude, // 纬度，浮点数，范围为90 ~ -90
	    longitude: longitude, // 经度，浮点数，范围为180 ~ -180。
	    name: '测试', // 位置名
	    address: '测试', // 地址详情说明
	    scale: 1, // 地图缩放级别,整形值,范围从1~28。默认为最大
	    infoUrl: '' // 在查看位置界面底部显示的超链接,可点击跳转
	});
}
