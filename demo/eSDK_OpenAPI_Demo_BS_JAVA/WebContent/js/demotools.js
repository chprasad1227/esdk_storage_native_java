function changeLang() {
	lang = $("#changeLang").val();

	// if (lang == "en-us") {
	// controller = new LanguageControllerEN();
	// } else {
	controller = new LanguageControllerZH();
	// }

	// 自动切换所有的label
	var arrayOfLabel;
	if (document.all || document.getElementById) {
		arrayOfLabel = document.getElementsByTagName("label");
	}

	for ( var i = 0; i < arrayOfLabel.length; i++) {
		var labelId = arrayOfLabel[i].id;
		if (labelId != "" && labelId.indexOf("Tree") == -1) {
			document.getElementById(labelId).innerHTML = controller.language.titles[labelId];
		}
	}

	// 自动切换所有span
	var arrayOfSpan;
	if (document.all || document.getElementById) {
		arrayOfSpan = document.getElementsByTagName("span");
	}

	for ( var i = 0; i < arrayOfSpan.length; i++) {
		var spanId = arrayOfSpan[i].id;
		if (spanId != "" && spanId.indexOf("Tree") == -1
				&& spanId.indexOf("loginUser") == -1) {
			document.getElementById(spanId).innerHTML = controller.language.titles[spanId];
		}
	}

	// 自动切换所有li
	var arrayOfli;
	if (document.all || document.getElementById) {
		arrayOfli = document.getElementsByTagName("li");
	}

	for ( var i = 0; i < arrayOfli.length; i++) {
		var liId = arrayOfli[i].id;
		if (liId != "" && liId.indexOf("Tree") == -1) {
			document.getElementById(liId).innerHTML = controller.language.titles[liId];
		}
	}

	// 自动切换所有button
	var arrayOfButton;
	if (document.all || document.getElementById) {
		arrayOfButton = document.getElementsByTagName("input");
	}

	for ( var i = 0; i < arrayOfButton.length; i++) {
		var buttonId = arrayOfButton[i].id;
		if (buttonId != "" && buttonId.indexOf("Btn") > 0) {
			document.getElementById(buttonId).value = controller.language.buttons[buttonId];
		}
	}

	var langTags = $("[languageTag]");
	for ( var i = 0; i < langTags.size(); i++) {
		var langTag = langTags.eq(i);
		var tag = langTag.attr('languageTag');
		langTag.html(controller.language.titles[tag]);
		langTag.val(controller.language.titles[tag]);

	}

	// zTree加载时自动生成ID，这边得特殊处理
	if (exist('ivsTree_1_span'))
		$("#ivsTree_1_span").html(controller.language.titles["ivsTree_1_span"]);
	// 冒泡提示
	if (exist('ivsTree_2_span'))
		$("#ivsTree_2_span").html(controller.language.titles["ivsTree_2_span"]);
	$("#ivsTree_2_span").attr("title",
			controller.language.titles["ivsTree_2_span_tag"]);
	if (exist('ivsTree_3_span'))
		$("#ivsTree_3_span").html(controller.language.titles["ivsTree_3_span"]);
	$("#ivsTree_3_span").attr("title",
			controller.language.titles["ivsTree_3_span_tag"]);
	if (exist('ivsTree_4_span'))
		$("#ivsTree_4_span").html(controller.language.titles["ivsTree_4_span"]);
	$("#ivsTree_4_span").attr("title",
			controller.language.titles["ivsTree_4_span_tag"]);
	// if (exist('ivsTree_5_span'))
	// $("#ivsTree_5_span").html(controller.language.titles["ivsTree_5_span"]);
	// if (exist('ivsTree_6_span'))
	// $("#ivsTree_6_span").html(controller.language.titles["ivsTree_6_span"]);
	// $("#ivsTree_6_span").attr("title",
	// controller.language.titles["ivsTree_6_span_tag"]);

	// 状态显示特殊处理，因只有调用接口后才会展示，这边需要作判断是否显示
	statusChange();

	// 页面参数校验错误信息在切换语言时清空
	clearTip();
}

