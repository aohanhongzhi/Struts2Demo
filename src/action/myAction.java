package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 在这个项目里我们更应该关注“业务该怎么处理”这个问题，而不应该把大多数精力放在调试jsp到Servlet之类的跳转上。
 * Struts为我们提供了一套跳转机制，我们可以简单的通过编写struts.xml和web.xml，就能比较省心地实现从前端jsp跳转到具体业务处理类的功能。而且，也只需在Action类里面编写返回字符串，
 * 同时在Struts.xml里编写返回字符串和跳转页面的对应关系，就只能根据业务执行结果方便地跳转回前端页面。
 * @author yz
 *
 */


public class myAction extends ActionSupport {
	private String num1;//这样就可以接受jsp端传过来的任何类型的参数
	private String num2;
	private int n1;
	private int n2;
	
	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}
	//有这个方法会自动生成一个sum的属性，这样negative.jsp页面就可以直接获取sum这个属性的值了
	public int getSum() {
		return n1+n2;
	}

	public String execute() throws Exception{
		
		if(getSum()>=0) {
			return "Positive";
		}
		else {
			return "Negative";
		}
		
	}
	
	public void validate() {
		try {
			n1=Integer.valueOf(num1);
		} catch (Exception e) {
			addFieldError("num1", "num1 is not number.");
		}
		try {
			n2=Integer.valueOf(num2);
		} catch (Exception e) {
			addFieldError("num2", "num2 is not number.");
		}
	}

}
