$(function() {
	$("#search").focus(function() {
		$(this).keyup(function() {
			if ($(this).val() != "") {
				$("#tip").hide();
			}
		});
		$(this).animate({
			width : "400px"
		}, 400);
	});
	$("#search").blur(function() {
		$(this).animate({
			width : "200px"
		}, 400);
	});
	$("#search").keyup(function() {
		if ($(this).val() === "") {
			$("#tip").show();
		}
	});
});