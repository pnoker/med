function countByAll(){
	$$.ajax({
		method : 'POST',
		url : ctxPath + "/main/countByAll" + ".do",
		error : function(xhr, status) {
			myApp.hidePreloader();
			alert("加载失败！");
		},
		success : function(data, status, xhr) {
			myApp.hidePreloader();
			$$('.line-num').html(data);
		}
	});
};