function statusChange() {
	if (exist('getAlarm_status') && "" == $("#getAlarm_status").val()) {
		$("#getAlarm_status").html("");
	}
	if (exist('diskNumberErrTip') && "" == $("#diskNumberErrTip").val()) {
		$("#diskNumberErrTip").html("");
	}
	if (exist('diskpool_status') && "" == $("#diskpool_status").val()) {
		$("#diskpool_status").html("");
	}
	if (exist('storagepool_status') && "" == $("#storagepool_status").val()) {
		$("#storagepool_status").html("");
	}
	if (exist('LUN_status') && "" == $("#LUN_status").val()) {
		$("#LUN_status").html("");
	}
	if (exist('LUNGroup_status') && "" == $("#LUNGroup_status").val()) {
		$("#LUNGroup_status").html("");
	}
	if (exist('Host_status') && "" == $("#Host_status").val()) {
		$("#Host_status").html("");
	}
	if (exist('HostGroup_status') && "" == $("#HostGroup_status").val()) {
		$("#HostGroup_status").html("");
	}
	if (exist('PortGroup_status') && "" == $("#PortGroup_status").val()) {
		$("#PortGroup_status").html("");
	}
	if (exist('MappingView_status') && "" == $("#MappingView_status").val()) {
		$("#MappingView_status").html("");
	}
}

function clearTip() {
	// alarm
	if (exist('usernameErrTip'))
		$("#usernameErrTip").html("");
	if (exist('passwordErrTip'))
		$("#passwordErrTip").html("");
	if (exist('ipErrTip'))
		$("#ipErrTip").html("");
	if (exist('storagepoolNameErrTip'))
		$("#storagepoolNameErrTip").html("");
	if (exist('diskpoolIdErrTip'))
		$("#diskpoolIdErrTip").html("");
	if (exist('portErrTip'))
		$("#portErrTip").html("");
	if (exist('userConsumedCapacityThresholdErrTip'))
		$("#userConsumedCapacityThresholdErrTip").html("");
	if (exist('diskpoolcapacityErrTip'))
		$("#diskpoolcapacityErrTip").html("");
	if (exist('lunnameErrTip'))
		$("#lunnameErrTip").html("");
	if (exist('storagepoolIdErrTip'))
		$("#storagepoolIdErrTip").html("");
	if (exist('lunCapacityErrTip'))
		$("#lunCapacityErrTip").html("");
	if (exist('lunGroupnameErrTip'))
		$("#lunGroupnameErrTip").html("");
	if (exist('hostGroupnameErrTip'))
		$("#hostGroupnameErrTip").html("");
	if (exist('hostnameErrTip'))
		$("#hostnameErrTip").html("");
	if (exist('portGroupnameErrTip'))
		$("#portGroupnameErrTip").html("");
	if (exist('hostgroupErrTip'))
		$("#hostgroupErrTip").html("");

	// device
	if (exist('deviceTypeErrTip'))
		$("#deviceTypeErrTip").html("");
	if (exist('fromIndexErrTip'))
		$("#fromIndexErrTip").html("");
	if (exist('toIndexErrTip'))
		$("#toIndexErrTip").html("");
}

function appendInterface(functionName) {
	if ("createview_main" == functionName) {
		$(function() {
			$
					.ajax({
						type : "get",
						cache : false,
						url : "/eSDK_OpenAPI_Demo_BS_JAVA/pages/interface/createview_main.html",
						async : false,
						success : function(data) {
							$("#main1").html(data);
						}
					});
		});

	} else if ("createMappingView" == functionName) {
		$(function() {
			$
					.ajax({
						type : "get",
						cache : false,
						url : "/eSDK_OpenAPI_Demo_BS_JAVA/pages/interface/createview.html",
						async : false,
						success : function(data) {
							$("#main1").html(data);
						}
					});
		});
	} else if ("getSystemInfo" == functionName) {
		$(function() {
			$
					.ajax({
						type : "get",
						cache : false,
						url : "/eSDK_OpenAPI_Demo_BS_JAVA/pages/interface/getsysteminfo.html",
						async : false,
						success : function(data) {
							$("#main1").html(data);
						}
					});
		});
	} else if ("getAlarmEventInfo" == functionName) {
		$(function() {
			$
					.ajax({
						type : "get",
						cache : false,
						url : "/eSDK_OpenAPI_Demo_BS_JAVA/pages/interface/getalarmeventinfo.html",
						async : false,
						success : function(data) {
							$("#main1").html(data);
						}
					});
		});
	}

	changeLang();
}

