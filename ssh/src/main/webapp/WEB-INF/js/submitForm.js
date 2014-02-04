
function submit(formName) {
	$.ajax({
		async: false,
		type: "POST",
		url: "",
		data: {
			"username" : $("#username").val(),
			"password" : $("#password").val()
		},
		success: function() {
			
		},
		error: function() {
			
		},
		dataType: "text"
	});
}
