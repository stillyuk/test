package cn.cupboys.velocity;

import java.io.PrintWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class HelloVelocity {
	public static void main(String[] args) throws Exception {
		Velocity.init("velocity.properties");
		VelocityContext context = new VelocityContext();
		context.put("link1", "a.htm");
		context.put("link2", "b.htm");
		context.put("link3", "c.htm");
		context.put("link4", "d.htm");
//		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		PrintWriter writer = new PrintWriter("D:/c.htm");
		Template template = Velocity.getTemplate("show.vm");
		template.merge(context, writer);
//		writer.flush();
//		writer.close();
	}
}
