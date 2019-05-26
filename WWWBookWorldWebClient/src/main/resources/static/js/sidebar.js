require(['jquery'], function($) {
	$(".closeBtn").click( 
			() => {
				$(".openBtn").show();
				$(".sidebar").width(0);
				$(".main-container").width("100%");
			});
	$(".openBtn").click( 
			() => {
				$(".openBtn").hide();
				$(".sidebar").width("250px");
				$(".main-container").width("100%").width("-=250px");
			});
});