function clean() {
	// 当单击节点时，置空标签页
	$("#main1")
			.html(
					"<ul class='block'><li></li></ul><ul><li></li></ul><ul><li></li></ul>");
}

function exist(id) {
	var s = document.getElementById(id);
	if (s) {
		return true;
	} else {
		return false;
	}
}

function isEmpty(value) {
	if (null == value || "" == value) {
		return true;
	} else {
		return false;
	}
}

function isNumber(num) {
	var reNum = /^\d*$/;
	return (reNum.test(num));
}

function FixWidth(selectObj) {
	var newSelectObj = document.createElement("select");
	newSelectObj = selectObj.cloneNode(true);
	newSelectObj.selectedIndex = selectObj.selectedIndex;
	newSelectObj.onmouseover = null;

	var e = selectObj;
	var absTop = e.offsetTop;
	var absLeft = e.offsetLeft;
	while (e = e.offsetParent) {
		absTop += e.offsetTop;
		absLeft += e.offsetLeft;
	}
	with (newSelectObj.style) {
		position = "absolute";
		top = absTop + "px";
		left = absLeft + "px";
		width = "auto";
	}

	var rollback = function() {
		RollbackWidth(selectObj, newSelectObj);
	};
	if (window.addEventListener) {
		newSelectObj.addEventListener("blur", rollback, false);
		newSelectObj.addEventListener("change", rollback, false);
	} else {
		newSelectObj.attachEvent("onblur", rollback);
		newSelectObj.attachEvent("onchange", rollback);
	}

	selectObj.style.visibility = "hidden";
	document.body.appendChild(newSelectObj);
	newSelectObj.focus();
}

function RollbackWidth(selectObj, newSelectObj) {
	selectObj.selectedIndex = newSelectObj.selectedIndex;
	selectObj.style.visibility = "visible";
	document.body.removeChild(newSelectObj);
}

function login() {
	var username = $("#username").val();
	var password = $("#password").val();
	var ip = $("#ip").val();
	var port = $("#port").val();
	$("#getAlarm_status").html("");

	// 简单参数校验
	if (isEmpty(username)) {
		$("#usernameErrTip").html(controller.language.titles["userNameNull"]);
		return false;
	} else {
		$("#usernameErrTip").html("");
	}

	if (isEmpty(password)) {
		$("#passwordErrTip").html(controller.language.titles["passwordNull"]);
		return false;
	} else {
		$("#passwordErrTip").html("");
	}

	if (isEmpty(ip)) {
		$("#ipErrTip").html(controller.language.titles["ipNull"]);
		return false;
	} else {
		$("#ipErrTip").html("");
	}

	if (isEmpty(port)) {
		$("#portErrTip").html(controller.language.titles["portNull"]);
		return false;
	} else if (!isNumber(port)) {
		$("#portErrTip").html(controller.language.titles["portIsNumber"]);
		return false;
	} else {
		$("#portErrTip").html("");
	}
	$.ajax({
		url : "/eSDK_OpenAPI_Demo_BS_JAVA/openapiServlet",
		type : "post",
		dataType : "json",
		data : "&username=" + username + "&password=" + password + "&ip=" + ip
				+ "&port=" + port + "&method=login",
		async : false,
		success : function(data) {
			if (data == "success") {
				$("#login").hide();
				$("#loginSuccess").show();
				$("#loginUserName").html("登录用户: " + username);
				var treeObj = $.fn.zTree.getZTreeObj("ivsTree");  
				var nodes = treeObj.getNodes();  
				if (nodes.length>0) {  
				    var node = treeObj.getNodeByParam("id", 11);  
				    if (node) {  
				        treeObj.selectNode(node);  
				    }  
				} 
				appendInterface('createview_main');
			} else {
				$("#getAlarm_status").html(data);
			}
		},
		error : function(data) {
			$("#getAlarm_status").html(
					controller.language.titles["operationFailed"]);
		},
		beforeSend : function() {
			$("#getAlarm_status").html("");
		}
	});
}

function sourceCode(source) {
	$("#interfaceName").html(source.title);
	$.ajax({
		type : "get",
		cache : false,
		url : "/eSDK_OpenAPI_Demo_BS_JAVA/pages/sourcecode/" + source.id
				+ ".html",
		async : false,
		success : function(data) {
			$("#sourceCodeContext").html(data);
		}
	});
}

