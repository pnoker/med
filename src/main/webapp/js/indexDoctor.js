/*首页四个导航的内容显示*/
function getIndexView(name) {
	$$.ajax({
		url : ctxPath + "/main/" + name + ".do",
		beforeSend : function(xhr) {
			myApp.showPreloader();
			$$('.tab-index-' + name).parent('.toolbar-inner').children(
					'.tab-link').removeClass('active');
			$$('.tab-index-' + name).addClass('active');
		},
		error : function(xhr, status) {
			myApp.hidePreloader();
			alert('加载失败！');
		},
		success : function(data, status, xhr) {
			myApp.hidePreloader();
			$$('#view-index').html(data);
		}
	});
};
/* 初始化医院动态首页内容 */
getIndexView('kznews');
/* 我的服务 */
function MyService(week){
	$$.ajax({
		method : 'POST',
		url : ctxPath + "/content/tab" + ".do",
		data : {
			'week' : week
		},
		beforeSend : function(xhr){
			myApp.showPreloader();
			$$('.tab'+week).parent('.tabs').children('.tab').removeClass('active');
			$$('.week'+week).parent('.buttons-row').children('.tab-link').removeClass('active');
			$$('.tab'+week).addClass('active');
			$$('.week'+week).addClass('active');

		},
		error : function(xhr, status) {
			myApp.hidePreloader();
			alert("加载失败！");
		},
		success : function(data, status, xhr) {
			myApp.hidePreloader();
			$$('#tab'+week).html(data);
			count(week);
		}
	});
}
function count(week){
	$$.ajax({
		method : 'POST',
		url : ctxPath + "/content/count" + ".do",
		data : {
			'week' : week
		},
		error : function(xhr, status) {
			myApp.hidePreloader();
			alert("加载失败！");
		},
		success : function(data, status, xhr) {
			myApp.hidePreloader();
			$$('.numbers').html(data);
		}
	});
}


function Case(userId,id){
	$$.ajax({
		method : 'POST',
		url : ctxPath + "/content/case-history" + ".do",
		data : {
			'userId' : userId,
			'id' :id
		},
		beforeSend : function(xhr) {
			myApp.showPreloader();
		},
		error : function(xhr, status) {
			myApp.hidePreloader();
			alert("error");
		},
		success : function(data, status, xhr) {
			myApp.hidePreloader();
			$$('#view-index').html(data);
		}
	});
	
}

function CaseMyPatient(userId,id){
	$$.ajax({
		method : 'POST',
		url : ctxPath + "/content/case-history-mypatient" + ".do",
		data : {
			'userId' : userId,
			'id' :id
		},
		beforeSend : function(xhr) {
			myApp.showPreloader();
		},
		error : function(xhr, status) {
			myApp.hidePreloader();
			alert("error");
		},
		success : function(data, status, xhr) {
			myApp.hidePreloader();
			$$('#view-index').html(data);
		}
	});
	
}

