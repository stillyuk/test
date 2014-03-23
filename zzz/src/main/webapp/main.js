function AddFavorite(url, sitename) {
    var url = window.location;
    var sitename = document.title;
    if (document.all) {
        window.external.AddFavorite(url, sitename);
    }
    else if (window.sidebar) {
        window.sidebar.addPanel(sitename, url, "");
    }
}
//设为首页
function SetHome(obj,vrl)
{
	try
	{
			obj.style.behavior='url(#default#homepage)';obj.setHomePage(vrl);
	}
	catch(e){
			if(window.netscape) {
					try {
							netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
					}
					catch (e) {
							alert("此操作被浏览器拒绝！\n请在浏览器地址栏输入“about:config”并回车\n然后将[signed.applets.codebase_principal_support]设置为'true'");
					}
					var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);
					prefs.setCharPref('browser.startup.homepage',vrl);
			 }
	}
}
//刷新页面
function reload() {
	window.location.reload();
}