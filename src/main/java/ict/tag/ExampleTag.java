package ict.tag;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.PageContext;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import sun.jvm.hotspot.debugger.Page;

import java.io.IOException;

public class ExampleTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        try {
            PageContext pageContext = (PageContext) getJspContext();
            JspWriter out = pageContext.getOut();
            out.print("Custom tag example"+  "(ExampleTag)");
        } catch (IOException e) {

        }
    }
}