function Test(name, id) {
	var name = name;
	/* 医学杂志 */
	if (name == 'content-magazine') {
		$$.ajax({
			method : 'POST',
			url : ctxPath + "/content/" + name + ".do",
			data : {
				'id' : id
			},
			beforeSend : function(xhr) {
				myApp.showPreloader();
			},
			error : function(xhr, status) {
				myApp.hidePreloader();
				alert(status);
			},
			success : function(data, status, xhr) {
				myApp.hidePreloader();
				$$('#view-index').html(data);
			},
		});
	}
	/* 医院动态，医生文章 */
	else if (name == 'content-article') {
		$$.ajax({
			method : 'POST',
			url : ctxPath + "/content/" + name + ".do",
			data : {
				'id' : id
			},
			beforeSend : function(xhr) {
				myApp.showPreloader();
			},
			error : function(xhr, status) {
				myApp.hidePreloader();
				alert('error!');
			},
			success : function(data, status, xhr) {
				myApp.hidePreloader();
				$$('#view-index').html(data);
			},
		});
	}
	/* 我，我的文章，医生文章 */
	else if (name == 'doctor-article') {
		$$.ajax({
			method : 'POST',
			url : ctxPath + "/content/" + name + ".do",
			data : {
				'id' : id
			},
			beforeSend : function(xhr) {
				myApp.showPreloader();
				$$('#view-index').attr('data-page', 'content');
			},
			error : function(xhr, status) {
				myApp.hidePreloader();
				alert('error!');
			},
			success : function(data, status, xhr) {
				myApp.hidePreloader();
				$$('#view-index').html(data);
			},
		});
	}
	/* 我，我的文章 */
	else if (name == 'articles') {
		$$.ajax({
			url : ctxPath + "/content/" + name + ".do",
			beforeSend : function(xhr) {
				myApp.showPreloader();
				$$('#view-index').attr('data-page', 'content');
			},
			error : function(xhr, status) {
				myApp.hidePreloader();
				alert('error!');
			},
			success : function(data, status, xhr) {
				myApp.hidePreloader();
				$$('#view-index').html(data);
			},
		});

	}

	else if (name == 'audios') {
		$$.ajax({
			url : ctxPath + "/content/" + name + ".do",
			beforeSend : function(xhr) {
				myApp.showPreloader();
				$$('#view-index').attr('data-page', 'content');
			},
			error : function(xhr, status) {
				myApp.hidePreloader();
				alert('error!');
			},
			success : function(data, status, xhr) {
				myApp.hidePreloader();
				$$('#view-index').html(data);
			},
		});

	}
	/* 我，设置 */
	else if (name == 'set') {
		$$.ajax({
			url : ctxPath + "/content/" + name + ".do",
			beforeSend : function(xhr) {
				myApp.showPreloader();
				$$('#view-index').attr('data-page', 'content');
			},
			error : function(xhr, status) {
				myApp.hidePreloader();
				alert('error!');
			},
			success : function(data, status, xhr) {
				myApp.hidePreloader();
				$$('#view-index').html(data);
			},
		});
	}

	else if (name == 'work') {
		$$.ajax({
			url : ctxPath + "/content/" + name + ".do",
			beforeSend : function(xhr) {
				myApp.showPreloader();
				$$('#view-index').attr('data-page', 'content');
			},
			error : function(xhr, status) {
				myApp.hidePreloader();
				alert('error!');
			},
			success : function(data, status, xhr) {
				myApp.hidePreloader();
				$$('#view-index').html(data);
			},
		});

	}

	else if (name == 'help') {
		$$.ajax({
			url : ctxPath + "/content/" + name + ".do",
			beforeSend : function(xhr) {
				myApp.showPreloader();
				$$('#view-index').attr('data-page', 'content');
			},
			error : function(xhr, status) {
				myApp.hidePreloader();
				alert('error!');
			},
			success : function(data, status, xhr) {
				myApp.hidePreloader();
				$$('#view-index').html(data);
			},
		});

	}

	else if (name == 'videos') {
		$$.ajax({
			url : ctxPath + "/content/" + name + ".do",
			beforeSend : function(xhr) {
				myApp.showPreloader();
				$$('#view-index').attr('data-page', 'content');
			},
			error : function(xhr, status) {
				myApp.hidePreloader();
				alert('error!');
			},
			success : function(data, status, xhr) {
				myApp.hidePreloader();
				$$('#view-index').html(data);
			},
		});

	}

	else if (name == 'addArticles') {
		var title;
		var summary;
		var logo;
		var content;
		$$.ajax({
			method : 'POST',
			url : ctxPath + "/content/" + name + ".do",
			data : {
				'title' : title,
				'summary' : summary,
				'logo' : logo,
				'content' : content
			},
			beforeSend : function(xhr) {
				myApp.showPreloader();
				$$('#view-index').attr('data-page', 'content');
			},
			error : function(xhr, status) {
				myApp.hidePreloader();
				alert('error!');
			},
			success : function(data, status, xhr) {
				myApp.hidePreloader();
				$$('#view-index').html(data);
			},
		});

	}
	// else if(name == 'back') {
	// $$.ajax({
	// url : ctxPath + "/main/kznews.do",
	// beforeSend : function(xhr) {
	// myApp.showPreloader();
	// $$('.tab-index-' + name).parent('.toolbar-inner').children(
	// '.tab-link').removeClass('active');
	// $$('.tab-index-' + name).addClass('active');
	// $$('#view-index').attr('data-page', 'index-1');
	// },
	// error : function(xhr, status) {
	// myApp.hidePreloader();
	// alert('error');
	// },
	// success : function(data, status, xhr) {
	// myApp.hidePreloader();
	// $$('#view-index').html(data);
	// }
	// });
	// }

};