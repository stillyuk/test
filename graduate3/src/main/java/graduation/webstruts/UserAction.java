package graduation.webstruts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author jiangyukun
 * @since 2014-03-12 13:59
 */
@SuppressWarnings("serial")
public class UserAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		addActionError("aaa");
		return super.execute();
	}
}
