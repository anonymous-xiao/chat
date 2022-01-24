window.app = {
	isNotNull: function(str){
		if(str != null && str != "" && str != undefined) {
			return true;
		}
		return false;
	},
	
	showToast: function(msg, type) {
		plus.nativeUI.toast(msg, 
		{icon: "image/" + type + ".png", verticalAlign: "center"},
		)
	}
}