$(function() {
	$("#username").blur(function() {
		$.ajax({
			url : "checkUsername",
			data : {
				username : $("#username").val()
			},
			success : function(data) {
				$("#tip").text(data).css("color", "red");
			}
		});
	});
});
