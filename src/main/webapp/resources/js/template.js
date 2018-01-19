function template(){
	$.ajax({
		type : "get",
		url : "/weixin/template/test",
		dataType : "json",// 服务器返回的类型
		async : false,
		success : function(data) {
		},
		error : function(xhr, status, error) {
			alert(xhr.responseText);
		}
	})
}
